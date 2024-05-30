package com.example.unitconverter1

import android.annotation.SuppressLint
import android.content.ContentValues
import android.content.Context
import android.database.Cursor
import android.database.DatabaseUtils
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.util.Log

class dbconnection(var context:Context,var dbName:String,var dbversion:Int):SQLiteOpenHelper(context,dbName,null,dbversion) {

    companion object{
        val table1:String="length"
        val table2:String = "area"
        val table3:String = "weight"
        val table4:String = "volume"
        val table5:String = "temp"
        val table6:String = "time"
        val table7:String = "speed"
        val table8:String = "data"
        val table9:String = "cook"
        val col1:String="id"
        val col2:String="units"
        val col3:String="vals"
    }
    override fun onCreate(db: SQLiteDatabase?) {

        val createlen:String = "create table $table1 ($col1 INTEGER PRIMARY KEY autoincrement, $col2 TEXT,$col3 DOUBLE)"
        db?.execSQL(createlen)

        val createarea:String = "create table $table2 ($col1 INTEGER PRIMARY KEY autoincrement, $col2 TEXT,$col3 DOUBLE)"
        db?.execSQL(createarea)

        val createweight:String = "create table $table3 ($col1 INTEGER PRIMARY KEY autoincrement, $col2 TEXT,$col3 DOUBLE)"
        db?.execSQL(createweight)

        val createvolume:String = "create table $table4 ($col1 INTEGER PRIMARY KEY autoincrement, $col2 TEXT,$col3 DOUBLE)"
        db?.execSQL(createvolume)

        val createtemp:String = "create table " + table5 + "($col1 INTEGER PRIMARY KEY autoincrement, $col2 TEXT,$col3 DOUBLE)"
        db?.execSQL(createtemp)

        val createtime:String = "create table " + table6 + "($col1 INTEGER PRIMARY KEY autoincrement, $col2 TEXT,$col3 DOUBLE)"
        db?.execSQL(createtime)

        val createspeed:String = "create table " + table7 + "($col1 INTEGER PRIMARY KEY autoincrement, $col2 TEXT,$col3 DOUBLE)"
        db?.execSQL(createspeed)

        val createdata:String = "create table " + table8 + "($col1 INTEGER PRIMARY KEY autoincrement, $col2 TEXT,$col3 DOUBLE)"
        db?.execSQL(createdata)

        val createcook:String = "create table " + table9 + "($col1 INTEGER PRIMARY KEY autoincrement, $col2 TEXT,$col3 DOUBLE)"
        db?.execSQL(createcook)

        val inslen = "INSERT INTO $table1($col2, $col3) " +
                "VALUES " +
                "('micrometre',1.0)," +
                "('millimetre',0.001)," +
                "('centimetre',0.0001)," +
                "('decimetre',0.00001)," +
                "('metre',0.000001)," +
                "('inch',0.00003937)," +
                "('foot',0.0000032808)," +
                "('yard',0.0000010936)," +
                "('fathom',5.46807e-7)," +
                "('mile',6.2137e-10)," +
                "('kilometre',1e-9)," +
                "('furlong',4.971e-9)"
        db?.execSQL(inslen)

        val insarea = "INSERT INTO $table2 ($col2, $col3) " +
                "VALUES " +
                "('millimetre2',1.0)," +
                "('centimetre2',0.01)," +
                "('decimetre2',0.0001)," +
                "('metre2',0.000001)," +
                "('inch2',0.00155)," +
                "('foot2',1.0764e-5)," +
                "('yard2',1.196e-6)," +
                "('acre',0.00000000024711)," +
                "('kilometre2',0.000000000001)," +
                "('bigha (kaccha)',0.0000000011861)," +
                "('bigha (gujarat)',6.1776e-10)"
        db?.execSQL(insarea)

        val insweight = "INSERT INTO $table3 ($col2, $col3) " +
                "VALUES " +
                "('microgram',1.0)," +
                "('milligram',0.001)," +
                "('gram',1e-6)," +
                "('kg',1e-9)," +
                "('lb(pound)',0.0000000022046)," +
                "('ounce',0.000000035274)," +
                "('grain',0.000015432)," +
                "('quintal',1e-11)," +
                "('tonne',0.000000000001)," +
                "('carat',0.000005)," +
                "('tola',0.000000085735)"
        db?.execSQL(insweight)

        val insvolume = "INSERT INTO $table4 ($col2, $col3) " +
                "VALUES " +
                "('ml',1.0)," +
                "('cl',0.1)," +
                "('dl',0.01)," +
                "('l',0.001)," +
                "('mm3',1000)," +
                "('cm3',1)," +
                "('dm3',0.001)," +
                "('m3',1e-6)," +
                "('in3',0.0610237)," +
                "('ft3',3.53147e-5)," +
                "('yd3',1.30795e-6)"
        db?.execSQL(insvolume)

        val instemp = "INSERT INTO " + table5 + "($col2, $col3) " +
                "VALUES " +
                "('c',0)," +
                "('f',32)," +
                "('k',273.15)"
        db?.execSQL(instemp)

        val instime = "INSERT INTO $table6 ($col2, $col3) " +
                "VALUES " +
                "('ms',1)," +
                "('sec',0.001)," +
                "('min',1.6667e-5)," +
                "('hour',2.7778e-7)," +
                "('day',1.157416667e-8)," +
                "('week',1.653452381428571e-9)," +
                "('month',3.805201310464316636e-10)," +
                "('year',3.171004567123287176e-11)"
        db?.execSQL(instime)

        val insspeed = "INSERT INTO $table7 ($col2, $col3) " +
                "VALUES " +
                "('m/s',1.0)," +
                "('ft/s',3.28084)," +
                "('km/s',0.001)," +
                "('m/min',60)," +
                "('ft/min',196.85)," +
                "('km/min',0.06)," +
                "('km/h',3.6)," +
                "('mi/h',2.23694)," +
                "('knot',1.94384)," +
                "('min/km',16.666667)," +
                "('min/mile',26.8224)"
        db?.execSQL(insspeed)

        val insdata = "INSERT INTO $table8 ($col2, $col3) " +
                "VALUES " +
                "('bit',1.0)," +
                "('byte',0.125)," +
                "('kb',0.000125)," +
                "('mb',1.25e-7)," +
                "('gb',1.25e-10)," +
                "('kib',0.00012207)," + //kibibyte
                "('mib',1.19209e-7)," + //mebibyte
                "('gib',1.16415e-10)," + //gibibyte
                "('tib',1.1369e-13)," + //tebibyte
                "('pib',1.11022e-16)," + //pebibyte
                "('kbit/s',0.001)," +
                "('mbit/s',0.000001)," +
                "('gbit/s',1e-9)," +
                "('packet',0.000977)"
        db?.execSQL(insdata)

        val inscook = "INSERT INTO " + table9 + " ($col2, $col3) " +
                "VALUES " +
                "('ml',1)," +
                "('teaspoon',0.202884)," +
                "('tablespoon',0.067628)," +
                "('cup',0.004)," +
                "('fl oz',0.033814)," + //fluid ounce
                "('pt',0.00211338)," + //liquid pint
                "('qt',0.00105669)" //liquid quart
        db?.execSQL(inscook)

        Log.d("z","Oncreate method called")
    }

