package com.example.project11k.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.project11k.network.BaseServer

// this is a base class for adapters
open class BaseAdapter() : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    protected fun getServer(): String {
        return if (BaseServer.IS_TESTER) {
            BaseServer.SERVER_DEVELOPMENT
        } else {
            BaseServer.SERVER_DEPLOYMENT
        }
    }

    protected fun isEmpty(string: String?): Boolean {
        return string == null || string.trim().isEmpty()
    }

}