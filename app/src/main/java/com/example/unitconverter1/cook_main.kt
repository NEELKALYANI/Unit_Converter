package com.example.unitconverter1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class cook_main : AppCompatActivity() {
    val dbcon:dbconnection=dbconnection(this@cook_main,"dbunitcon",1)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cook_main)

        val submit = findViewById<Button>(R.id.btnsubmit)
        submit.setOnClickListener {
            core()
        }
    }

    override fun onResume() {
        super.onResume()

        var autocompleteTV = findViewById<AutoCompleteTextView>(R.id.autocompletetextview)
            val len = resources.getStringArray(R.array.cook_units)
            val arrayAdapter = ArrayAdapter(this, R.layout.length_dropdown, len)
            autocompleteTV.setAdapter(arrayAdapter)

        var autocompleteTV1 = findViewById<AutoCompleteTextView>(R.id.autocompletetextview1)
            val len1 = resources.getStringArray(R.array.cook_units)
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

        if (actv == "ml(cc)")
        {
            if (actv1 == "ml(cc)")
            {
                var a = (idata).toString()
                answer.setText(a)
            }
            else if (actv1 == "teaspoon")
            {
                val cursor=dbcon.display_cook(2)
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
            else if (actv1 == "tablespoon")
            {
                val cursor=dbcon.display_cook(3)
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
            else if (actv1 == "cup(metric)")
            {
                val cursor=dbcon.display_cook(4)
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
            else if (actv1 == "fl oz(US)")
            {
                val cursor=dbcon.display_cook(5)
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
            else if (actv1 == "pt(US)")
            {
                val cursor=dbcon.display_cook(6)
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
            else if (actv1 == "qt(US)")
            {
                val cursor=dbcon.display_cook(7)
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
        else if (actv == "teaspoon")
        {
            if (actv1 == "ml(cc)") {
                val cursor=dbcon.display_cook(2)
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
            else if (actv1 == "teaspoon")
            {
                var a = (idata).toString()
                answer.setText(a)
            }
            else if (actv1 == "tablespoon")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_cook(2)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_cook(3)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (a * d1 ).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "cup(metric)")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_cook(2)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_cook(4)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (a * d1 ).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "fl oz(US)")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_cook(2)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_cook(5)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (a * d1 ).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "pt(US)")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_cook(2)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_cook(6)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (a * d1 ).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "qt(US)")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_cook(2)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_cook(7)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
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
        else if (actv == "tablespoon")
        {
            if (actv1 == "ml(cc)") {
                val cursor=dbcon.display_cook(3)
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
            else if (actv1 == "teaspoon")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_cook(3)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_cook(2)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (a * d1 ).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "tablespoon")
            {
                var a = (idata).toString()
                answer.setText(a)
            }
            else if (actv1 == "cup(metric)")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_cook(3)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_cook(4)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (a * d1 ).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "fl oz(US)")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_cook(3)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_cook(5)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (a * d1 ).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "pt(US)")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_cook(3)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_cook(6)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (a * d1 ).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "qt(US)")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_cook(3)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_cook(7)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
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
        else if (actv == "cup(metric)")
        {
            if (actv1 == "ml(cc)") {
                val cursor=dbcon.display_cook(4)
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
            else if (actv1 == "teaspoon")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_cook(4)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_cook(2)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (a * d1 ).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "tablespoon")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_cook(4)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_cook(3)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (a * d1 ).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "cup(metric)")
            {
                var a = (idata).toString()
                answer.setText(a)
            }
            else if (actv1 == "fl oz(US)")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_cook(4)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_cook(5)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (a * d1 ).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "pt(US)")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_cook(4)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_cook(6)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (a * d1 ).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "qt(US)")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_cook(4)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_cook(7)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
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
        else if (actv == "fl oz(US)")
        {
            if (actv1 == "ml(cc)") {
                val cursor=dbcon.display_cook(5)
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
            else if (actv1 == "teaspoon")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_cook(5)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_cook(2)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (a * d1 ).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "tablespoon")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_cook(5)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_cook(3)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (a * d1 ).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "cup(metric)")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_cook(5)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_cook(4)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (a * d1 ).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "fl oz(US)")
            {
                var a = (idata).toString()
                answer.setText(a)
            }
            else if (actv1 == "pt(US)")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_cook(5)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_cook(6)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (a * d1 ).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "qt(US)")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_cook(5)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_cook(7)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
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
        else if (actv == "pt(US)")
        {
            if (actv1 == "ml(cc)") {
                val cursor=dbcon.display_cook(6)
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
            else if (actv1 == "teaspoon")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_cook(6)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_cook(2)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (a * d1 ).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "tablespoon")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_cook(6)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_cook(3)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (a * d1 ).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "cup(metric)")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_cook(6)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_cook(4)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (a * d1 ).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "fl oz(US)")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_cook(6)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_cook(5)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (a * d1 ).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "pt(US)")
            {
                var a = (idata).toString()
                answer.setText(a)
            }
            else if (actv1 == "qt(US)")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_cook(6)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_cook(7)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
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
        else if (actv == "qt(US)")
        {
            if (actv1 == "ml(cc)") {
                val cursor=dbcon.display_cook(7)
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
            else if (actv1 == "teaspoon")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_cook(7)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_cook(2)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (a * d1 ).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "tablespoon")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_cook(7)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_cook(3)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (a * d1 ).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "cup(metric)")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_cook(7)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_cook(4)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (a * d1 ).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "fl oz(US)")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_cook(7)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_cook(5)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (a * d1 ).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "pt(US)")
            {
                var a:Double = 0.0
                val cursor=dbcon.display_cook(7)
                val data:StringBuffer= StringBuffer()
                if (cursor.count>0)
                {
                    while (cursor.moveToNext())
                    {
                        data.append(cursor.getDouble(2))
                    }
                    var d = data.toString().toDouble()
                    a = (idata / d)
                }
                cursor.close()
                val cursor1=dbcon.display_cook(6)
                val data1:StringBuffer= StringBuffer()
                if (cursor1.count>0)
                {
                    while (cursor1.moveToNext())
                    {
                        data1.append(cursor1.getDouble(2))
                    }
                    var d1 = data1.toString().toDouble()
                    var a1 = (a * d1 ).toString()
                    answer.setText(a1)
                }
                cursor1.close()
            }
            else if (actv1 == "qt(US)")
            {
                var a = (idata).toString()
                answer.setText(a)
            }
        }//
        }
    }
}