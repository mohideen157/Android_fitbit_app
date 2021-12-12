package com.example.c2pfitbitapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.c2pfitbitapp.ProgressCircle.setProgressDialog
import com.example.c2pfitbitapp.oauth2.client.jersey.oauth2Client
import com.example.c2pfitbitapp.oauth2.client.loader.PromptApproval
import java.net.URI

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        println("oauth2 start...")
        /*val client = oauth2Client().clientFlow(
            URI("https://www.fitbit.com/oauth2/authorize"),
            "22B5BM",
            "9eee494ffe884739116a9e586203e8f2",
            listOf("activity "+"heartrate "+"location "+"profile "+"sleep"))*/
        val clientAuth = oauth2Client().codeFlowURI(
               URI("https://www.fitbit.com/oauth2/authorize"),
               clientID = "22B5BM",
               redirectURI = URI("https://finished"),
               scope = listOf("activity "+"heartrate "+"location "+"profile "+"sleep"),
               state = "",
               prompt = PromptApproval.FORCE)
        println(clientAuth.parseServerAuthority())
        println("oauth2 end...")
        val button = findViewById<Button>(R.id.btnSubmit)
        button.setOnClickListener {
            val dialog = setProgressDialog(this, "Loading..")
            dialog.show()
        }



    }
}
