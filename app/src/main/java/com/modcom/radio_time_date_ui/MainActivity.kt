package com.modcom.radio_time_date_ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //radio Buttons, date and time picker

        buttonbooking.setOnClickListener{
            //which radio button was selected
            val radio: RadioButton = findViewById(radiogroup.checkedRadioButtonId)
            Toast.makeText(applicationContext, "You selected  ${radio.text}", Toast.LENGTH_LONG).show()



        }



    }
}