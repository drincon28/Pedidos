package com.uan.pedidos

import android.content.Context
import android.widget.Toast

class SignUpActivity {

    fun saveUserInfo(db: DataBaseRW, c: Context, mail: String, names: String, ID: Int, surname: String, upassword: String, phoneNumber: Int){
        val user = User(mail, names, ID, surname, upassword, phoneNumber)
        db.insertData(user)
        Toast.makeText(c, "Please Fill All Data's", Toast.LENGTH_SHORT).show()
    }
}