package com.muaaru.testnavigationcomponent.grid

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.transition.TransitionInflater
import com.muaaru.testnavigationcomponent.R
import com.muaaru.testnavigationcomponent.databinding.FragmentTransitionDestinationGridBinding

class TransitionDestinationGridFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        sharedElementEnterTransition = TransitionInflater.from(context).inflateTransition(R.transition.move)
        return inflater.inflate(R.layout.fragment_transition_destination_grid, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        arguments?.let {
            view.findViewById<View>(R.id.imageView).transitionName =
                TransitionDestinationGridFragmentArgs.fromBundle(it).transitionName
        }
    }
}
