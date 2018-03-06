package com.hirani.ali.doyouevenlift.ui

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.hirani.ali.doyouevenlift.R
import kotlinx.android.synthetic.main.activity_main.*

class WorkoutsListActivity : AppCompatActivity() {

    private lateinit var adapter: WorkoutsListAdapter
    private var workoutsList: List<String> = listOf("Bench Press", "Squats", "Curls")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        workout_list_rv.setHasFixedSize(true)
        workout_list_rv.layoutManager = LinearLayoutManager(this)

        adapter = WorkoutsListAdapter(workoutsList)
        workout_list_rv.adapter = adapter
    }
}
