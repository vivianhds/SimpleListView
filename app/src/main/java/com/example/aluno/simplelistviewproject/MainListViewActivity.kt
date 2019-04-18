package com.example.aluno.simplelistviewproject

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.widget.ArrayAdapter
import android.widget.ListView

import kotlinx.android.synthetic.main.activity_main_list_view.*

class MainListViewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_list_view)
        setSupportActionBar(toolbar)

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }
        val arrayLinhasListView = ArrayList<String>()
        arrayLinhasListView.add("Linha 1")
        arrayLinhasListView.add("Linha 2")
        arrayLinhasListView.add("Linha 3")
        arrayLinhasListView.add("Linha 4")

        val lv: ListView = findViewById(R.id.minhaprimeiralistview)
        lv.adapter = ArrayAdapter(
                this,
                android.R.layout.simple_list_item_1,
                arrayLinhasListView)
        }
    }


