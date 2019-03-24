package com.muaaru.testnavigationcomponent.grid


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.muaaru.testnavigationcomponent.R
import com.muaaru.testnavigationcomponent.grid.dummy.DummyContent.DummyItem


class MyRecyclerViewAdapter(
    private val mValues: List<DummyItem>,
    private val listener: TransitionSourceGridFragment.ItemClickListener
) : RecyclerView.Adapter<MyRecyclerViewAdapter.ItemViewHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ItemViewHolder {
        return ItemViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.fragment_transitionsourcegrid, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = mValues[position]
        val transitionView = holder.itemView.findViewById<View>(R.id.imageView)
        transitionView.transitionName = item.id

        holder.itemView.findViewById<TextView>(R.id.item_number).text = item.id
        holder.itemView.findViewById<TextView>(R.id.content).text = item.content
        holder.itemView.setOnClickListener {
            listener.onClickItem(transitionView)
        }
    }

    override fun getItemCount(): Int = mValues.size

    inner class ItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
}
