package com.esiea.android4a.presentation.main

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.core.app.NotificationCompat.EXTRA_PEOPLE
import androidx.recyclerview.widget.GridLayoutManager
import com.esiea.android4a.R
import com.esiea.android4a.data.local.models.CellClickListener
import com.esiea.android4a.data.local.models.CovidCase
import com.esiea.android4a.data.local.models.CovidService
import com.esiea.android4a.data.local.models.ServiceBuilder

import kotlinx.android.synthetic.main.activity_next.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
class NextActivity : AppCompatActivity(), CellClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_next)

        loadCountries(this)

        }
   override fun onCellClickListener(data : CovidCase) {
        Toast.makeText(this,"Cell clicked", Toast.LENGTH_SHORT).show()
       val intent = Intent(this, LastActivity::class.java)
       intent.putExtra(EXTRA_PEOPLE, data)
       startActivity(intent)
    }
    private fun loadCountries(cellClickListener: CellClickListener) {
        //initiate the service
        val destinationService  = ServiceBuilder.buildService(CovidService::class.java)
        val requestCall =destinationService.getAffectedFoodList()
        //make network call asynchronously
        requestCall.enqueue(object : Callback<List<CovidCase>>{
            override fun onResponse(call: Call<List<CovidCase>>, response: Response<List<CovidCase>>) {
                Log.d("Response", "onResponse: ${response.body()}")
                if (response.isSuccessful){
                    val foodList  = response.body()!!
                    Log.d("Content", "countrylist size : $foodList")
                    Log.d("Response", "countrylist size : ${foodList.size}")
                    recycler_view.apply {
                        setHasFixedSize(true)
                        layoutManager = GridLayoutManager(this@NextActivity,2)
                        adapter = CovidAdapter(response.body()!!,cellClickListener)
                    }
                }else{
                    Toast.makeText(this@NextActivity, "Something went wrong oups ${response.message()}", Toast.LENGTH_SHORT).show()
                }
            }
            override fun onFailure(call: Call<List<CovidCase>>, t: Throwable) {
                Toast.makeText(this@NextActivity, "Something went wrong $t", Toast.LENGTH_SHORT).show()
            }
        })
    }
}



