package com.example.unittesting

object RegistrationUtil {

    val listOfUsers= listOf("sayed","yousef","mohamed")
    /**
     * the input not valid
     * if username or password is empty
     * if userName already taken
     * confirmed password is not real password
     * password contains less than 2 digit
     * */

    fun validateRegister(userName:String,password:String,confirmedPassword:String):Boolean{
        if (userName.isBlank() || password.isBlank())
            return false
        if (userName in listOfUsers)
            return false
        if (password.count{it-> it.isDigit()}<2)
            return false
        if (password!=confirmedPassword)
            return false
        return true
    }
}