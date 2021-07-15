package com.it_academy.android.gpstracker.utils

import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.it_academy.android.gpstracker.App
import com.it_academy.android.gpstracker.storage.AppDataBase
import com.it_academy.android.gpstracker.ui.main.MainViewModel
import java.lang.IllegalArgumentException

class ViewModelFactory(private val appDataBase: AppDataBase) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return when (modelClass) {
            MainViewModel::class.java -> MainViewModel(appDataBase.locationDao())
            else -> throw  IllegalArgumentException("Cannot find $modelClass")
        } as T
    }
}

inline val Fragment.factory: ViewModelFactory
    get() = (requireActivity().application as App).factory