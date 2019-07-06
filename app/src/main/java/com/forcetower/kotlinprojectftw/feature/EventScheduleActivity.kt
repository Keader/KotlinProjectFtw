package com.forcetower.kotlinprojectftw.feature

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.forcetower.kotlinprojectftw.R

class EventScheduleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_event_schedule)
        if (savedInstanceState == null){
            supportFragmentManager.beginTransaction()
                .add(R.id.fragment_container, ScheduleFragment(), "scedule")
                .commit()
        }
    }
}