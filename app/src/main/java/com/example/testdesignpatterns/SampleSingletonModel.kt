package com.example.testdesignpatterns

class SampleSingletonModel private constructor(name: String, id: Int) {

    lateinit var sName: String
    var nId: Int = 0
    var nCount: Int = 0;

    companion object {
        private var instance : SampleSingletonModel? = null
        fun  getInstance(name: String, id: Int): SampleSingletonModel {
            if (instance == null) {
                instance = SampleSingletonModel(name, id)
            } else {
                instance!!.sName = name;
                instance!!.nId = id
            }

            return instance!!
        }
    }
}