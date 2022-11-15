package com.example.recycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.example.recycle.databinding.ActivityMainBinding

class MainActivity :  AppCompatActivity(),ClickListener {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        populateGOV()

        val mainActivity = this
        binding.recyclerView.apply {
            layoutManager = GridLayoutManager(applicationContext, 3)
            adapter = CardAdapter(GovList, mainActivity)
        }
    }

    override fun onClick(Gov: gouvernorat)
    {
        val intent = Intent(applicationContext, Details::class.java)
        intent.putExtra(GOV_ID_EXTRA, Gov.id)
        startActivity(intent)
    }

    private fun populateGOV() {
        val ariana = Gov(
            R.drawable.ariana,
            "Ariana",
            1
        )
        GovList.add(ariana)

        val beja = Gov(
            R.drawable.beja,
            "beja",
            2
        )
        GovList.add(beja)

        val ben_arous = Gov(
            R.drawable.ben_arous,
            "ben_arous",
            3
        )
        GovList.add(ben_arous)

        val bizerte = Gov(
            R.drawable.bizerte,
            "bizerte",
            4
        )
        GovList.add(bizerte)

        val bouzid = Gov(
            R.drawable.bouzid,
            "bouzid",
            5
        )
        GovList.add(bouzid)

        val gabes = Gov(
            R.drawable.gabes,
            "gabes",
            6
        )
        GovList.add(bouzid)

        val gafsa = Gov(
            R.drawable.gafsa,
            "gafsa",
            7
        )
        GovList.add(gafsa)

        val jendouba = Gov(
            R.drawable.jendouba,
            "jendouba",
            8
        )
        GovList.add(jendouba)

        val kairaoune = Gov(
            R.drawable.kairaoune,
            "kairaoune",
            9
        )
        GovList.add(kairaoune)

        val kasserine = Gov(
            R.drawable.kasserine,
            "kasserine",
            10
        )
        GovList.add(kasserine)

        val kebili = Gov(
            R.drawable.kebili,
            "kebili",
            11
        )
        GovList.add(kebili)

        val kef = Gov(
            R.drawable.ked,
            "kef",
            12
        )
        GovList.add(kef)

        val mahdia = Gov(
            R.drawable.mahdia,
            "mahdia",
            13
        )
        GovList.add(mahdia)

        val manouba = Gov(
            R.drawable.manouba,
            "manouba",
            14
        )
        GovList.add(manouba)

        val mednine = Gov(
            R.drawable.mednine,
            "mednine",
            15
        )
        GovList.add(mednine)

        val monastir = Gov(
            R.drawable.monastir,
            "monastir",
            16
        )
        GovList.add(monastir)

        val nabel = Gov(
            R.drawable.nabel,
            "nabel",
            17
        )
        GovList.add(nabel)


        val sfax = Gov(
            R.drawable.sfax,
            "sfax",
            18
        )
        GovList.add(sfax)

        val siliana = Gov(
            R.drawable.siliana,
            "siliana",
            19
        )
        GovList.add(siliana)


        val souse = Gov(
            R.drawable.souse,
            "souse",
            20
        )
        GovList.add(souse)


        val tatouine = Gov(
            R.drawable.tatouine,
            "tatouine",
            21
        )
        GovList.add(tatouine)

        val tounes = Gov(
            R.drawable.tounes,
            "tounes",
            22
        )
        GovList.add(tounes)

        val tozer = Gov(
            R.drawable.tozer,
            "tozer",
            23
        )
        GovList.add(tozer)

        val zaghoune = Gov(
            R.drawable.zaghoune,
            "zaghoune",
            24
        )

    }


}