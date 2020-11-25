package com.uan.pedidos

class User (mail: String, names: String, userID: Int, surname: String, upassword: String, phoneNumber: Int){

    private var mail: String = ""

    private var names: String = ""

    private var userID: Int = 0

    private var surname = ""

    private var upassword = ""

    private var phoneNumber = 0

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

    fun setPhoneNumber(phoneNumber: Int){
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

    fun getPhoneNumber(): Int {
        return this.phoneNumber
    }

    fun getID(): Int {
        return this.userID
    }
}