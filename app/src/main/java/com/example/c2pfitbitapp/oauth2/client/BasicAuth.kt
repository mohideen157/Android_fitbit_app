package com.example.c2pfitbitapp.oauth2.client

class BasicAuth(val username: String, val password: String) {
    val header: AuthHeader
        get() = AuthHeader("Basic ${Base64.encode("$username:$password".toByteArray())}")
}