package com.modcom.radio_time_date_ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //radio Buttons, date and time picker

        buttonbooking.setOnClickListener{
            //which radio button was selected
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

            //time picker
            time.setOnTimeChangedListener{view, hour, minute->
                Toast.makeText(applicationContext, "You selected  Time $hour : $minute", Toast.LENGTH_LONG).show()
            }


            
            Toast.makeText(applicationContext, "You selected  ${radio.text}  Your Names $names", Toast.LENGTH_LONG).show()

        }//ends button listener



    }//end oncreate
}