package com.example.versusscoreapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {
    private lateinit var viewModel: MainViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModel = ViewModelProvider(this)[MainViewModel::class.java]
        val playerOneTxt = findViewById<TextView>(R.id.txtScoreone)
        val playerTwoTxt = findViewById<TextView>(R.id.txtScoreTwo)
        val btnOne = findViewById<Button>(R.id.btnPlayerOne)
        val btnTwo = findViewById<Button>(R.id.btnPlayerTwo)


        viewModel.counter.observe(this, Observer {
            playerOneTxt.text = it.toString()
        })
        viewModel.counterTwo.observe(this, Observer {
            playerTwoTxt.text = it.toString()
        })

        btnOne.setOnClickListener {

            viewModel.count()

        }
        btnTwo.setOnClickListener {
            viewModel.countTwo()

        }
    }
}