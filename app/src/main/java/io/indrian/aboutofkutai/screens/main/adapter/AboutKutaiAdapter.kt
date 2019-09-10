package io.indrian.aboutofkutai.screens.main.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import io.indrian.aboutofkutai.R
import io.indrian.aboutofkutai.data.model.AboutKutai
import io.indrian.aboutofkutai.di.GlideApp
import kotlinx.android.synthetic.main.about_item.view.*

class AboutKutaiAdapter(private val listener: OnClickItemListener): RecyclerView.Adapter<AboutKutaiAdapter.ViewHolder>() {

    private var abouts: List<AboutKutai> = arrayListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val itemView = LayoutInflater.from(parent.context)
                .inflate(R.layout.about_item, parent, false)

        return ViewHolder(itemView)
    }

    override fun getItemCount() = abouts.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) = holder.bind(abouts[position])

    fun add(abouts: List<AboutKutai>) {

        this.abouts = abouts
        notifyDataSetChanged()
    }

    fun clear() {

        abouts = arrayListOf()
    }


    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

        fun bind(aboutKutai: AboutKutai) {

            itemView.apply {

                GlideApp.with(this)
                        .load(aboutKutai.imageUrl)
                        .into(imgBanner)
                tvTitle.text = aboutKutai.title

            }.setOnClickListener {

                listener.onClickItem(aboutKutai.id)
            }
        }
    }

    interface OnClickItemListener {

        fun onClickItem(id: Int)
    }
}