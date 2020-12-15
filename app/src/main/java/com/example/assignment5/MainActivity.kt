package com.example.assignment5

import android.app.DatePickerDialog
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class MainActivity : AppCompatActivity() {
    private lateinit var date:EditText
    private lateinit var dob : EditText
    private lateinit var btncalculate : Button
    private lateinit var resultdate : EditText
    private lateinit var resultdob : EditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        date = findViewById(R.id.date)
        dob = findViewById(R.id.dob)
        btncalculate=findViewById(R.id.btncalculate)
        resultdate=findViewById(R.id.resultdate)
        resultdob=findViewById(R.id.resultdob)

        date.setOnClickListener{
            loadCalender()
        }
        dob.setOnClickListener{
            loaddob()
        }

    }
    private fun loadCalender(){
        val c = Calendar.getInstance()
        val year1 = c.get(Calendar.YEAR)
        val month1 = c. get(Calendar.MONTH)
        val day1 = c.get(Calendar.DATE)

        val datePickerDialog=DatePickerDialog(
            this, DatePickerDialog.OnDateSetListener { view, year, month, day ->
                date.setText("$year:${month+1}:$day")
                resultdate.setText("You worked for ${year1-year} year ${month1-(month)} month.")

            },
            year1,
            month1,
            day1

        )
        datePickerDialog.show()
    }
    private fun loaddob(){
        val c = Calendar.getInstance()
        val year1 = c.get(Calendar.YEAR)
        val month1 = c.get(Calendar.MONTH)
        val day1 = c.get(Calendar.DATE)

        val datePickerDialog=DatePickerDialog(
            this, DatePickerDialog.OnDateSetListener { view, year, month, day ->
              dob.setText("$year:${month+1}:$day")
            resultdob.setText(" You are ${year1-year} year and ${month1-(month)} month old.")

            },
                year1,
                month1,
                day1

        )
        datePickerDialog.show()
    }

    }
