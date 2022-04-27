package dev.chu.infos

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import dev.chu.infos.databinding.ItemMainBinding
import dev.chu.infos.model.News

class MainAdapter : RecyclerView.Adapter<MainAdapter.MainViewHolder>() {

    var items: MutableList<News> = mutableListOf()
        set(value) {
            if (field != value) {
                items.clear()
                items.addAll(value)
            }
            notifyItemRangeChanged(0, items.size)
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding: ItemMainBinding =
            DataBindingUtil.inflate(inflater, R.layout.item_main, parent, false)
        return MainViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        holder.bind(items[position])
    }

    override fun getItemCount(): Int = items.size

    class MainViewHolder(
        private val binding: ItemMainBinding
    ) : RecyclerView.ViewHolder(binding.root) {
        fun bind(item: News) {
            binding.item = item
            binding.executePendingBindings()
        }
    }
}