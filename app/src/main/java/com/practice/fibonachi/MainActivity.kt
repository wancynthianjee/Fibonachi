package com.practice.fibonachi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlin.Number as Number1

class MainActivity : AppCompatActivity() {
    lateinit var rvNumbers: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvNumbers = findViewById(R.id.rvNumbers)

        val numbers = listOf(1, 100)

        val numbersAdapter = FibonachiRvAdapter()
        rvNumbers.layoutManager = LinearLayoutManager(this)
        numbersAdapter.also { rvNumbers.adapter  }
    }
}




}