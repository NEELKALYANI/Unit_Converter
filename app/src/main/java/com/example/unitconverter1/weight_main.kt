package com.example.unitconverter1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import kotlin.math.roundToInt

class weight_main : AppCompatActivity() {
    val dbcon:dbconnection=dbconnection(this@weight_main,"dbunitcon",1)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_weight_main)
        val submit = findViewById<Button>(R.id.btnsubmit)
        submit.setOnClickListener {
           core()
        }
    }

    override fun onResume() {
        super.onResume()

        var autocompleteTV = findViewById<AutoCompleteTextView>(R.id.autocompletetextview)
            val len = resources.getStringArray(R.array.weight_units)
            val arrayAdapter = ArrayAdapter(this, R.layout.length_dropdown, len)
            autocompleteTV.setAdapter(arrayAdapter)

        var autocompleteTV1 = findViewById<AutoCompleteTextView>(R.id.autocompletetextview1)
            val len1 = resources.getStringArray(R.array.weight_units)
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

        if (actv == "μg (Microgram)")
        {
            if (actv1 == "μg (Microgram)")
            {
                    var a = (idata).toString()
                    answer.setText(a)
            }
            else if (actv1 == "mg (Milligram)")
            {
                val cursor=dbcon.display_weight(2)
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
            else if (actv1 == "gram")
            {
                val cursor=dbcon.display_weight(3)
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
            else if (actv1 == "kg")
            {
                val cursor=dbcon.display_weight(4)
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
            else if (actv1 == "lb (pound)")
            {
                val cursor=dbcon.display_weight(5)
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
            else if (actv1 == "Ounce")
            {
                val cursor=dbcon.display_weight(6)
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
            else if (actv1 == "grain")
            {
                val cursor=dbcon.display_weight(7)
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
            else if (actv1 == "quintal")
            {
                val cursor=dbcon.display_weight(8)
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
            else if (actv1 == "tonne")
            {
                val cursor=dbcon.display_weight(9)
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
            else if (actv1 == "carat")
            {
                val cursor=dbcon.display_weight(10)
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
            else if (actv1 == "tola")
            {
                val cursor=dbcon.display_weight(11)
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
        else if (actv == "mg (Milligram)")
        {
            if (actv1 == "μg (Microgram)") {
                val cursor=dbcon.display_weight(2)
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
            else if (actv1 == "mg (Milligram)")
            {
                var a = (idata).toString()
                answer.setText(a)
            }
            else if (actv1 == "gram")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_weight(2)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_weight(3)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (a * d1 ).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "kg")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_weight(2)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_weight(4)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (a * d1 ).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "lb (pound)")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_weight(2)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_weight(5)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (a * d1 ).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "Ounce")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_weight(2)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_weight(6)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (a * d1 ).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "grain")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_weight(2)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_weight(7)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (a * d1 ).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "quintal")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_weight(2)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_weight(8)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (a * d1 ).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "tonne")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_weight(2)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_weight(9)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (a * d1 ).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "carat")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_weight(2)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_weight(10)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (a * d1 ).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "tola")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_weight(2)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_weight(11)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
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
        else if (actv == "gram")
        {
            if (actv1 == "μg (Microgram)") {
                val cursor=dbcon.display_weight(3)
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
            else if (actv1 == "mg (Milligram)")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_weight(3)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_weight(2)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (a * d1 ).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "gram")
            {
                var a = (idata).toString()
                answer.setText(a)
            }
            else if (actv1 == "kg")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_weight(3)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_weight(4)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (a * d1 ).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "lb (pound)")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_weight(3)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_weight(5)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (a * d1 ).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "Ounce")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_weight(3)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_weight(6)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (a * d1 ).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "grain")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_weight(3)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_weight(7)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (a * d1 ).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "quintal")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_weight(3)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_weight(8)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (a * d1 ).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "tonne")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_weight(3)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_weight(9)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (a * d1 ).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "carat")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_weight(3)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_weight(10)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (a * d1 ).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "tola")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_weight(3)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_weight(11)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
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
        else if (actv == "kg")
        {
            if (actv1 == "μg (Microgram)") {
                val cursor=dbcon.display_weight(4)
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
            else if (actv1 == "mg (Milligram)")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_weight(4)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_weight(2)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (a * d1 ).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "gram")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_weight(4)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_weight(3)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (a * d1 ).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "kg")
            {
                var a = (idata).toString()
                answer.setText(a)
            }
            else if (actv1 == "lb (pound)")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_weight(4)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_weight(5)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (a * d1 ).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "Ounce")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_weight(4)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_weight(6)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (a * d1 ).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "grain")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_weight(4)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_weight(7)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (a * d1 ).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "quintal")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_weight(4)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_weight(8)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (a * d1 ).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "tonne")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_weight(4)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_weight(9)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (a * d1 ).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "carat")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_weight(4)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_weight(10)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (a * d1 ).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "tola")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_weight(4)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_weight(11)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
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
        else if (actv == "lb (pound)")
        {
            if (actv1 == "μg (Microgram)") {
                val cursor=dbcon.display_weight(5)
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
            else if (actv1 == "mg (Milligram)")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_weight(5)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_weight(2)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (a * d1 ).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "gram")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_weight(5)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_weight(3)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (a * d1 ).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "kg")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_weight(5)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_weight(4)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (a * d1 ).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "lb (pound)")
            {
                var a = (idata).toString()
                answer.setText(a)
            }
            else if (actv1 == "Ounce")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_weight(5)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_weight(6)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (a * d1 ).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "grain")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_weight(5)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_weight(7)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (a * d1 ).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "quintal")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_weight(5)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_weight(8)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (a * d1 ).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "tonne")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_weight(5)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_weight(9)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (a * d1 ).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "carat")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_weight(5)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_weight(10)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (a * d1 ).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "tola")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_weight(5)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_weight(11)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
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
        else if (actv == "Ounce")
        {
            if (actv1 == "μg (Microgram)") {
                val cursor=dbcon.display_weight(6)
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
            else if (actv1 == "mg (Milligram)")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_weight(6)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_weight(2)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (a * d1 ).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "gram")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_weight(6)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_weight(3)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (a * d1 ).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "kg")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_weight(6)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_weight(4)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (a * d1 ).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "lb (pound)")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_weight(6)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_weight(5)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (a * d1 ).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "Ounce")
            {
                var a = (idata).toString()
                answer.setText(a)
            }
            else if (actv1 == "grain")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_weight(6)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_weight(7)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (a * d1 ).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "quintal")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_weight(6)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_weight(8)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (a * d1 ).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "tonne")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_weight(6)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_weight(9)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (a * d1 ).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "carat")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_weight(6)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_weight(10)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (a * d1 ).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "tola")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_weight(6)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_weight(11)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
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
        else if (actv == "grain")
        {
            if (actv1 == "μg (Microgram)") {
                val cursor=dbcon.display_weight(7)
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
            else if (actv1 == "mg (Milligram)")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_weight(7)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_weight(2)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (a * d1 ).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "gram")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_weight(7)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_weight(3)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (a * d1 ).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "kg")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_weight(7)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_weight(4)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (a * d1 ).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "lb (pound)")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_weight(7)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_weight(5)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (a * d1 ).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "Ounce")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_weight(7)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_weight(6)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (a * d1 ).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "grain")
            {
                var a = (idata).toString()
                answer.setText(a)
            }
            else if (actv1 == "quintal")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_weight(7)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_weight(8)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (a * d1 ).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "tonne")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_weight(7)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_weight(9)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (a * d1 ).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "carat")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_weight(7)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_weight(10)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (a * d1 ).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "tola")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_weight(7)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_weight(11)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
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
        else if (actv == "quintal")
        {
            if (actv1 == "μg (Microgram)") {
                val cursor=dbcon.display_weight(8)
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
            else if (actv1 == "mg (Milligram)")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_weight(8)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_weight(2)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (a * d1 ).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "gram")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_weight(8)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_weight(3)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (a * d1 ).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "kg")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_weight(8)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_weight(4)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (a * d1 ).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "lb (pound)")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_weight(8)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_weight(5)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (a * d1 ).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "Ounce")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_weight(8)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_weight(6)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (a * d1 ).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "grain")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_weight(8)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_weight(7)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (a * d1 ).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "quintal")
            {
                var a = (idata).toString()
                answer.setText(a)
            }
            else if (actv1 == "tonne")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_weight(8)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_weight(9)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (a * d1 ).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "carat")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_weight(8)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_weight(10)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (a * d1 ).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "tola")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_weight(8)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_weight(11)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
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
        else if (actv == "tonne")
        {
            if (actv1 == "μg (Microgram)") {
                val cursor=dbcon.display_weight(9)
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
            else if (actv1 == "mg (Milligram)")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_weight(9)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_weight(2)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (a * d1 ).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "gram")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_weight(9)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_weight(3)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (a * d1 ).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "kg")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_weight(9)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_weight(4)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (a * d1 ).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "lb (pound)")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_weight(9)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_weight(5)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (a * d1 ).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "Ounce")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_weight(9)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_weight(6)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (a * d1 ).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "grain")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_weight(9)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_weight(7)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (a * d1 ).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "quintal")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_weight(9)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_weight(8)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (a * d1 ).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "tonne")
            {
                var a = (idata).toString()
                answer.setText(a)
            }
            else if (actv1 == "carat")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_weight(9)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_weight(10)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (a * d1 ).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "tola")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_weight(9)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_weight(11)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
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
        else if (actv == "carat")
        {
            if (actv1 == "μg (Microgram)") {
                val cursor=dbcon.display_weight(10)
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
            else if (actv1 == "mg (Milligram)")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_weight(10)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_weight(2)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (a * d1 ).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "gram")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_weight(10)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_weight(3)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (a * d1 ).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "kg")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_weight(10)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_weight(4)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (a * d1 ).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "lb (pound)")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_weight(10)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_weight(5)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (a * d1 ).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "Ounce")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_weight(10)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_weight(6)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (a * d1 ).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "grain")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_weight(10)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_weight(7)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (a * d1 ).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "quintal")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_weight(10)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_weight(8)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (a * d1 ).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "tonne")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_weight(10)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_weight(9)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (a * d1 ).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "carat")
            {
                var a = (idata).toString()
                answer.setText(a)
            }
            else if (actv1 == "tola")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_weight(10)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_weight(11)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
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
        else if (actv == "tola")
        {
            if (actv1 == "μg (Microgram)") {
                val cursor=dbcon.display_weight(11)
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
            else if (actv1 == "mg (Milligram)")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_weight(11)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_weight(2)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (a * d1 ).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "gram")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_weight(11)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_weight(3)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (a * d1 ).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "kg")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_weight(11)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_weight(4)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (a * d1 ).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "lb (pound)")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_weight(11)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_weight(5)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (a * d1 ).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "Ounce")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_weight(11)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_weight(6)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (a * d1 ).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "grain")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_weight(11)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_weight(7)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (a * d1 ).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "quintal")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_weight(11)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_weight(8)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (a * d1 ).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "tonne")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_weight(11)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_weight(9)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (a * d1 ).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "carat")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_weight(11)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_weight(10)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (a * d1 ).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "tola")
            {
                var a = (idata).toString()
                answer.setText(a)
            }
        }//
        }
    }
}