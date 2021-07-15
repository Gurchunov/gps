package com.it_academy.android.gpstracker

import android.app.Application
import androidx.room.Room
import com.it_academy.android.gpstracker.storage.AppDataBase
import com.it_academy.android.gpstracker.utils.ViewModelFactory

class App: Application() {
    lateinit var factory: ViewModelFactory
    lateinit var dateBase: AppDataBase

    override fun onCreate() {
        super.onCreate()
        dateBase =  Room.
//           databaseBuilder(this, AppDataBase::class.java, "database")
       inMemoryDatabaseBuilder(this, AppDataBase::class.java)
           .build()

        factory = ViewModelFactory(dateBase)
    }
}