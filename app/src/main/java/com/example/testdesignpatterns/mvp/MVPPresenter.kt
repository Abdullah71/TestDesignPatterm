package com.example.testdesignpatterns.mvp

import com.example.testdesignpatterns.SampleModel

class MVPPresenter(val mvpInterface: MVPInterface) {

//    private fun getSampleModel(): SampleModel {
//        return SampleModel("testName MVP", 1)
//    }
    private val sm: SampleModel = SampleModel("testName MVP", 1)
    fun getSampleModelDetail() {
        mvpInterface.onGetSampleModel(sm)
    }


//    object ObjMVPInterface : MVPInterface {
//        override fun onGetSampleModel(): SampleModel {
//            TODO("Not yet implemented")
//        }
//    }
//    val mInterface = ObjMVPInterface


}