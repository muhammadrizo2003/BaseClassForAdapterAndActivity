package com.example.project11k.activity

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.project11k.R
import com.example.project11k.adapter.CustomMainAdapter
import com.example.project11k.model.Member
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var context: Context

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()

        refreshAdapter(prepareMemberList())

    }

    private fun initViews() {
        context = this
        recyclerView = main_recycler_view
        recyclerView.layoutManager = GridLayoutManager(context, 1)
    }

    private fun refreshAdapter(list: ArrayList<Member>) {
        val adapter = CustomMainAdapter(context, list, this)
        recyclerView.adapter = adapter
    }

    fun openDetailsPage(position: Int) {
        startActivity(Intent(this, DetailsActivity::class.java))
    }
}


