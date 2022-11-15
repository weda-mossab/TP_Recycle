package com.example.recycle

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView


class CardView (private val Govs: List<gouvernorat>,private val clickListener: ClickListenergov): RecyclerView.Adapter<CardView>()
{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardView
    {
        val from = LayoutInflater.from(parent.context)
        val binding = CardCellBinding.inflate(from, parent, false)
        return CardView(binding, clickListener)
    }

    override fun onBindViewHolder(holder: CardView, position: Int)
    {
        holder.bindGov(Govs[position])
    }

    override fun getItemCount(): Int = Govs.size
}