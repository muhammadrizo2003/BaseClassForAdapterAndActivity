package com.example.project11k.activity

import androidx.appcompat.app.AppCompatActivity
import com.example.project11k.model.Member
import com.example.project11k.network.BaseServer

// this is a base activity for activities
open class BaseActivity : AppCompatActivity() {

    protected fun getServer(): String {
        return if (BaseServer.IS_TESTER) {
            BaseServer.SERVER_DEVELOPMENT
        } else {
            BaseServer.SERVER_DEPLOYMENT
        }
    }

    protected fun prepareMemberList(): ArrayList<Member> {
        val list = ArrayList<Member>()

        for (i in 1..30) {
            list.add(Member("Member", "Member"))
        }
        return list
    }

    protected fun isEmpty(string: String?): Boolean {
        return string == null || string.trim().isEmpty()
    }

}