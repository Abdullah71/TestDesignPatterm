package com.example.testdesignpatterns

class SampleModel(name: String, id: Int) {

    var sName: String = name
    var nId: Int = id
    var nCount: Int = 0

    init {
        println("SampleModel: $sName, $nId")
    }

    constructor(name: String, id: Int, count: Int) : this(name, id) {
        nCount = count
        println("SampleModel: $sName, $nId, $nCount")
    }

    fun getName(): String {
        return sName
    }
    fun getCount(): Int {
        return ++nCount
    }

}