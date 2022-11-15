package com.example.myadventscalendar

import android.os.Bundle
import android.widget.AdapterView
import android.widget.GridView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlin.collections.ArrayList

class AdventCalendarActivity : AppCompatActivity() {
    // on below line we are creating
    // variables for grid view and course list
    lateinit var courseGRV: GridView
    lateinit var dayList: List<GridViewModal>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.adventcalendar)

        // initializing variables of grid view with their ids.
        courseGRV = findViewById(R.id.idGRV)
        dayList = ArrayList<GridViewModal>()

        // on below line we are adding data to
        // our course list with image and course name.
        dayList = dayList + GridViewModal("1", R.drawable.cat)
        dayList = dayList + GridViewModal("2", R.drawable.coffee)
        dayList = dayList + GridViewModal("3", R.drawable.cookies)
        dayList = dayList + GridViewModal("4", R.drawable.sweets)
        dayList = dayList + GridViewModal("5", R.drawable.cat)
        dayList = dayList + GridViewModal("6", R.drawable.coffee)
        dayList = dayList + GridViewModal("7", R.drawable.cookies)
        dayList = dayList + GridViewModal("8", R.drawable.sweets)
        dayList = dayList + GridViewModal("9", R.drawable.cat)
        dayList = dayList + GridViewModal("10", R.drawable.coffee)
        dayList = dayList + GridViewModal("11", R.drawable.cookies)
        dayList = dayList + GridViewModal("12", R.drawable.sweets)
        dayList = dayList + GridViewModal("13", R.drawable.cat)
        dayList = dayList + GridViewModal("14", R.drawable.coffee)
        dayList = dayList + GridViewModal("15", R.drawable.cookies)
        dayList = dayList + GridViewModal("16", R.drawable.sweets)
        dayList = dayList + GridViewModal("17", R.drawable.cat)
        dayList = dayList + GridViewModal("18", R.drawable.coffee)
        dayList = dayList + GridViewModal("19", R.drawable.cookies)
        dayList = dayList + GridViewModal("20", R.drawable.sweets)
        dayList = dayList + GridViewModal("21", R.drawable.cat)
        dayList = dayList + GridViewModal("22", R.drawable.coffee)
        dayList = dayList + GridViewModal("23", R.drawable.cookies)
        dayList = dayList + GridViewModal("24", R.drawable.sweets)
        // on below line we are initializing our course adapter
        // and passing course list and context.
        val courseAdapter = GridRVAdapter(dayList = dayList, this@AdventCalendarActivity)

        // on below line we are setting adapter to our grid view.
        courseGRV.adapter = courseAdapter

        // on below line we are adding on item
        // click listener for our grid view.
        courseGRV.onItemClickListener = AdapterView.OnItemClickListener { _, _, position, _ ->
            // inside on click method we are simply displaying
            // a toast message with course name.
            Toast.makeText(
                applicationContext, dayList[position].day + " selected",
                Toast.LENGTH_SHORT
            ).show()
        }

    }
}
