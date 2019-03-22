package com.muaaru.testnavigationcomponent.grid

import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import com.muaaru.testnavigationcomponent.R
import com.muaaru.testnavigationcomponent.databinding.FragmentTransitionsourcegridBinding


import com.muaaru.testnavigationcomponent.grid.dummy.DummyContent.DummyItem

class MyTransitionSourceGridRecyclerViewAdapter(
    private val mValues: List<DummyItem>,
    private val listner: TransitionSourceGridFragment.ItemClickListener
) : RecyclerView.Adapter<MyTransitionSourceGridRecyclerViewAdapter.DataBoundViewHolder<FragmentTransitionsourcegridBinding>>() {

    private val mOnClickListener: View.OnClickListener

    private lateinit var dataBinding: FragmentTransitionsourcegridBinding

    init {
        mOnClickListener = View.OnClickListener { targetView ->
            val item = targetView.tag as DummyItem
            listner.onClickItem(targetView, item)
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): DataBoundViewHolder<FragmentTransitionsourcegridBinding> {
        dataBinding = DataBindingUtil
            .inflate(
                LayoutInflater.from(parent.context),
                R.layout.fragment_transitionsourcegrid,
                parent,
                false
            )
        return DataBoundViewHolder(dataBinding)
    }

    override fun onBindViewHolder(holder: DataBoundViewHolder<FragmentTransitionsourcegridBinding>, position: Int) {
        val item = mValues[position]
        holder.binding.item = item
        holder.binding.root.setOnClickListener {
            listner.onClickItem(holder.binding.imageView, item)
        }
        holder.binding.executePendingBindings()
    }

    override fun getItemCount(): Int = mValues.size

    inner class DataBoundViewHolder<out T : ViewDataBinding> constructor(val binding: T) :
        RecyclerView.ViewHolder(binding.root)
}
