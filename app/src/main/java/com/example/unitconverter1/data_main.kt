package com.example.unitconverter1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class data_main : AppCompatActivity() {
    val dbcon:dbconnection=dbconnection(this@data_main,"dbunitcon",1)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data_main)

        val submit = findViewById<Button>(R.id.btnsubmit)
        submit.setOnClickListener {
            core()
        }
    }

    override fun onResume() {
        super.onResume()

        var autocompleteTV = findViewById<AutoCompleteTextView>(R.id.autocompletetextview)
        val len = resources.getStringArray(R.array.data_units)
            val arrayAdapter = ArrayAdapter(this, R.layout.length_dropdown, len)
            autocompleteTV.setAdapter(arrayAdapter)

        var autocompleteTV1 = findViewById<AutoCompleteTextView>(R.id.autocompletetextview1)
            val len1 = resources.getStringArray(R.array.data_units)
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

        if (actv == "bit")
        {
            if (actv1 == "bit")
            {
                var a = (idata).toString()
                answer.setText(a)
            }
            else if (actv1 == "Byte")
            {
                val cursor=dbcon.display_data(2)
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
            else if (actv1 == "kB")
            {
                val cursor=dbcon.display_data(3)
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
            else if (actv1 == "MB")
            {
                val cursor=dbcon.display_data(4)
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
            else if (actv1 == "GB")
            {
                val cursor=dbcon.display_data(5)
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
            else if (actv1 == "KiB")
            {
                val cursor=dbcon.display_data(6)
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
            else if (actv1 == "MiB")
            {
                val cursor=dbcon.display_data(7)
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
            else if (actv1 == "GiB")
            {
                val cursor=dbcon.display_data(8)
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
            else if (actv1 == "TiB")
            {
                val cursor=dbcon.display_data(9)
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
            else if (actv1 == "PiB")
            {
                val cursor=dbcon.display_data(10)
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
            else if (actv1 == "kbit/s")
            {
                val cursor=dbcon.display_data(11)
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
            else if (actv1 == "Mbit/s")
            {
                val cursor=dbcon.display_data(12)
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
            else if (actv1 == "Gbit/s")
            {
                val cursor=dbcon.display_data(13)
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
            else if (actv1 == "packet")
            {
                val cursor=dbcon.display_data(14)
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
        }//
        else if (actv == "Byte")
        {
            if (actv1 == "bit") {
                val cursor=dbcon.display_data(2)
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
            else if (actv1 == "Byte")
            {
                var a = (idata).toString()
                answer.setText(a)
            }
            else if (actv1 == "kB")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_data(2)
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
                val cursor1=dbcon.display_data(3)
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
            else if (actv1 == "MB")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_data(2)
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
                val cursor1=dbcon.display_data(4)
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
            else if (actv1 == "GB")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_data(2)
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
                val cursor1=dbcon.display_data(5)
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
            else if (actv1 == "KiB")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_data(2)
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
                val cursor1=dbcon.display_data(6)
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
            else if (actv1 == "MiB")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_data(2)
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
                val cursor1=dbcon.display_data(7)
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
            else if (actv1 == "GiB")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_data(2)
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
                val cursor1=dbcon.display_data(8)
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
            else if (actv1 == "TiB")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_data(2)
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
                val cursor1=dbcon.display_data(9)
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
            else if (actv1 == "PiB")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_data(2)
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
                val cursor1=dbcon.display_data(10)
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
            else if (actv1 == "kbit/s")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_data(2)
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
                val cursor1=dbcon.display_data(11)
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
            else if (actv1 == "Mbit/s")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_data(2)
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
                val cursor1=dbcon.display_data(12)
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
            else if (actv1 == "Gbit/s")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_data(2)
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
                val cursor1=dbcon.display_data(13)
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
            else if (actv1 == "packet")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_data(2)
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
                val cursor1=dbcon.display_data(14)
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
        }//
        else if (actv == "kB")
        {
            if (actv1 == "bit") {
                val cursor=dbcon.display_data(3)
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
            else if (actv1 == "Byte")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_data(3)
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
                val cursor1=dbcon.display_data(2)
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
            else if (actv1 == "kB")
            {
                var a = (idata).toString()
                answer.setText(a)
            }
            else if (actv1 == "MB")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_data(3)
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
                val cursor1=dbcon.display_data(4)
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
            else if (actv1 == "GB")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_data(3)
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
                val cursor1=dbcon.display_data(5)
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
            else if (actv1 == "KiB")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_data(3)
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
                val cursor1=dbcon.display_data(6)
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
            else if (actv1 == "MiB")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_data(3)
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
                val cursor1=dbcon.display_data(7)
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
            else if (actv1 == "GiB")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_data(3)
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
                val cursor1=dbcon.display_data(8)
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
            else if (actv1 == "TiB")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_data(3)
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
                val cursor1=dbcon.display_data(9)
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
            else if (actv1 == "PiB")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_data(3)
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
                val cursor1=dbcon.display_data(10)
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
            else if (actv1 == "kbit/s")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_data(3)
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
                val cursor1=dbcon.display_data(11)
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
            else if (actv1 == "Mbit/s")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_data(3)
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
                val cursor1=dbcon.display_data(12)
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
            else if (actv1 == "Gbit/s")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_data(3)
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
                val cursor1=dbcon.display_data(13)
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
            else if (actv1 == "packet")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_data(3)
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
                val cursor1=dbcon.display_data(14)
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
        }//
        else if (actv == "MB")
        {
            if (actv1 == "bit") {
                val cursor=dbcon.display_data(4)
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
            else if (actv1 == "Byte")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_data(4)
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
                val cursor1=dbcon.display_data(2)
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
            else if (actv1 == "kB")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_data(4)
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
                val cursor1=dbcon.display_data(3)
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
            else if (actv1 == "MB")
            {
                var a = (idata).toString()
                answer.setText(a)
            }
            else if (actv1 == "GB")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_data(4)
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
                val cursor1=dbcon.display_data(5)
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
            else if (actv1 == "KiB")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_data(4)
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
                val cursor1=dbcon.display_data(6)
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
            else if (actv1 == "MiB")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_data(4)
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
                val cursor1=dbcon.display_data(7)
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
            else if (actv1 == "GiB")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_data(4)
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
                val cursor1=dbcon.display_data(8)
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
            else if (actv1 == "TiB")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_data(4)
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
                val cursor1=dbcon.display_data(9)
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
            else if (actv1 == "PiB")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_data(4)
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
                val cursor1=dbcon.display_data(10)
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
            else if (actv1 == "kbit/s")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_data(4)
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
                val cursor1=dbcon.display_data(11)
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
            else if (actv1 == "Mbit/s")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_data(4)
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
                val cursor1=dbcon.display_data(12)
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
            else if (actv1 == "Gbit/s")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_data(4)
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
                val cursor1=dbcon.display_data(13)
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
            else if (actv1 == "packet")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_data(4)
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
                val cursor1=dbcon.display_data(14)
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
        }//
        else if (actv == "GB")
        {
            if (actv1 == "bit") {
                val cursor=dbcon.display_data(5)
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
            else if (actv1 == "Byte")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_data(5)
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
                val cursor1=dbcon.display_data(2)
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
            else if (actv1 == "kB")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_data(5)
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
                val cursor1=dbcon.display_data(3)
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
            else if (actv1 == "MB")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_data(5)
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
                val cursor1=dbcon.display_data(4)
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
            else if (actv1 == "GB")
            {
                var a = (idata).toString()
                answer.setText(a)
            }
            else if (actv1 == "KiB")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_data(5)
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
                val cursor1=dbcon.display_data(6)
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
            else if (actv1 == "MiB")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_data(5)
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
                val cursor1=dbcon.display_data(7)
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
            else if (actv1 == "GiB")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_data(5)
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
                val cursor1=dbcon.display_data(8)
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
            else if (actv1 == "TiB")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_data(5)
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
                val cursor1=dbcon.display_data(9)
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
            else if (actv1 == "PiB")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_data(5)
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
                val cursor1=dbcon.display_data(10)
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
            else if (actv1 == "kbit/s")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_data(5)
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
                val cursor1=dbcon.display_data(11)
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
            else if (actv1 == "Mbit/s")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_data(5)
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
                val cursor1=dbcon.display_data(12)
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
            else if (actv1 == "Gbit/s")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_data(5)
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
                val cursor1=dbcon.display_data(13)
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
            else if (actv1 == "packet")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_data(5)
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
                val cursor1=dbcon.display_data(14)
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
        }//
        else if (actv == "KiB")
        {
            if (actv1 == "bit") {
                val cursor=dbcon.display_data(6)
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
            else if (actv1 == "Byte")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_data(6)
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
                val cursor1=dbcon.display_data(2)
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
            else if (actv1 == "kB")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_data(6)
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
                val cursor1=dbcon.display_data(3)
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
            else if (actv1 == "MB")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_data(6)
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
                val cursor1=dbcon.display_data(4)
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
            else if (actv1 == "GB")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_data(6)
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
                val cursor1=dbcon.display_data(5)
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
            else if (actv1 == "KiB")
            {
                var a = (idata).toString()
                answer.setText(a)
            }
            else if (actv1 == "MiB")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_data(6)
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
                val cursor1=dbcon.display_data(7)
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
            else if (actv1 == "GiB")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_data(6)
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
                val cursor1=dbcon.display_data(8)
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
            else if (actv1 == "TiB")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_data(6)
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
                val cursor1=dbcon.display_data(9)
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
            else if (actv1 == "PiB")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_data(6)
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
                val cursor1=dbcon.display_data(10)
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
            else if (actv1 == "kbit/s")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_data(6)
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
                val cursor1=dbcon.display_data(11)
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
            else if (actv1 == "Mbit/s")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_data(6)
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
                val cursor1=dbcon.display_data(12)
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
            else if (actv1 == "Gbit/s")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_data(6)
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
                val cursor1=dbcon.display_data(13)
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
            else if (actv1 == "packet")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_data(6)
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
                val cursor1=dbcon.display_data(14)
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
        }//
        else if (actv == "MiB")
        {
            if (actv1 == "bit") {
                val cursor=dbcon.display_data(7)
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
            else if (actv1 == "Byte")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_data(7)
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
                val cursor1=dbcon.display_data(2)
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
            else if (actv1 == "kB")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_data(7)
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
                val cursor1=dbcon.display_data(3)
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
            else if (actv1 == "MB")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_data(7)
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
                val cursor1=dbcon.display_data(4)
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
            else if (actv1 == "GB")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_data(7)
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
                val cursor1=dbcon.display_data(5)
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
            else if (actv1 == "KiB")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_data(7)
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
                val cursor1=dbcon.display_data(6)
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
            else if (actv1 == "MiB")
            {
                var a = (idata).toString()
                answer.setText(a)
            }
            else if (actv1 == "GiB")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_data(7)
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
                val cursor1=dbcon.display_data(8)
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
            else if (actv1 == "TiB")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_data(7)
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
                val cursor1=dbcon.display_data(9)
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
            else if (actv1 == "PiB")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_data(7)
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
                val cursor1=dbcon.display_data(10)
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
            else if (actv1 == "kbit/s")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_data(7)
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
                val cursor1=dbcon.display_data(11)
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
            else if (actv1 == "Mbit/s")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_data(7)
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
                val cursor1=dbcon.display_data(12)
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
            else if (actv1 == "Gbit/s")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_data(7)
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
                val cursor1=dbcon.display_data(13)
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
            else if (actv1 == "packet")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_data(7)
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
                val cursor1=dbcon.display_data(14)
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
        }//
        else if (actv == "GiB")
        {
            if (actv1 == "bit") {
                val cursor=dbcon.display_data(8)
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
            else if (actv1 == "Byte")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_data(8)
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
                val cursor1=dbcon.display_data(2)
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
            else if (actv1 == "kB")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_data(8)
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
                val cursor1=dbcon.display_data(3)
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
            else if (actv1 == "MB")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_data(8)
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
                val cursor1=dbcon.display_data(4)
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
            else if (actv1 == "GB")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_data(8)
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
                val cursor1=dbcon.display_data(5)
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
            else if (actv1 == "KiB")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_data(8)
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
                val cursor1=dbcon.display_data(6)
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
            else if (actv1 == "MiB")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_data(8)
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
                val cursor1=dbcon.display_data(7)
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
            else if (actv1 == "GiB")
            {
                var a = (idata).toString()
                answer.setText(a)
            }
            else if (actv1 == "TiB")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_data(8)
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
                val cursor1=dbcon.display_data(9)
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
            else if (actv1 == "PiB")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_data(8)
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
                val cursor1=dbcon.display_data(10)
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
            else if (actv1 == "kbit/s")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_data(8)
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
                val cursor1=dbcon.display_data(11)
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
            else if (actv1 == "Mbit/s")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_data(8)
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
                val cursor1=dbcon.display_data(12)
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
            else if (actv1 == "Gbit/s")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_data(8)
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
                val cursor1=dbcon.display_data(13)
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
            else if (actv1 == "packet")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_data(8)
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
                val cursor1=dbcon.display_data(14)
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
        }//
        else if (actv == "TiB")
        {
            if (actv1 == "bit") {
                val cursor=dbcon.display_data(9)
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
            else if (actv1 == "Byte")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_data(9)
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
                val cursor1=dbcon.display_data(2)
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
            else if (actv1 == "kB")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_data(9)
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
                val cursor1=dbcon.display_data(3)
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
            else if (actv1 == "MB")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_data(9)
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
                val cursor1=dbcon.display_data(4)
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
            else if (actv1 == "GB")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_data(9)
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
                val cursor1=dbcon.display_data(5)
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
            else if (actv1 == "KiB")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_data(9)
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
                val cursor1=dbcon.display_data(6)
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
            else if (actv1 == "MiB")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_data(9)
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
                val cursor1=dbcon.display_data(7)
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
            else if (actv1 == "GiB")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_data(9)
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
                val cursor1=dbcon.display_data(8)
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
            else if (actv1 == "TiB")
            {
                var a = (idata).toString()
                answer.setText(a)
            }
            else if (actv1 == "PiB")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_data(9)
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
                val cursor1=dbcon.display_data(10)
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
            else if (actv1 == "kbit/s")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_data(9)
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
                val cursor1=dbcon.display_data(11)
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
            else if (actv1 == "Mbit/s")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_data(9)
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
                val cursor1=dbcon.display_data(12)
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
            else if (actv1 == "Gbit/s")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_data(9)
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
                val cursor1=dbcon.display_data(13)
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
            else if (actv1 == "packet")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_data(9)
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
                val cursor1=dbcon.display_data(14)
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
        }//
        else if (actv == "PiB")
        {
            if (actv1 == "bit") {
                val cursor=dbcon.display_data(10)
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
            else if (actv1 == "Byte")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_data(10)
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
                val cursor1=dbcon.display_data(2)
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
            else if (actv1 == "kB")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_data(10)
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
                val cursor1=dbcon.display_data(3)
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
            else if (actv1 == "MB")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_data(10)
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
                val cursor1=dbcon.display_data(4)
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
            else if (actv1 == "GB")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_data(10)
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
                val cursor1=dbcon.display_data(5)
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
            else if (actv1 == "KiB")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_data(10)
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
                val cursor1=dbcon.display_data(6)
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
            else if (actv1 == "MiB")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_data(10)
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
                val cursor1=dbcon.display_data(7)
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
            else if (actv1 == "GiB")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_data(10)
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
                val cursor1=dbcon.display_data(8)
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
            else if (actv1 == "TiB")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_data(10)
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
                val cursor1=dbcon.display_data(9)
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
            else if (actv1 == "PiB")
            {
                var a = (idata).toString()
                answer.setText(a)
            }
            else if (actv1 == "kbit/s")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_data(10)
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
                val cursor1=dbcon.display_data(11)
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
            else if (actv1 == "Mbit/s")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_data(10)
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
                val cursor1=dbcon.display_data(12)
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
            else if (actv1 == "Gbit/s")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_data(10)
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
                val cursor1=dbcon.display_data(13)
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
            else if (actv1 == "packet")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_data(10)
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
                val cursor1=dbcon.display_data(14)
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
        }//
        else if (actv == "kbit/s")
        {
            if (actv1 == "bit") {
                val cursor=dbcon.display_data(11)
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
            else if (actv1 == "Byte")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_data(11)
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
                val cursor1=dbcon.display_data(2)
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
            else if (actv1 == "kB")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_data(11)
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
                val cursor1=dbcon.display_data(3)
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
            else if (actv1 == "MB")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_data(11)
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
                val cursor1=dbcon.display_data(4)
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
            else if (actv1 == "GB")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_data(11)
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
                val cursor1=dbcon.display_data(5)
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
            else if (actv1 == "KiB")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_data(11)
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
                val cursor1=dbcon.display_data(6)
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
            else if (actv1 == "MiB")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_data(11)
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
                val cursor1=dbcon.display_data(7)
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
            else if (actv1 == "GiB")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_data(11)
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
                val cursor1=dbcon.display_data(8)
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
            else if (actv1 == "TiB")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_data(11)
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
                val cursor1=dbcon.display_data(9)
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
            else if (actv1 == "PiB")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_data(11)
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
                val cursor1=dbcon.display_data(10)
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
            else if (actv1 == "kbit/s")
            {
                var a = (idata).toString()
                answer.setText(a)
            }
            else if (actv1 == "Mbit/s")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_data(11)
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
                val cursor1=dbcon.display_data(12)
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
            else if (actv1 == "Gbit/s")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_data(11)
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
                val cursor1=dbcon.display_data(13)
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
            else if (actv1 == "packet")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_data(11)
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
                val cursor1=dbcon.display_data(14)
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
        }//
        else if (actv == "Mbit/s")
        {
            if (actv1 == "bit") {
                val cursor=dbcon.display_data(12)
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
            else if (actv1 == "Byte")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_data(12)
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
                val cursor1=dbcon.display_data(2)
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
            else if (actv1 == "kB")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_data(12)
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
                val cursor1=dbcon.display_data(3)
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
            else if (actv1 == "MB")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_data(12)
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
                val cursor1=dbcon.display_data(4)
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
            else if (actv1 == "GB")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_data(12)
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
                val cursor1=dbcon.display_data(5)
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
            else if (actv1 == "KiB")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_data(12)
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
                val cursor1=dbcon.display_data(6)
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
            else if (actv1 == "MiB")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_data(12)
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
                val cursor1=dbcon.display_data(7)
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
            else if (actv1 == "GiB")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_data(12)
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
                val cursor1=dbcon.display_data(8)
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
            else if (actv1 == "TiB")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_data(12)
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
                val cursor1=dbcon.display_data(9)
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
            else if (actv1 == "PiB")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_data(12)
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
                val cursor1=dbcon.display_data(10)
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
            else if (actv1 == "kbit/s")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_data(12)
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
                val cursor1=dbcon.display_data(11)
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
            else if (actv1 == "Mbit/s")
            {
                var a = (idata).toString()
                answer.setText(a)
            }
            else if (actv1 == "Gbit/s")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_data(12)
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
                val cursor1=dbcon.display_data(13)
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
            else if (actv1 == "packet")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_data(12)
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
                val cursor1=dbcon.display_data(14)
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
        }//
        else if (actv == "Gbit/s")
        {
            if (actv1 == "bit") {
                val cursor=dbcon.display_data(13)
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
            else if (actv1 == "Byte")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_data(13)
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
                val cursor1=dbcon.display_data(2)
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
            else if (actv1 == "kB")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_data(13)
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
                val cursor1=dbcon.display_data(3)
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
            else if (actv1 == "MB")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_data(13)
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
                val cursor1=dbcon.display_data(4)
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
            else if (actv1 == "GB")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_data(13)
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
                val cursor1=dbcon.display_data(5)
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
            else if (actv1 == "KiB")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_data(13)
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
                val cursor1=dbcon.display_data(6)
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
            else if (actv1 == "MiB")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_data(13)
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
                val cursor1=dbcon.display_data(7)
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
            else if (actv1 == "GiB")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_data(13)
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
                val cursor1=dbcon.display_data(8)
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
            else if (actv1 == "TiB")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_data(13)
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
                val cursor1=dbcon.display_data(9)
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
            else if (actv1 == "PiB")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_data(13)
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
                val cursor1=dbcon.display_data(10)
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
            else if (actv1 == "kbit/s")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_data(13)
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
                val cursor1=dbcon.display_data(11)
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
            else if (actv1 == "Mbit/s")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_data(13)
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
                val cursor1=dbcon.display_data(12)
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
            else if (actv1 == "Gbit/s")
            {
                var a = (idata).toString()
                answer.setText(a)
            }
            else if (actv1 == "packet")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_data(13)
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
                val cursor1=dbcon.display_data(14)
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
        }//
        else if (actv == "packet")
        {
            if (actv1 == "bit") {
                val cursor=dbcon.display_data(14)
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
            else if (actv1 == "Byte")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_data(14)
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
                val cursor1=dbcon.display_data(2)
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
            else if (actv1 == "kB")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_data(14)
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
                val cursor1=dbcon.display_data(3)
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
            else if (actv1 == "MB")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_data(14)
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
                val cursor1=dbcon.display_data(4)
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
            else if (actv1 == "GB")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_data(14)
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
                val cursor1=dbcon.display_data(5)
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
            else if (actv1 == "KiB")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_data(14)
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
                val cursor1=dbcon.display_data(6)
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
            else if (actv1 == "MiB")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_data(14)
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
                val cursor1=dbcon.display_data(7)
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
            else if (actv1 == "GiB")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_data(14)
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
                val cursor1=dbcon.display_data(8)
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
            else if (actv1 == "TiB")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_data(14)
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
                val cursor1=dbcon.display_data(9)
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
            else if (actv1 == "PiB")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_data(14)
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
                val cursor1=dbcon.display_data(10)
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
            else if (actv1 == "kbit/s")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_data(14)
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
                val cursor1=dbcon.display_data(11)
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
            else if (actv1 == "Mbit/s")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_data(14)
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
                val cursor1=dbcon.display_data(12)
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
            else if (actv1 == "Gbit/s")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_data(14)
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
                val cursor1=dbcon.display_data(13)
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
            else if (actv1 == "packet")
            {
                var a = (idata).toString()
                answer.setText(a)
            }
        }//
        }
    }
}