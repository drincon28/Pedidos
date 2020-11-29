package com.uan.pedidos

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.ui.AppBarConfiguration
import com.google.android.material.textfield.TextInputEditText

class SignUpActivity: AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_signup)

        val btnSignUp = findViewById<Button>(R.id.btn_signup)

        val inputNames = findViewById<TextInputEditText>(R.id.signup_form_names_input)
        val inputSurNames = findViewById<TextInputEditText>(R.id.signup_form_surnames_input)
        val inputMail = findViewById<EditText>(R.id.signup_form_mail_input)
        val inputPhone = findViewById<EditText>(R.id.signup_form_phone_input)
        val inputPassword = findViewById<EditText>(R.id.signup_form_password_input)

        val dbObj = DataBaseRW(baseContext)

        btnSignUp.setOnClickListener {

            saveUserInfo(
                dbObj,
                baseContext,
                inputNames.text.toString(),
                inputSurNames.text.toString(),
                inputMail.text.toString(),
                inputPhone.text.toString(),
                inputPassword.text.toString(),
            )

            val i = Intent(this@SignUpActivity, SignUpConfirmationActivity::class.java)

            /*
            val bundle = Bundle()
            bundle.putString("profileDescription", readUserProfilesDescription(0)[1])
            i.putExtras(bundle)
            startActivityForResult(i, reqCode)
            */
            startActivity(i)
        }
    }

    private fun saveUserInfo(db: DataBaseRW, c: Context, names: String, surname: String, mail: String, phoneNumber: String, uPassword: String){
        val user = User(mail, names, surname, uPassword, phoneNumber)
        db.insertData(user)
        Toast.makeText(c, "Please Fill All Data's", Toast.LENGTH_SHORT).show()
    }
}