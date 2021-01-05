package com.esiea.android4a.presentation.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.core.app.NotificationCompat.EXTRA_PEOPLE
import com.esiea.android4a.R
import com.esiea.android4a.data.local.models.CovidCase
import kotlinx.android.synthetic.main.activity_last.*

class LastActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_last)
        val data = intent.getSerializableExtra(EXTRA_PEOPLE) as CovidCase
        date.text = "Date : "+ data.Date
        mort.text = "Nombre de mort : "+ data.Deaths
        soigne.text = "Nombre de personne soignée : "+ data.Recovered
        confirme.text = "Nombre de cas : "+ data.Confirmed



            

    }
}