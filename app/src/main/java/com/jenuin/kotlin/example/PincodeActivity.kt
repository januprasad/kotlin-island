package com.jenuin.kotlin.example

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.os.StrictMode
import android.widget.TextView
import example.jenuine.upi_sample.Channel


class PincodeActivity : AppCompatActivity() {

    private lateinit var logger: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val policy = StrictMode.ThreadPolicy.Builder().permitAll().build()
        StrictMode.setThreadPolicy(policy)
        setContentView(R.layout.activity_pincode)


//        val buttonSubmit: Button = findViewById(R.id.buttonSubmit) as Button
//        val editTextInput = findViewById(R.id.editTextPinCode) as EditText
//        logger = findViewById(R.id.app_log) as TextView
//
//        buttonSubmit.setOnClickListener({
//            if (!isEmpty(editTextInput)) {
//                val string = editTextInput.text.toString().trim()
//                Log.v("TAG", string)
//                getPincode(string)
//            }
//        })
//
//        appLogger("");


    }

    private fun isEmpty(edtText: EditText): Boolean {
        return edtText.text.toString().trim().length == 0
    }

    private fun getPincode(pinCode: String) {

        val restAPI: RestAPI = RestAPI()
        var call = restAPI.getPinCode(pinCode)
        val response = call.execute()
        if (response.isSuccessful && response.body().status == "Success") {
            val place = response.body()
            appLogger(buildString(pinCode, place.postOffice[0].name))
            Log.v("response", place.postOffice[0].name)
        }
    }

    private fun appLogger(logMessage: String) {
        logger.append(logMessage)
        logger.append("\n")
    }

    private fun buildString(pinCode: String, place: String): String {
        return String.format("You have searched %s and it belongs to %s", pinCode, place)
    }
}
