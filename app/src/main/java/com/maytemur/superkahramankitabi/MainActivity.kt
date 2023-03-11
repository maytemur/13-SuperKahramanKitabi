package com.maytemur.superkahramankitabi

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Batman
        //Superman
        //Spiderman
        //Aquaman
        //Ironman
        // bu şekilde değil toplu olarak arraylist olarak değişkenleri tutuyoruz - Veri hazırlığı
        var superKahramanisimleri = ArrayList<String>()
        superKahramanisimleri.add("Batman")
        superKahramanisimleri.add("Superman")
        superKahramanisimleri.add("Spiderman")
        superKahramanisimleri.add("Aquaman")
        superKahramanisimleri.add("Ironman")


        //Verimsiz tanımlamalar
        /*
        val batmanBitmap = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.batman)
        val supermanBitmap = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.superman)
        val spidermanBitmap = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.spiderman)
        val aquamanBitmap = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.aquaman)
        val ironmanBitmap = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.ironman)

        var superkahramanGorselleri = ArrayList<Bitmap>()
        superkahramanGorselleri.add(batmanBitmap)
        superkahramanGorselleri.add(supermanBitmap)
        superkahramanGorselleri.add(spidermanBitmap)
        superkahramanGorselleri.add(aquamanBitmap)
        superkahramanGorselleri.add(ironmanBitmap) */

        //Verimli Tanımlamalar
        val batmanDrawableId = R.drawable.batman
        val supermanDrawableId = R.drawable.superman
        val spidermanDrawableId = R.drawable.spiderman
        val aquamanDrawableId = R.drawable.aquaman
        val ironmanDrawableId = R.drawable.ironman

        var superKahramanDrawableListesi = ArrayList<Int>()
        superKahramanDrawableListesi.add(batmanDrawableId)
        superKahramanDrawableListesi.add(supermanDrawableId)
        superKahramanDrawableListesi.add(spidermanDrawableId)
        superKahramanDrawableListesi.add(aquamanDrawableId)
        superKahramanDrawableListesi.add(ironmanDrawableId)

        //Adapter

        val layoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = layoutManager

        val adapterdeneme = RecyclerAdapter(superKahramanisimleri,superKahramanDrawableListesi)
        recyclerView.adapter = adapterdeneme




    }
}