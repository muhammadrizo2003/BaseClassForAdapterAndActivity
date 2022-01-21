package com.example.project11k.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.project11k.R
import com.example.project11k.activity.MainActivity
import com.example.project11k.model.Member
import kotlinx.android.synthetic.main.item_custom_layout.view.*


// this is a simple recycler view adapter
data class CustomMainAdapter(
    private val context: Context,
    private val members: ArrayList<Member>,
    private val mainActivity: MainActivity
) :
    BaseAdapter() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return CustomViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_custom_layout, parent, false)
        )
    }

    override fun getItemViewType(position: Int): Int {
        return super.getItemViewType(position)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val member = members[position]

        // set data to item
        if (holder is CustomViewHolder) {
            holder.textView.text = member.name
            holder.layoutForClick.setOnClickListener {
                mainActivity.openDetailsPage(position)
            }
        }
    }

    override fun getItemCount(): Int {
        return members.size
    }

    // garbage function))
    fun functions(string: String) {
        isEmpty(string)
        getServer()
    }

    private data class CustomViewHolder(
        val itemView: View,
        val textView: TextView = itemView.text_view_title,
        val layoutForClick: LinearLayout = itemView.layout_for_click
    ) : RecyclerView.ViewHolder(itemView)
}

