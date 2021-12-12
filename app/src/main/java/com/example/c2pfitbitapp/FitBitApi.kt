package com.example.c2pfitbitapp

/*class FitBitApi protected constructor() : DefaultApi20() {

    protected val authorizationBaseUrl: String
        get() = "https://www.fitbit.com/oauth2/authorize"
//https://www.fitbit.com/oauth2/authorize?response_type=code&client_id=22CJ69&redirect_uri=https%3A%2F%2Ffibi22CJ69&scope=activity%20heartrate%20location%20profile%20sleep
    val accessTokenEndpoint: String
        get() = "https://www.fitbit.com/oauth2/token"

    val revokeTokenEndpoint: String
        get() = "https://www.fitbit.com/oauth2/revoke"

    private object InstanceHolder {
        private val INSTANCE = FitBitApi()
    }

    fun createService(config: OAuthConfig): OAuth20Service {
        return FitBit20Service(this, config)
    }

    companion object {

        fun instance(): FitBitApi {
            return InstanceHolder.INSTANCE
        }
    }
}*/