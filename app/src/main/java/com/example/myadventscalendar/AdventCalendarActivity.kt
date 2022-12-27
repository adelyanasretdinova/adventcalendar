package com.example.myadventscalendar


import android.content.Intent
import android.os.Bundle
import android.widget.AdapterView
import android.widget.GridView
import androidx.appcompat.app.AppCompatActivity
import com.example.myadventscalendar.FullPhoto.Companion.KEY_PHOTO

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
        dayList = dayList + GridViewModal("1", R.drawable.santa)
        dayList = dayList + GridViewModal("2", R.drawable.santa)
        dayList = dayList + GridViewModal("3", R.drawable.santa)
        dayList = dayList + GridViewModal("4", R.drawable.santa)
        dayList = dayList + GridViewModal("5", R.drawable.santa)
        dayList = dayList + GridViewModal("6", R.drawable.santa)
        dayList = dayList + GridViewModal("7", R.drawable.santa)
        dayList = dayList + GridViewModal("8", R.drawable.santa)
        dayList = dayList + GridViewModal("9", R.drawable.santa)
        dayList = dayList + GridViewModal("10", R.drawable.santa)
        dayList = dayList + GridViewModal("11", R.drawable.santa)
        dayList = dayList + GridViewModal("12", R.drawable.santa)
        dayList = dayList + GridViewModal("13", R.drawable.santa)
        dayList = dayList + GridViewModal("14", R.drawable.santa)
        dayList = dayList + GridViewModal("15", R.drawable.santa)
        dayList = dayList + GridViewModal("16", R.drawable.santa)
        dayList = dayList + GridViewModal("17", R.drawable.santa)
        dayList = dayList + GridViewModal("18", R.drawable.santa)
        dayList = dayList + GridViewModal("19", R.drawable.santa)
        dayList = dayList + GridViewModal("20", R.drawable.santa)
        dayList = dayList + GridViewModal("21", R.drawable.santa)
        dayList = dayList + GridViewModal("22", R.drawable.santa)
        dayList = dayList + GridViewModal("23", R.drawable.santa)
        dayList = dayList + GridViewModal("24", R.drawable.santa)
        // on below line we are initializing our course adapter
        // and passing course list and context.
        val courseAdapter = GridRVAdapter(dayList = dayList, this@AdventCalendarActivity)

        // on below line we are setting adapter to our grid view.
        courseGRV.adapter = courseAdapter

        // on below line we are adding on item
        // click listener for our grid view.

        class Content(val photo: Int)

        val contentPhotoText1 =
            Content(R.drawable.cat)
        val contentPhotoText2 = Content(R.drawable.bells)
        val contentPhotoText3 = Content(R.drawable.cookies)
        val contentPhotoText4 =
            Content(R.drawable.cat)
        val contentPhotoText5 = Content(R.drawable.bells)
        val contentPhotoText6 = Content(R.drawable.cookies)
        val contentPhotoText7 =
            Content(R.drawable.cat)
        val contentPhotoText8 = Content(R.drawable.bells)
        val contentPhotoText9 = Content(R.drawable.cookies)
        val contentPhotoText10 =
            Content(R.drawable.cat)
        val contentPhotoText11 = Content(R.drawable.bells)
        val contentPhotoText12 = Content(R.drawable.cookies)
        val contentPhotoText13 =
            Content(R.drawable.cat)
        val contentPhotoText14 = Content(R.drawable.bells)
        val contentPhotoText15 = Content(R.drawable.cookies)
        val contentPhotoText16 =
            Content(R.drawable.cat)
        val contentPhotoText17 = Content(R.drawable.bells)
        val contentPhotoText18 = Content(R.drawable.cookies)
        val contentPhotoText19 =
            Content(R.drawable.cat)
        val contentPhotoText20 = Content(R.drawable.bells)
        val contentPhotoText21 = Content(R.drawable.cookies)
        val contentPhotoText22 =
            Content(R.drawable.cat)
        val contentPhotoText23 = Content(R.drawable.bells)
        val contentPhotoText24 = Content(R.drawable.cookies)
        val array = arrayListOf (
            contentPhotoText1,
            contentPhotoText2,
            contentPhotoText3,
            contentPhotoText4,
            contentPhotoText5,
            contentPhotoText6,
            contentPhotoText7,
            contentPhotoText8,
            contentPhotoText9,
            contentPhotoText10,
            contentPhotoText11,
            contentPhotoText12,
            contentPhotoText13,
            contentPhotoText14,
            contentPhotoText15,
            contentPhotoText16,
            contentPhotoText17,
            contentPhotoText18,
            contentPhotoText19,
            contentPhotoText20,
            contentPhotoText21,
            contentPhotoText22,
            contentPhotoText23,
            contentPhotoText24
        )


        courseGRV.onItemClickListener = AdapterView.OnItemClickListener { _, _, position, _ ->
            // inside on click method we are simply displaying
            // a toast message with course name.
//

            val intent = Intent(this, FullPhoto::class.java)
            intent.putExtra(KEY_PHOTO, array[dayList[position-1].day.toInt()].photo)
            startActivity(intent)
        }



    }

}
