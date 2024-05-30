package com.example.unitconverter1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class speed_main : AppCompatActivity() {
    val dbcon: dbconnection = dbconnection(this@speed_main, "dbunitcon", 1)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_speed_main)

        val submit = findViewById<Button>(R.id.btnsubmit)
        submit.setOnClickListener {
            core()
        }
    }

    override fun onResume() {
        super.onResume()

        var autocompleteTV = findViewById<AutoCompleteTextView>(R.id.autocompletetextview)
            val len = resources.getStringArray(R.array.speed_units)
            val arrayAdapter = ArrayAdapter(this, R.layout.length_dropdown, len)
            autocompleteTV.setAdapter(arrayAdapter)

        var autocompleteTV1 = findViewById<AutoCompleteTextView>(R.id.autocompletetextview1)
        val len1 = resources.getStringArray(R.array.speed_units)
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

        if(actv.isNullOrEmpty() || actv1.isNullOrEmpty() || inputdata.isNullOrEmpty())
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

        if (actv == "m/s")
        {
            if (actv1 == "m/s")
            {
                var a = (idata).toString()
                answer.setText(a)
            }
            else if (actv1 == "ft/s")
            {
                val cursor=dbcon.display_speed(2)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    var a = (idata * d).toString()
                    answer.setText(a)
                }
            }
            else if (actv1 == "km/s")
            {
                val cursor=dbcon.display_speed(3)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    var a = (idata * d).toString()
                    answer.setText(a)
                }
            }
            else if (actv1 == "m/min")
            {
                val cursor=dbcon.display_speed(4)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    var a = (idata * d).toString()
                    answer.setText(a)
                }
            }
            else if (actv1 == "ft/min")
            {
                val cursor=dbcon.display_speed(5)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    var a = (idata * d).toString()
                    answer.setText(a)
                }
            }
            else if (actv1 == "km/min")
            {
                val cursor=dbcon.display_speed(6)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    var a = (idata * d).toString()
                    answer.setText(a)
                }
            }
            else if (actv1 == "km/h")
            {
                val cursor=dbcon.display_speed(7)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    var a = (idata * d).toString()
                    answer.setText(a)
                }
            }
            else if (actv1 == "mi/h(mph)")
            {
                val cursor=dbcon.display_speed(8)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    var a = (idata * d).toString()
                    answer.setText(a)
                }
            }
            else if (actv1 == "knot")
            {
                val cursor=dbcon.display_speed(9)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    var a = (idata * d).toString()
                    answer.setText(a)
                }
            }
            else if (actv1 == "min/km")
            {
                val cursor=dbcon.display_speed(10)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    var a = (d / idata).toString()
                    answer.setText(a)
                }
            }
            else if (actv1 == "min/mile")
            {
                val cursor=dbcon.display_speed(11)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    var a = (d / idata).toString()
                    answer.setText(a)
                }
            }
        }//
        else if (actv == "ft/s")
        {
            if (actv1 == "m/s") {
                val cursor=dbcon.display_speed(2)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    var a = (idata / d).toString()
                    answer.setText(a)
                }
            }
            else if (actv1 == "ft/s")
            {
                var a = (idata).toString()
                answer.setText(a)
            }
            else if (actv1 == "km/s")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_speed(2)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_speed(3)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (a * d1 ).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "m/min")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_speed(2)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_speed(4)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (a * d1 ).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "ft/min")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_speed(2)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_speed(5)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (a * d1 ).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "km/min")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_speed(2)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_speed(6)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (a * d1 ).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "km/h")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_speed(2)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_speed(7)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (a * d1 ).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "mi/h(mph)")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_speed(2)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_speed(8)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (a * d1 ).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "knot")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_speed(2)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_speed(9)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (a * d1 ).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "min/km")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_speed(2)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_speed(10)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (d1 / a ).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "min/mile")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_speed(2)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_speed(11)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (d1 / a).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
        }//
        else if (actv == "km/s")
        {
            if (actv1 == "m/s") {
                val cursor=dbcon.display_speed(3)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    var a = (idata / d).toString()
                    answer.setText(a)
                }
            }
            else if (actv1 == "ft/s")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_speed(3)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_speed(2)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (a * d1 ).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "km/s")
            {
                var a = (idata).toString()
                answer.setText(a)
            }
            else if (actv1 == "m/min")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_speed(3)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_speed(4)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (a * d1 ).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "ft/min")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_speed(3)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_speed(5)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (a * d1 ).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "km/min")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_speed(3)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_speed(6)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (a * d1 ).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "km/h")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_speed(3)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_speed(7)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (a * d1 ).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "mi/h(mph)")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_speed(3)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_speed(8)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (a * d1 ).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "knot")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_speed(3)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_speed(9)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (a * d1 ).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "min/km")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_speed(3)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_speed(10)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (d1 / a).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "min/mile")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_speed(3)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_speed(11)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (d1 / a).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
        }//
        else if (actv == "m/min")
        {
            if (actv1 == "m/s") {
                val cursor=dbcon.display_speed(4)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    var a = (idata / d).toString()
                    answer.setText(a)
                }
            }
            else if (actv1 == "ft/s")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_speed(4)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_speed(2)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (a * d1 ).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "km/s")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_speed(4)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_speed(3)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (a * d1 ).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "m/min")
            {
                var a = (idata).toString()
                answer.setText(a)
            }
            else if (actv1 == "ft/min")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_speed(4)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_speed(5)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (a * d1 ).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "km/min")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_speed(4)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_speed(6)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (a * d1 ).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "km/h")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_speed(4)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_speed(7)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (a * d1 ).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "mi/h(mph)")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_speed(4)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_speed(8)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (a * d1 ).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "knot")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_speed(4)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_speed(9)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (a * d1 ).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "min/km")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_speed(4)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_speed(10)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (d1 / a).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "min/mile")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_speed(4)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_speed(11)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (d1 / a).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
        }//
        else if (actv == "ft/min")
        {
            if (actv1 == "m/s") {
                val cursor=dbcon.display_speed(5)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    var a = (idata / d).toString()
                    answer.setText(a)
                }
            }
            else if (actv1 == "ft/s")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_speed(5)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_speed(2)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (a * d1 ).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "km/s")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_speed(5)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_speed(3)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (a * d1 ).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "m/min")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_speed(5)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_speed(4)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (a * d1 ).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "ft/min")
            {
                var a = (idata).toString()
                answer.setText(a)
            }
            else if (actv1 == "km/min")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_speed(5)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_speed(6)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (a * d1 ).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "km/h")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_speed(5)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_speed(7)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (a * d1 ).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "mi/h(mph)")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_speed(5)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_speed(8)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (a * d1 ).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "knot")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_speed(5)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_speed(9)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (a * d1 ).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "min/km")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_speed(5)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_speed(10)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (d1 / a).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "min/mile")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_speed(5)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_speed(11)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (d1 / a).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
        }//
        else if (actv == "km/min")
        {
            if (actv1 == "m/s") {
                val cursor=dbcon.display_speed(6)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    var a = (idata / d).toString()
                    answer.setText(a)
                }
            }
            else if (actv1 == "ft/s")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_speed(6)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_speed(2)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (a * d1 ).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "km/s")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_speed(6)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_speed(3)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (a * d1 ).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "m/min")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_speed(6)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_speed(4)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (a * d1 ).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "ft/min")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_speed(6)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_speed(5)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (a * d1 ).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "km/min")
            {
                var a = (idata).toString()
                answer.setText(a)
            }
            else if (actv1 == "km/h")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_speed(6)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_speed(7)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (a * d1 ).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "mi/h(mph)")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_speed(6)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_speed(8)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (a * d1 ).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "knot")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_speed(6)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_speed(9)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (a * d1 ).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "min/km")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_speed(6)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_speed(10)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (d1 / a).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "min/mile")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_speed(6)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_speed(11)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (d1 / a).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
        }//
        else if (actv == "km/h")
        {
            if (actv1 == "m/s") {
                val cursor=dbcon.display_speed(7)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    var a = (idata / d).toString()
                    answer.setText(a)
                }
            }
            else if (actv1 == "ft/s")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_speed(7)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_speed(2)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (a * d1 ).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "km/s")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_speed(7)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_speed(3)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (a * d1 ).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "m/min")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_speed(7)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_speed(4)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (a * d1 ).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "ft/min")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_speed(7)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_speed(5)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (a * d1 ).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "km/min")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_speed(7)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_speed(6)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (a * d1 ).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "km/h")
            {
                var a = (idata).toString()
                answer.setText(a)
            }
            else if (actv1 == "mi/h(mph)")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_speed(7)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_speed(8)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (a * d1 ).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "knot")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_speed(7)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_speed(9)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (a * d1 ).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "min/km")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_speed(7)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_speed(10)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (d1 / a).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "min/mile")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_speed(7)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_speed(11)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (d1 / a).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
        }//
        else if (actv == "mi/h(mph)")
        {
            if (actv1 == "m/s") {
                val cursor=dbcon.display_speed(8)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    var a = (idata / d).toString()
                    answer.setText(a)
                }
            }
            else if (actv1 == "ft/s")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_speed(8)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_speed(2)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (a * d1 ).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "km/s")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_speed(8)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_speed(3)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (a * d1 ).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "m/min")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_speed(8)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_speed(4)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (a * d1 ).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "ft/min")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_speed(8)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_speed(5)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (a * d1 ).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "km/min")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_speed(8)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_speed(6)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (a * d1 ).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "km/h")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_speed(8)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_speed(7)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (a * d1 ).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "mi/h(mph)")
            {
                var a = (idata).toString()
                answer.setText(a)
            }
            else if (actv1 == "knot")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_speed(8)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_speed(9)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (a * d1 ).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "min/km")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_speed(8)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_speed(10)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (d1 / a).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "min/mile")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_speed(8)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_speed(11)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (d1 / a).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
        }//
        else if (actv == "knot")
        {
            if (actv1 == "m/s") {
                val cursor=dbcon.display_speed(9)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    var a = (idata / d).toString()
                    answer.setText(a)
                }
            }
            else if (actv1 == "ft/s")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_speed(9)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_speed(2)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (a * d1 ).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "km/s")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_speed(9)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_speed(3)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (a * d1 ).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "m/min")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_speed(9)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_speed(4)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (a * d1 ).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "ft/min")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_speed(9)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_speed(5)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (a * d1 ).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "km/min")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_speed(9)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_speed(6)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (a * d1 ).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "km/h")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_speed(9)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_speed(7)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (a * d1 ).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "mi/h(mph)")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_speed(9)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_speed(8)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (a * d1 ).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "knot")
            {
                var a = (idata).toString()
                answer.setText(a)
            }
            else if (actv1 == "min/km")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_speed(9)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_speed(10)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (d1 / a).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "min/mile")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_speed(9)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_speed(11)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (d1 / a).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
        }//
        else if (actv == "min/km")
        {
            if (actv1 == "m/s") {
                val cursor=dbcon.display_speed(10)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    var a = (idata / d).toString()
                    answer.setText(a)
                }
            }
            else if (actv1 == "ft/s")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_speed(10)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_speed(2)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (a * d1 ).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "km/s")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_speed(10)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_speed(3)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (a * d1 ).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "m/min")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_speed(10)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_speed(4)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (a * d1 ).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "ft/min")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_speed(10)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_speed(5)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (a * d1 ).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "km/min")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_speed(10)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_speed(6)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (a * d1 ).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "km/h")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_speed(10)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_speed(7)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (a * d1 ).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "mi/h(mph)")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_speed(10)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_speed(8)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (a * d1 ).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "knot")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_speed(10)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_speed(9)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (a * d1 ).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "min/km")
            {
                var a = (idata).toString()
                answer.setText(a)
            }
            else if (actv1 == "min/mile")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_speed(10)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (d / idata)
                }
                cursor.close()
                val cursor1=dbcon.display_speed(11)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (d1 / a).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
        }//
        else if (actv == "min/mile")
        {
            if (actv1 == "m/s") {
                val cursor=dbcon.display_speed(11)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    var a = (idata / d).toString()
                    answer.setText(a)
                }
            }
            else if (actv1 == "ft/s")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_speed(11)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_speed(2)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (a * d1 ).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "km/s")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_speed(11)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_speed(3)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (a * d1 ).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "m/min")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_speed(11)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_speed(4)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (a * d1 ).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "ft/min")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_speed(11)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_speed(5)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (a * d1 ).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "km/min")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_speed(11)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_speed(6)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (a * d1 ).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "km/h")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_speed(11)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_speed(7)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (a * d1 ).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "mi/h(mph)")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_speed(11)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_speed(8)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (a * d1 ).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "knot")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_speed(11)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_speed(9)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (a * d1 ).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "min/km")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_speed(11)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (d / idata)
                }
                cursor.close()
                val cursor1=dbcon.display_speed(10)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (d1 / a).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "min/mile")
            {
                var a = (idata).toString()
                answer.setText(a)
            }
        }//
        }
    }
}