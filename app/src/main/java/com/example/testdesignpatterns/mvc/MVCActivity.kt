package com.example.testdesignpatterns.mvc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.example.testdesignpatterns.R
import com.example.testdesignpatterns.models.SampleModel

class MVCActivity : AppCompatActivity() {
    lateinit var btn: Button
    lateinit var txt: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mvc)

        //var btn: Button = findViewById<Button>(R.id.buttonMVC) as Button
        btn = findViewById(R.id.buttonMVC)
        txt = findViewById(R.id.textViewMVC)

    }

//    private fun getSampleModel(): SampleModel {
//        return SampleModel("testName", 1)
//    }
    private val sm: SampleModel = SampleModel("testName MVC", 1)

    fun displaySampleModel(view: View) {
        val s: String = sm.getName() + " called " + sm.getCount() + " times."
        txt.text = s
    }
}