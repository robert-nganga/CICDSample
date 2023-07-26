package com.example.myapplication

import junit.framework.TestCase.assertEquals
import org.junit.Before
import org.junit.Test

class AgeViewModelTest {

    private lateinit var ageViewModel: AgeViewModel

    @Before
    fun setup() {
        ageViewModel = AgeViewModel()
    }

    @Test
    fun getAge_correctInput_returnsCorrectAge() {
        ageViewModel.getAge(1988)
        val res = ageViewModel.age
        assertEquals("35", res)
    }
}