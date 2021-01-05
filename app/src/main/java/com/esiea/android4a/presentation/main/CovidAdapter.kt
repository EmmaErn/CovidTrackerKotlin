package com.esiea.android4a.presentation.main
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.esiea.android4a.R
import com.esiea.android4a.data.local.models.CellClickListener
import com.esiea.android4a.data.local.models.CovidCase

class CovidAdapter(private val caseList: List<CovidCase>,private val cellClickListener: CellClickListener) : RecyclerView.Adapter<CovidAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val view  = LayoutInflater.from(parent.context).inflate(R.layout.covid_item,parent,false)
        return ViewHolder(view)
    }


    override fun getItemCount(): Int {

        return caseList.size
    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        Log.d("Response", "List Count :${caseList.size} ")

        var item : CovidCase = caseList[position]
        holder.itemView.setOnClickListener {
            cellClickListener.onCellClickListener(item)
        }
        return holder.bind(caseList[position])

    }
    class ViewHolder(itemView : View) :RecyclerView.ViewHolder(itemView) {



        private var countryView: TextView? = null
        private var cityView: TextView? = null

        init {
            countryView= itemView.findViewById(R.id.countryLine)
            cityView = itemView.findViewById(R.id.cityLine)
        }

        fun bind(covidCase: CovidCase) {
            countryView?.text = covidCase.Country
            cityView?.text = covidCase.Province
        }
    }
}