package com.example.unittesting


import com.google.common.truth.Truth.assertThat
import org.junit.Test

class RegistrationUtilTest{

    @Test
    fun `empty userName return false`(){
        val result=RegistrationUtil.validateRegister("","123","123")
        assertThat(result).isFalse()
    }

    @Test
    fun `valid userName and correctly password and repeat password return true`(){
        val result=RegistrationUtil.validateRegister("joe","123","123")
        assertThat(result).isTrue()
    }

    @Test
    fun `userName already exist and correctly password and repeat password return false`(){
        val result=RegistrationUtil.validateRegister("yousef","123","123")
        assertThat(result).isFalse()
    }


    @Test
    fun `password is empty return false`(){
        val result=RegistrationUtil.validateRegister("yousef","","123")
        assertThat(result).isFalse()
    }
    @Test
    fun `password is less than 2 digit  return false`(){
        val result=RegistrationUtil.validateRegister("yousef","1hhh","1")
        assertThat(result).isFalse()
    }

    @Test
    fun `repeat password is not match password return false`(){
        val result=RegistrationUtil.validateRegister("yousef","122","123")
        assertThat(result).isFalse()
    }
}