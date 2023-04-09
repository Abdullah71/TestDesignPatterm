package com.example.testdesignpatterns.mvp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.example.testdesignpatterns.R
import com.example.testdesignpatterns.models.SampleModel

class MVPActivity : AppCompatActivity(), MVPInterface {

    lateinit var btn: Button
    lateinit var txt: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mvp)

        btn = findViewById(R.id.buttonMVP)
        txt = findViewById(R.id.textViewMVP)
    }

    private val mvpPresenter: MVPPresenter = MVPPresenter(this)

    fun displaySampleModel(view: View) {
        mvpPresenter.getSampleModelDetail()
    }

    override fun onGetSampleModel(sm: SampleModel) {
        val s: String = sm.getName() + " called " + sm.getCount() + " times."
        txt.text = s
    }


}