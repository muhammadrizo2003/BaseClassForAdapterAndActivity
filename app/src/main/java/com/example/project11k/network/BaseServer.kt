package com.example.project11k.network

// this interface is for server
interface BaseServer {
    companion object {
        val IS_TESTER: Boolean
            get() = false

        val SERVER_DEVELOPMENT: String
            get() = "www.demo.com"

        val SERVER_DEPLOYMENT: String
            get() = "https://demo.com"

    }
}

