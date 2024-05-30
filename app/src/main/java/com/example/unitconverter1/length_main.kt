package com.example.unitconverter1

import android.annotation.SuppressLint
import android.content.Context
import android.database.Cursor
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.*
import androidx.appcompat.app.AlertDialog


class length_main : AppCompatActivity() {
    val dbcon:dbconnection=dbconnection(this@length_main,"dbunitcon",1)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_length_main)

        val submit = findViewById<Button>(R.id.btnsubmit)
                submit.setOnClickListener {
                    core()
                }
    }

    override fun onResume() {
        super.onResume()

        var autocompleteTV = findViewById<AutoCompleteTextView>(R.id.autocompletetextview)
        val len = resources.getStringArray(R.array.length_units)
        val arrayAdapter = ArrayAdapter(this, R.layout.length_dropdown, len)
        autocompleteTV.setAdapter(arrayAdapter)


        var autocompleteTV1 = findViewById<AutoCompleteTextView>(R.id.autocompletetextview1)
        val len1 = resources.getStringArray(R.array.length_units)
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

    fun core(){

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
        val answer = findViewById<TextView>(R.id.ans)
        
        val unit = findViewById<TextView>(R.id.unit)
        unit.setText(actv1)
        
        if (actv == "μm (micrometre)")
        {
            if (actv1 == "μm (micrometre)")
            {
                val cursor=dbcon.display_len(1)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    var a = (d * idata).toString()
                    answer.setText(a)
                }
            }
            else if (actv1 == "mm (millimetre)")
            {
                val cursor=dbcon.display_len(2)
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
            else if (actv1 == "cm (centimetre)")
            {
                val cursor=dbcon.display_len(3)
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
            else if (actv1 == "dm (decimetre)")
            {
                val cursor=dbcon.display_len(4)
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
            else if (actv1 == "m (metre)")
            {
                val cursor=dbcon.display_len(5)
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
            else if (actv1 == "inch")
            {
                val cursor=dbcon.display_len(6)
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
            else if (actv1 == "ft (foot)")
            {
                val cursor=dbcon.display_len(7)
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
            else if (actv1 == "yd (yard)")
            {
                val cursor=dbcon.display_len(8)
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
            else if (actv1 == "fathom")
            {
                val cursor=dbcon.display_len(9)
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
            else if (actv1 == "mile")
            {
                val cursor=dbcon.display_len(10)
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
            else if (actv1 == "km (kilometre)")
            {
                val cursor=dbcon.display_len(11)
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
            else if (actv1 == "furlong")
            {
                val cursor=dbcon.display_len(12)
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
        else if (actv == "mm (millimetre)")
        {
            if (actv1 == "μm (micrometre)")
            {
                val cursor=dbcon.display_len(2)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0) {
                    while (cursor.moveToNext()) {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    var a = (idata / d).toString()
                    answer.setText(a)
                }
            }
            else if (actv1 == "mm (millimetre)")
            {
                var a = (idata).toString()
                answer.setText(a)
            }
            else if (actv1 == "cm (centimetre)")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_len(2)
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
                val cursor1=dbcon.display_len(3)
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
            else if (actv1 == "dm (decimetre)")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_len(2)
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
                val cursor1=dbcon.display_len(4)
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
            else if (actv1 == "m (metre)")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_len(2)
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
                val cursor1=dbcon.display_len(5)
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
            else if (actv1 == "inch")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_len(2)
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
                val cursor1=dbcon.display_len(6)
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
            else if (actv1 == "ft (foot)")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_len(2)
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
                val cursor1=dbcon.display_len(7)
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
            else if (actv1 == "yd (yard)")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_len(2)
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
                val cursor1=dbcon.display_len(8)
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
            else if (actv1 == "fathom")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_len(2)
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
                val cursor1=dbcon.display_len(9)
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
            else if (actv1 == "mile")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_len(2)
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
                val cursor1=dbcon.display_len(10)
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
            else if (actv1 == "km (kilometre)")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_len(2)
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
                val cursor1=dbcon.display_len(11)
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
            else if (actv1 == "furlong")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_len(2)
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
                val cursor1=dbcon.display_len(12)
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
        else if (actv == "cm (centimetre)")
        {
            if (actv1 == "μm (micrometre)")
            {
                val cursor=dbcon.display_len(3)
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
            else if (actv1 == "mm (millimetre)")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_len(3)
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
                val cursor1=dbcon.display_len(2)
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
            else if (actv1 == "cm (centimetre)")
            {
                var idata1 = idata.toString()
                answer.setText(idata1)
            }
            else if (actv1 == "dm (decimetre)")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_len(3)
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
                val cursor1=dbcon.display_len(4)
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
            else if (actv1 == "m (metre)")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_len(3)
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
                val cursor1=dbcon.display_len(5)
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
            else if (actv1 == "inch")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_len(3)
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
                val cursor1=dbcon.display_len(6)
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
            else if (actv1 == "ft (foot)")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_len(3)
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
                val cursor1=dbcon.display_len(7)
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
            else if (actv1 == "yd (yard)")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_len(3)
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
                val cursor1=dbcon.display_len(8)
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
            else if (actv1 == "fathom")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_len(3)
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
                val cursor1=dbcon.display_len(9)
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
            else if (actv1 == "mile")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_len(3)
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
                val cursor1=dbcon.display_len(10)
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
            else if (actv1 == "km (kilometre)")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_len(3)
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
                val cursor1=dbcon.display_len(11)
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
            else if (actv1 == "furlong")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_len(3)
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
                val cursor1=dbcon.display_len(12)
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
        else if (actv == "dm (decimetre)")
        {
            if (actv1 == "μm (micrometre)")
            {
                val cursor=dbcon.display_len(4)
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
                cursor.close()

            }
            else if (actv1 == "mm (millimetre)")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_len(4)
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
                val cursor1=dbcon.display_len(2)
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
            else if (actv1 == "cm (centimetre)")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_len(4)
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
                val cursor1=dbcon.display_len(3)
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
            else if (actv1 == "dm (decimetre)")
            {
                var idata1 = idata.toString()
                answer.setText(idata1)
            }
            else if (actv1 == "m (metre)")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_len(4)
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
                val cursor1=dbcon.display_len(5)
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
            else if (actv1 == "inch")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_len(4)
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
                val cursor1=dbcon.display_len(6)
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
            else if (actv1 == "ft (foot)")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_len(4)
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
                val cursor1=dbcon.display_len(7)
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
            else if (actv1 == "yd (yard)")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_len(4)
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
                val cursor1=dbcon.display_len(8)
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
            else if (actv1 == "fathom")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_len(4)
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
                val cursor1=dbcon.display_len(9)
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
            else if (actv1 == "mile")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_len(4)
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
                val cursor1=dbcon.display_len(10)
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
            else if (actv1 == "km (kilometre)")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_len(4)
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
                val cursor1=dbcon.display_len(11)
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
            else if (actv1 == "furlong")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_len(4)
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
                val cursor1=dbcon.display_len(12)
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
        else if (actv == "m (metre)")
        {
            if (actv1 == "μm (micrometre)")
            {
                val cursor=dbcon.display_len(5)
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
                cursor.close()
            }
            else if (actv1 == "mm (millimetre)")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_len(5)
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
                val cursor1=dbcon.display_len(2)
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
            else if (actv1 == "cm (centimetre)")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_len(5)
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
                val cursor1=dbcon.display_len(3)
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
            else if (actv1 == "dm (decimetre)")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_len(5)
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
                val cursor1=dbcon.display_len(4)
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
            else if (actv1 == "m (metre)")
            {
                var idata1 = idata.toString()
                answer.setText(idata1)
            }
            else if (actv1 == "inch")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_len(5)
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
                val cursor1=dbcon.display_len(6)
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
            else if (actv1 == "ft (foot)")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_len(5)
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
                val cursor1=dbcon.display_len(7)
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
            else if (actv1 == "yd (yard)")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_len(5)
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
                val cursor1=dbcon.display_len(8)
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
            else if (actv1 == "fathom")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_len(5)
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
                val cursor1=dbcon.display_len(9)
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
            else if (actv1 == "mile")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_len(5)
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
                val cursor1=dbcon.display_len(10)
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
            else if (actv1 == "km (kilometre)")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_len(5)
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
                val cursor1=dbcon.display_len(11)
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
            else if (actv1 == "furlong")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_len(5)
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
                val cursor1=dbcon.display_len(12)
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
        else if (actv == "inch")
        {
            if (actv1 == "μm (micrometre)")
            {
                val cursor=dbcon.display_len(6)
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
                cursor.close()
            }
            else if (actv1 == "mm (millimetre)")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_len(6)
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
                val cursor1=dbcon.display_len(2)
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
            else if (actv1 == "cm (centimetre)")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_len(6)
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
                val cursor1=dbcon.display_len(3)
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
            else if (actv1 == "dm (decimetre)")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_len(6)
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
                val cursor1=dbcon.display_len(4)
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
            else if (actv1 == "m (metre)")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_len(6)
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
                val cursor1=dbcon.display_len(5)
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
            else if (actv1 == "inch")
            {
                var idata1 = idata.toString()
                answer.setText(idata1)
            }
            else if (actv1 == "ft (foot)")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_len(6)
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
                val cursor1=dbcon.display_len(7)
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
            else if (actv1 == "yd (yard)")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_len(6)
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
                val cursor1=dbcon.display_len(8)
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
            else if (actv1 == "fathom")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_len(6)
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
                val cursor1=dbcon.display_len(9)
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
            else if (actv1 == "mile")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_len(6)
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
                val cursor1=dbcon.display_len(10)
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
            else if (actv1 == "km (kilometre)")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_len(6)
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
                val cursor1=dbcon.display_len(11)
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
            else if (actv1 == "furlong")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_len(6)
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
                val cursor1=dbcon.display_len(12)
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
        else if (actv == "ft (foot)")
        {
            if (actv1 == "μm (micrometre)")
            {
                val cursor=dbcon.display_len(7)
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
                cursor.close()
            }
            else if (actv1 == "mm (millimetre)")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_len(7)
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
                val cursor1=dbcon.display_len(2)
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
            else if (actv1 == "cm (centimetre)")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_len(7)
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
                val cursor1=dbcon.display_len(3)
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
            else if (actv1 == "dm (decimetre)")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_len(7)
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
                val cursor1=dbcon.display_len(4)
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
            else if (actv1 == "m (metre)")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_len(7)
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
                val cursor1=dbcon.display_len(5)
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
            else if (actv1 == "inch")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_len(7)
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
                val cursor1=dbcon.display_len(6)
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
            else if (actv1 == "ft (foot)")
            {
                var idata1 = idata.toString()
                answer.setText(idata1)
            }
            else if (actv1 == "yd (yard)")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_len(7)
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
                val cursor1=dbcon.display_len(8)
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
            else if (actv1 == "fathom")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_len(7)
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
                val cursor1=dbcon.display_len(9)
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
            else if (actv1 == "mile")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_len(7)
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
                val cursor1=dbcon.display_len(10)
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
            else if (actv1 == "km (kilometre)")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_len(7)
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
                val cursor1=dbcon.display_len(11)
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
            else if (actv1 == "furlong")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_len(7)
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
                val cursor1=dbcon.display_len(12)
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
        else if (actv == "yd (yard)")
        {
            if (actv1 == "μm (micrometre)")
            {
                val cursor=dbcon.display_len(8)
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
                cursor.close()
            }
            else if (actv1 == "mm (millimetre)")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_len(8)
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
                val cursor1=dbcon.display_len(2)
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
            else if (actv1 == "cm (centimetre)")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_len(8)
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
                val cursor1=dbcon.display_len(3)
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
            else if (actv1 == "dm (decimetre)")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_len(8)
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
                val cursor1=dbcon.display_len(4)
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
            else if (actv1 == "m (metre)")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_len(8)
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
                val cursor1=dbcon.display_len(5)
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
            else if (actv1 == "inch")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_len(8)
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
                val cursor1=dbcon.display_len(6)
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
            else if (actv1 == "ft (foot)")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_len(8)
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
                val cursor1=dbcon.display_len(7)
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
            else if (actv1 == "yd (yard)")
            {
                var idata1 = idata.toString()
                answer.setText(idata1)
            }
            else if (actv1 == "fathom")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_len(8)
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
                val cursor1=dbcon.display_len(9)
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
            else if (actv1 == "mile")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_len(8)
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
                val cursor1=dbcon.display_len(10)
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
            else if (actv1 == "km (kilometre)")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_len(8)
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
                val cursor1=dbcon.display_len(11)
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
            else if (actv1 == "furlong")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_len(8)
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
                val cursor1=dbcon.display_len(12)
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
        else if (actv == "fathom")
        {
            if (actv1 == "μm (micrometre)")
            {
                val cursor=dbcon.display_len(9)
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
                cursor.close()
            }
            else if (actv1 == "mm (millimetre)")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_len(9)
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
                val cursor1=dbcon.display_len(2)
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
            else if (actv1 == "cm (centimetre)")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_len(9)
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
                val cursor1=dbcon.display_len(3)
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
            else if (actv1 == "dm (decimetre)")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_len(9)
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
                val cursor1=dbcon.display_len(4)
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
            else if (actv1 == "m (metre)")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_len(9)
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
                val cursor1=dbcon.display_len(5)
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
            else if (actv1 == "inch")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_len(9)
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
                val cursor1=dbcon.display_len(6)
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
            else if (actv1 == "ft (foot)")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_len(9)
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
                val cursor1=dbcon.display_len(7)
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
            else if (actv1 == "yd (yard)")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_len(9)
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
                val cursor1=dbcon.display_len(8)
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
            else if (actv1 == "fathom")
            {
                var idata1 = idata.toString()
                answer.setText(idata1)
            }
            else if (actv1 == "mile")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_len(9)
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
                val cursor1=dbcon.display_len(10)
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
            else if (actv1 == "km (kilometre)")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_len(9)
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
                val cursor1=dbcon.display_len(11)
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
            else if (actv1 == "furlong")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_len(9)
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
                val cursor1=dbcon.display_len(12)
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
        else if (actv == "mile")
        {
            if (actv1 == "μm (micrometre)")
            {
                val cursor=dbcon.display_len(10)
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
                cursor.close()
            }
            else if (actv1 == "mm (millimetre)")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_len(10)
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
                val cursor1=dbcon.display_len(2)
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
            else if (actv1 == "cm (centimetre)")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_len(10)
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
                val cursor1=dbcon.display_len(3)
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
            else if (actv1 == "dm (decimetre)")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_len(10)
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
                val cursor1=dbcon.display_len(4)
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
            else if (actv1 == "m (metre)")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_len(10)
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
                val cursor1=dbcon.display_len(5)
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
            else if (actv1 == "inch")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_len(10)
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
                val cursor1=dbcon.display_len(6)
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
            else if (actv1 == "ft (foot)")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_len(10)
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
                val cursor1=dbcon.display_len(7)
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
            else if (actv1 == "yd (yard)")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_len(10)
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
                val cursor1=dbcon.display_len(8)
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
            else if (actv1 == "fathom")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_len(10)
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
                val cursor1=dbcon.display_len(9)
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
            else if (actv1 == "mile")
            {
                var idata1 = idata.toString()
                answer.setText(idata1)
            }
            else if (actv1 == "km (kilometre)")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_len(10)
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
                val cursor1=dbcon.display_len(11)
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
            else if (actv1 == "furlong")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_len(10)
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
                val cursor1=dbcon.display_len(12)
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
        else if(actv == "km (kilometre)")
        {
            if (actv1 == "μm (micrometre)")
            {
                val cursor=dbcon.display_len(11)
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
                cursor.close()
            }
            else if (actv1 == "mm (millimetre)")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_len(11)
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
                val cursor1=dbcon.display_len(2)
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
            else if (actv1 == "cm (centimetre)")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_len(11)
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
                val cursor1=dbcon.display_len(3)
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
            else if (actv1 == "dm (decimetre)")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_len(11)
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
                val cursor1=dbcon.display_len(4)
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
            else if (actv1 == "m (metre)")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_len(11)
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
                val cursor1=dbcon.display_len(5)
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
            else if (actv1 == "inch")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_len(11)
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
                val cursor1=dbcon.display_len(6)
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
            else if (actv1 == "ft (foot)")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_len(11)
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
                val cursor1=dbcon.display_len(7)
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
            else if (actv1 == "yd (yard)")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_len(11)
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
                val cursor1=dbcon.display_len(8)
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
            else if (actv1 == "fathom")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_len(11)
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
                val cursor1=dbcon.display_len(9)
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
            else if (actv1 == "mile")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_len(11)
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
                val cursor1=dbcon.display_len(10)
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
            else if (actv1 == "km (kilometre)")
            {
                var idata1 = idata.toString()
                answer.setText(idata1)
            }
            else if (actv1 == "furlong")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_len(11)
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
                val cursor1=dbcon.display_len(12)
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
        else if (actv == "furlong")
        {
            if (actv1 == "μm (micrometre)")
            {
                val cursor=dbcon.display_len(12)
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
                cursor.close()
            }
            else if (actv1 == "mm (millimetre)")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_len(12)
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
                val cursor1=dbcon.display_len(2)
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
            else if (actv1 == "cm (centimetre)")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_len(12)
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
                val cursor1=dbcon.display_len(3)
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
            else if (actv1 == "dm (decimetre)")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_len(12)
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
                val cursor1=dbcon.display_len(4)
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
            else if (actv1 == "m (metre)")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_len(12)
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
                val cursor1=dbcon.display_len(5)
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
            else if (actv1 == "inch")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_len(12)
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
                val cursor1=dbcon.display_len(6)
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
            else if (actv1 == "ft (foot)")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_len(12)
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
                val cursor1=dbcon.display_len(7)
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
            else if (actv1 == "yd (yard)")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_len(12)
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
                val cursor1=dbcon.display_len(8)
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
            else if (actv1 == "fathom")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_len(12)
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
                val cursor1=dbcon.display_len(9)
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
            else if (actv1 == "mile")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_len(12)
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
                val cursor1=dbcon.display_len(10)
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
            else if (actv1 == "km (kilometre)")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_len(12)
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
                val cursor1=dbcon.display_len(11)
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
            else if (actv1 == "furlong")
            {
                var idata1 = idata.toString()
                answer.setText(idata1)
            }
        }//
        }
    }
}
