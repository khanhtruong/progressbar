package com.khanhth.filtertemplate

import android.os.Bundle
import android.widget.Button
import android.widget.ProgressBar
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.google.android.flexbox.*
import com.khanhth.filtertemplate.adapter.FilterAdapter


class MainActivity : AppCompatActivity() {

    private val listItem = arrayListOf("Golang", "Elixir", "Kotlin", "Swift", "Java", "PHP", "JavaScript", "CSS", "Golang", "Elixir", "Kotlin", "Swift", "Java", "PHP", "JavaScript", "CSS", "Golang", "Elixir", "Kotlin", "Swift", "Java", "PHP", "JavaScript", "CSS")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupRecyclerView()
        setupClick()
    }

    private fun setupClick() {
        val progressBar = findViewById<ProgressBar>(R.id.pb_investing)
        findViewById<Button>(R.id.btn_increase)?.let{btn ->
            btn.setOnClickListener {
                progressBar.incrementProgressBy(10)
            }
        }
    }

    private fun setupRecyclerView() {
        val adapter = FilterAdapter(listItem)
        val layoutManager = object : FlexboxLayoutManager(this) {
            override fun canScrollVertically(): Boolean {
                return false
            }
        }
        layoutManager.flexDirection = FlexDirection.ROW
        layoutManager.justifyContent = JustifyContent.SPACE_EVENLY
        findViewById<RecyclerView>(R.id.rv_filter_search)?.also {
            it.layoutManager = layoutManager
            it.adapter = adapter
        }
    }
}