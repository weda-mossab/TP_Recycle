package com.example.example

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView.OnItemClickListener
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter (
    private val mydDataSet: ArrayList<String>,
    private val listener: OnItemClickListener):
    RecyclerView.Adapter<MyAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyAdapter.ViewHolder {
        val vh = LayoutInflater.from(parent.context).inflate(R.layout.element,parent,false)
        return ViewHolder(vh)
    }

    override fun onBindViewHolder(holder: MyAdapter.ViewHolder, position: Int) {
        var current = mydDataSet[position]
        holder.vText.text = current.toString()
    }

    override fun getItemCount(): Int {
        return mydDataSet.size
    }

    inner class ViewHolder(val itemview : View):RecyclerView.ViewHolder(itemview),View.OnClickListener{
        val vText= itemView.findViewById(R.id.word) as TextView

        /* fun MyViewHolder(itemView: View, adapter: MyAdapter) {
             super(itemView)
             itemtext = itemView.findViewById<View>(android.R.id.itemtext)
             myadapter = adapter
         }*/
        init {
            itemView.setOnClickListener(this)
        }

        @SuppressLint("SuspiciousIndentation")
        override fun onClick(p0: View?) {
        val position = adapterPosition
            if ( position != RecyclerView.NO_POSITION){
                listener.onItemClick(position)
            }
        }
    }

    interface OnItemClickListener{
        fun onItemClick(position: Int)
    }
}