    override fun onUpgrade(db: SQLiteDatabase?, p1: Int, p2: Int) {
        val droplen = "DROP TABLE IF EXISTS $table1"
        db?.execSQL(droplen)
        val droparea = "DROP TABLE IF EXISTS $table2"
        db?.execSQL(droparea)
        val dropweight = "DROP TABLE IF EXISTS $table3"
        db?.execSQL(dropweight)
        val dropvolume = "DROP TABLE IF EXISTS $table4"
        db?.execSQL(dropvolume)
        val droptemp = "DROP TABLE IF EXISTS " + table5 + ""
        db?.execSQL(droptemp)
        val droptime = "DROP TABLE IF EXISTS " + table6 + ""
        db?.execSQL(droptime)
        val dropspeed = "DROP TABLE IF EXISTS " + table7 + ""
        db?.execSQL(dropspeed)
        val dropdata = "DROP TABLE IF EXISTS " + table8 + ""
        db?.execSQL(dropdata)
        val dropcook = "DROP TABLE IF EXISTS " + table9 + ""
        db?.execSQL(dropcook)


        Log.d("z","OnUpgrade method called")
        onCreate(db)
    }

    fun display_len(x: Int):Cursor
    {
        val db:SQLiteDatabase=this.readableDatabase
        val cursor: Cursor = db.rawQuery("select * from " + table1 + " where $col1 = $x", null)
        return cursor
    }

    fun display_area(x: Int):Cursor
    {
        val db:SQLiteDatabase=this.readableDatabase
        val cursor: Cursor = db.rawQuery("select * from " + table2 + " where $col1 = $x", null)
        return cursor
    }

    fun display_weight(x: Int):Cursor
    {
        val db:SQLiteDatabase=this.readableDatabase
        val cursor: Cursor = db.rawQuery("select * from " + table3 + " where $col1 = $x", null)
        return cursor
    }

    fun display_volume(x: Int):Cursor
    {
        val db:SQLiteDatabase=this.readableDatabase
        val cursor: Cursor = db.rawQuery("select * from " + table4 + " where $col1 = $x", null)
        return cursor
    }

    fun display_temp(x: Int):Cursor
    {
        val db:SQLiteDatabase=this.readableDatabase
        val cursor: Cursor = db.rawQuery("select * from " + table5 + " where $col1 = $x", null)
        return cursor
    }

    fun display_time(x: Int):Cursor
    {
        val db:SQLiteDatabase=this.readableDatabase
        val cursor: Cursor = db.rawQuery("select * from " + table6 + " where $col1 = $x", null)
        return cursor
    }

    fun display_speed(x: Int):Cursor
    {
        val db:SQLiteDatabase=this.readableDatabase
        val cursor: Cursor = db.rawQuery("select * from " + table7 + " where $col1 = $x", null)
        return cursor
    }

    fun display_data(x: Int):Cursor
    {
        val db:SQLiteDatabase=this.readableDatabase
        val cursor: Cursor = db.rawQuery("select * from " + table8 + " where $col1 = $x", null)
        return cursor
    }

    fun display_cook(x: Int):Cursor
    {
        val db:SQLiteDatabase=this.readableDatabase
        val cursor: Cursor = db.rawQuery("select * from " + table9 + " where $col1 = $x", null)
        return cursor
    }
}