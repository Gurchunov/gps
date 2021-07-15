package com.it_academy.android.gpstracker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.it_academy.android.gpstracker.ui.main.MainFragment
import com.it_academy.android.gpstracker.ui.main.MapsFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, MapsFragment.newInstance())
                .commitNow()
        }
    }
}