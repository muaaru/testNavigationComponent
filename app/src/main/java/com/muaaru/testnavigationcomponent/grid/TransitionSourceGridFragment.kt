package com.muaaru.testnavigationcomponent.grid

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.fragment.FragmentNavigatorExtras
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.muaaru.testnavigationcomponent.R
import com.muaaru.testnavigationcomponent.grid.dummy.DummyContent

class TransitionSourceGridFragment : Fragment() {

    private var columnCount = 4

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_transitionsourcegrid_list, container, false)

        // Set the adapter
        if (view is RecyclerView) {
            with(view) {
                layoutManager = when {
                    columnCount <= 1 -> LinearLayoutManager(context)
                    else -> GridLayoutManager(context, columnCount)
                }
                adapter = MyRecyclerViewAdapter(
                    DummyContent.ITEMS,
                    object : ItemClickListener {
                        override fun onClickItem(transitionView: View) {
                            view.findNavController().navigate(
                                TransitionSourceGridFragmentDirections.actionTransitionSourceGridFragmentToTransitionDestinationGridFragment(
                                    transitionView.transitionName
                                ),
                                FragmentNavigatorExtras(
                                    transitionView to transitionView.transitionName
                                )
                            )
                        }
                    }
                )
            }
        }
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        postponeEnterTransition()
        view.viewTreeObserver
            .addOnPreDrawListener {
                startPostponedEnterTransition()
                true
            }
    }

    interface ItemClickListener {
        fun onClickItem(transitionView: View)
    }
}
