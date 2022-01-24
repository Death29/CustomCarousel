package com.livecoding.myapplication

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.livecoding.myapplication.databinding.ItemCarouselBinding

class AdapterItemViewpager(val listProduct: List<DummyClassInformationProduct>) : RecyclerView.Adapter<AdapterItemViewpager.ViewHolder>() {

    inner class ViewHolder(val view: ItemCarouselBinding) : RecyclerView.ViewHolder(view.root) {
        fun bind(item: DummyClassInformationProduct){

            view.tvTitleProduct.text = item.title
            view.tvTitleDescFirst.text = item.description.substringAfterLast("\n")

            view.tvDescSec.text = item.listProfit[0]
            view.tvDescThird.text = item.listProfit[1]
            view.tvDescFour.text = item.listProfit[2]
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): AdapterItemViewpager.ViewHolder =
        ViewHolder(ItemCarouselBinding.inflate(LayoutInflater.from(parent.context), parent, false))

    override fun onBindViewHolder(holder: AdapterItemViewpager.ViewHolder, position: Int) {
        holder.bind(listProduct[position])
    }

    override fun getItemCount(): Int {
        return listProduct.size
    }
}