package com.example.unitconverter1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class temp_main : AppCompatActivity() {
    val dbcon:dbconnection=dbconnection(this@temp_main,"dbunitcon",1)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_temp_main)

        val submit = findViewById<Button>(R.id.btnsubmit)
        submit.setOnClickListener {
            core()
        }
    }

    override fun onResume() {
        super.onResume()

        var autocompleteTV = findViewById<AutoCompleteTextView>(R.id.autocompletetextview)
            val len = resources.getStringArray(R.array.temp_units)
            val arrayAdapter = ArrayAdapter(this, R.layout.length_dropdown, len)
            autocompleteTV.setAdapter(arrayAdapter)

        var autocompleteTV1 = findViewById<AutoCompleteTextView>(R.id.autocompletetextview1)
            val len1 = resources.getStringArray(R.array.temp_units)
            val arrayAdapter1 = ArrayAdapter(this, R.layout.length_dropdown1, len1)
            autocompleteTV1.setAdapter(arrayAdapter1)

        if (parent == autocompleteTV) {
            autocompleteTV.setAdapter(arrayAdapter)
        } else if (parent == autocompleteTV1) {
            autocompleteTV1.setAdapter(arrayAdapter1)
        }

        val submit = findViewById<Button>(R.id.btnsubmit)
        submit.setOnClickListener {
            core()
        }
    }

    fun core() {
        var actv = findViewById<AutoCompleteTextView>(R.id.autocompletetextview).text.toString()
        var actv1 = findViewById<AutoCompleteTextView>(R.id.autocompletetextview1).text.toString()
        var inputdata = findViewById<EditText>(R.id.inputdata).text.toString()

        if(actv.isNullOrEmpty() || actv1.isNullOrEmpty() || inputdata.equals("0"))
        {
            Toast.makeText(applicationContext, "Please fill in all the Feilds", Toast.LENGTH_SHORT).show()
        }
        else
        {
        var idata = inputdata.toDouble()
        println(idata)
        val answer = findViewById<TextView>(R.id.ans)

        val unit = findViewById<TextView>(R.id.unit)
        unit.setText(actv1)

        if (actv == "Celsius")
        {
            if (actv1 == "Celsius")
            {
                var a = (idata).toString()
                answer.setText(a)
            }
            else if (actv1 == "Fahrenheit")
            {
                val cursor=dbcon.display_temp(2)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0) {
                    while (cursor.moveToNext()) {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()

                    var a = ((idata * 9 / 5) + d).toString()
                    answer.setText(a)
                }
            }
            else if (actv1 == "kelvin")
            {
                val cursor=dbcon.display_temp(3)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    var a = (idata + d).toString()
                    answer.setText(a)
                }
            }
        }//
        else if (actv == "Fahrenheit")
        {
            if (actv1 == "Celsius")
            {
                val cursor=dbcon.display_temp(2)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0) {
                    while (cursor.moveToNext()) {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()

                    var a = ((idata - d) * 5 / 9).toString()
                    answer.setText(a)
                }
            }
            else if (actv1 == "Fahrenheit")
            {
                var a = (idata).toString()
                answer.setText(a)
            }
            else if (actv1 == "kelvin")
            {
                var c:Double = 0.0
                val cursor=dbcon.display_temp(2)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                     c = d
                }
                cursor.close()
                val cursor1=dbcon.display_temp(3)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a = ((idata - c) * 5 / 9 + d1).toString()
                    answer.setText(a)
                }
                cursor1.close()
            }
        }//
        else if (actv == "kelvin")
        {
            if (actv1 == "Celsius")
            {
                val cursor=dbcon.display_temp(3)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    var a = (idata - d).toString()
                    answer.setText(a)
                }
                cursor.close()
            }
            else if (actv1 == "Fahrenheit")
            {
                var c:Double = 0.0
                val cursor=dbcon.display_temp(2)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    c = d
                }
                cursor.close()
                val cursor1=dbcon.display_temp(3)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a = ((idata - d1) * 9 / 5 + c).toString()
                    answer.setText(a)
                }
                cursor1.close()
            }
            else if (actv1 == "kelvin")
            {
                var a = (idata).toString()
                answer.setText(a)
            }
        }//
        }
    }
}