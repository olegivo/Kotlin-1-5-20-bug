package com.example.myapplication

import org.junit.Assert.assertEquals
import org.junit.Test

data class DataResponse<T>(@JvmField val data: T)
data class SomeDataContainer(@JvmField val someData: String)

data class DataResponse2<T>(val data: T)
data class SomeDataContainer2(val someData: String)

class UnitTest {
    @Test
    fun fail() {
        val someData = "some data"
        val response = DataResponse(SomeDataContainer(someData))
        assertEquals(someData, response.data.someData)
    }

    @Test
    fun success() {
        val someData = "some data"
        val response = DataResponse2(SomeDataContainer2(someData))
        assertEquals(someData, response.data.someData)
    }
}