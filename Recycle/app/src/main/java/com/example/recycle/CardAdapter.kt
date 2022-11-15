package com.example.recycle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.tprecycle.databinding.CardCellBinding


class CardAdapter (private val Govs: List<gouvernorat>,private val clickListener: ClickListener): RecyclerView.Adapter<CardView>()
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