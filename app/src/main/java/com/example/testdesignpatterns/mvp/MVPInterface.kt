package com.example.testdesignpatterns.mvp

import com.example.testdesignpatterns.models.SampleModel

interface MVPInterface {

    fun onGetSampleModel(sm: SampleModel)
}