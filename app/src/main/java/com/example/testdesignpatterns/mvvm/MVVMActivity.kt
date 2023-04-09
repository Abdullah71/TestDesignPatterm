package com.example.testdesignpatterns.mvvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import com.example.testdesignpatterns.databinding.ActivityMvvmBinding

class MVVMActivity : AppCompatActivity() {

//    lateinit var btn: Button
//    lateinit var txt: TextView

    private lateinit var _mvvmBinding: ActivityMvvmBinding
    private val _mvvmViewModel: MVVMViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_mvvm)
//        btn = findViewById(R.id.buttonMVVM)
//        txt = findViewById(R.id.textViewMVVM)
        _mvvmBinding = ActivityMvvmBinding.inflate(layoutInflater)
        setContentView(_mvvmBinding.root)

//        val mvvmObserver = Observer<String> { newChange ->
////            txt.text = newChange
//            _mvvmBinding.textViewMVVM.text = newChange
//        }
//        _mvvmViewModel.mutableLiveData.observe(this, mvvmObserver)

        _mvvmBinding.viewModel = _mvvmViewModel
        _mvvmBinding.lifecycleOwner = this
    }

    fun displaySampleModel(view: View) {
        _mvvmViewModel.getSampleModelDetail()
    }

}