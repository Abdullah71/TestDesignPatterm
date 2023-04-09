package com.example.testdesignpatterns.mvvm

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.testdesignpatterns.models.SampleModel

class MVVMViewModel : ViewModel() {

//    lateinit var mutableLiveData: MutableLiveData<String>
    val mutableLiveData: MutableLiveData<String> by lazy {
        MutableLiveData<String>()
    }

    private val sm: SampleModel = SampleModel("testName MVVM", 1)

    fun getSampleModelDetail() {
        val s: String = sm.getName() + " called " + sm.getCount() + " times."
        mutableLiveData.value = s;
    }
}