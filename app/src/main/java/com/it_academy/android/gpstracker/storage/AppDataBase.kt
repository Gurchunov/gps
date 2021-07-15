package com.it_academy.android.gpstracker.storage

import androidx.room.Database
import androidx.room.RoomDatabase
import com.it_academy.android.gpstracker.storage.dao.LocationDao
import com.it_academy.android.gpstracker.storage.entity.LocationEntity

@Database(version = 1, exportSchema = false, entities = [LocationEntity::class])
 abstract class AppDataBase: RoomDatabase() {
     abstract fun locationDao(): LocationDao
}