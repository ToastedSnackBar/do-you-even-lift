package com.hirani.ali.doyouevenlift.ui

import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.View
import android.view.ViewGroup
import com.hirani.ali.doyouevenlift.R
import com.hirani.ali.doyouevenlift.inflate
import com.hirani.ali.doyouevenlift.models.Workout
import kotlinx.android.synthetic.main.workout_rv_item.view.*

class WorkoutsListAdapter(private val workout: Workout?) : RecyclerView.Adapter<WorkoutsListAdapter.WorkoutHolder>() {
    override fun getItemCount(): Int {
        return workout?.exercises?.size ?: 0
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WorkoutHolder {
        val inflatedView = parent.inflate(R.layout.workout_rv_item)
        return WorkoutHolder(inflatedView)
    }

    override fun onBindViewHolder(holder: WorkoutHolder, position: Int) {
        val exercise = workout?.exercises?.get(position)

        holder.itemView.workout_name_tv.text = exercise?.name
        holder.itemView.workout_reps_tv.text = exercise?.reps.toString()
        holder.itemView.workout_weight_tv.text = exercise?.weight.toString()
    }

    class WorkoutHolder(v: View) : RecyclerView.ViewHolder(v), View.OnClickListener {
        private var view: View = v
        private var workout: String? = null

        init {
            view.setOnClickListener(this)
        }

        override fun onClick(v: View?) {
            Log.d("WorkoutsListAdapter", "Item Clicked: " + workout)
        }
    }
}
