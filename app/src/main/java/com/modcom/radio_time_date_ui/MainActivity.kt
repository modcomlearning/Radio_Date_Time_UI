package com.modcom.radio_time_date_ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.RadioButton
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //radio Buttons, date and time picker
        //our spinner is not populated with counties
        val counties = arrayOf("Nairobi","Nakuru","Mombasa","Narok","Meru","Kajiado")
        val arrayAdapter: ArrayAdapter<*>

        //create the adapter and pass the counties
        arrayAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, counties)

        //put the adapter to the spinner
        spincounty.adapter = arrayAdapter


        buttonbooking.setOnClickListener{
            //which radio button was selected
            //capture the selected county from the spinner
            val county = spincounty.selectedItem.toString() //************


            val radio: RadioButton = findViewById(radiogroup.checkedRadioButtonId)

            //how to capture the names
            val names = edit_names.text.toString()

            //how to capture time/date
            //ill be on audio shortly
            //first we get todays date
            val today = Calendar.getInstance()
            date.init(today.get(Calendar.YEAR), today.get(Calendar.MONTH), today.get(Calendar.DAY_OF_MONTH))
            {
                view, year, month, day ->
                val month = month + 1
                Toast.makeText(applicationContext, "You selected  Date $day/$month/$year ", Toast.LENGTH_LONG).show()

            }

            //time picker  24hours
            time.setOnTimeChangedListener{view, hour, minute ->
                Toast.makeText(applicationContext, "You selected  Time $hour : $minute", Toast.LENGTH_LONG).show()
            }


            //************
            Toast.makeText(applicationContext, "You selected  ${radio.text}  Your Names $names  County $county", Toast.LENGTH_LONG).show()

        }//ends button listener



    }//end oncreate
}