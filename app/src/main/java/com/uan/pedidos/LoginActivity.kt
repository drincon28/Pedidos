package com.uan.pedidos

class LoginActivity {

    fun readUserInfo(db: DataBaseRW, mail: String, password: String){
        val data = db.readData()
        var text = ""
        for (i in 0 until data.size) {
            text += (
                    data[i].getID().toString() + " " + data[i].getName() + " " + data[i].getSurname() + "\n"
                    )
        }
    }
}