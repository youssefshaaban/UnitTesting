package com.example.unittesting

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import com.google.common.truth.Truth.assertThat
import org.junit.Before
import org.junit.Test


class ResourcesComparerTest{
    lateinit var resourcesComparer:ResourcesComparer


    @Before
    fun setUp(){
        resourcesComparer= ResourcesComparer()
    }

    @Test
    fun stringResoursesTheSameAsGivenString_returnTrue(){
        val context=ApplicationProvider.getApplicationContext<Context>()
        val result=resourcesComparer.isEqual(context,R.string.app_name,"UnitTesting")
        println(resourcesComparer.toString())
        assertThat(result).isTrue()
    }

    @Test
    fun stringResoursesDifferentAsGivenString_returnFalse(){
        val context=ApplicationProvider.getApplicationContext<Context>()
        val result=resourcesComparer.isEqual(context,R.string.app_name,"UnitTeffsting")
        print(resourcesComparer.toString())
        assertThat(result).isFalse()
    }

}