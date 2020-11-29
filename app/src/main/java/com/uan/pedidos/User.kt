package com.uan.pedidos

class User (names: String, surname: String, mail: String, phoneNumber: String, upassword: String){

    private var mail: String = ""

    private var names: String = ""

    private var userID: Int = 0

    private var surname = ""

    private var upassword = ""

    private var phoneNumber = ""

    /* SETTERS */
    fun setID(userID: Int){
        this.userID = userID
    }

    fun setName(names: String){
        this.names = names
    }

    fun setSurname(surname: String){
        this.surname = surname
    }

    fun setMail(mail: String){
        this.mail = mail
    }

    fun setPassword(upassword: String){
        this.upassword = upassword
    }

    fun setPhoneNumber(phoneNumber: String){
        this.phoneNumber = phoneNumber
    }

    /* GETTERS */

    fun getMail(): String {
        return this.mail
    }

    fun getName(): String {
        return this.names
    }

    fun getSurname(): String {
        return this.surname
    }

    fun getPassword(): String {
        return this.upassword
    }

    fun getPhoneNumber(): String {
        return this.phoneNumber
    }

    fun getID(): Int {
        return this.userID
    }
}