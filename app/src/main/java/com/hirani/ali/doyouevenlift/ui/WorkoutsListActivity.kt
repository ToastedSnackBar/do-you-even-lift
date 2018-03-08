package com.hirani.ali.doyouevenlift.ui

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.hirani.ali.doyouevenlift.R
import com.hirani.ali.doyouevenlift.models.Exercise
import com.hirani.ali.doyouevenlift.models.Workout
import kotlinx.android.synthetic.main.activity_main.*
import android.support.v7.widget.DividerItemDecoration
import java.time.LocalDateTime
import java.util.*


class WorkoutsListActivity : AppCompatActivity() {

    private lateinit var adapter: WorkoutsListAdapter
    private var workout: Workout = Workout(Date(), mutableListOf())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        workout_list_rv.setHasFixedSize(true)
        workout_list_rv.layoutManager = LinearLayoutManager(this)

        val dividerItemDecoration = DividerItemDecoration(workout_list_rv.context,
                (workout_list_rv.layoutManager as LinearLayoutManager).orientation)
        workout_list_rv.addItemDecoration(dividerItemDecoration)

        workout.exercises.add(Exercise("Deadlift", 140, arrayListOf(12, 9, 10)))
        workout.exercises.add(Exercise("Squat", 120, arrayListOf(12, 11, 13)))
        workout.exercises.add(Exercise("Leg Press", 200, arrayListOf(15, 14, 16)))

        adapter = WorkoutsListAdapter(workout)
        workout_list_rv.adapter = adapter
    }
}
