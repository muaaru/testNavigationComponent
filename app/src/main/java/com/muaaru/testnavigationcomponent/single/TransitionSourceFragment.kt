package com.muaaru.testnavigationcomponent.single

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.fragment.FragmentNavigatorExtras
import com.muaaru.testnavigationcomponent.R

class TransitionSourceFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_transition_source, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<View>(R.id.imageView).setOnClickListener {
            it.findNavController().navigate(
                TransitionSourceFragmentDirections.actionTransitionSourceFragmentToTransitionDestinationFragment(),
                FragmentNavigatorExtras(
                    it to "testTransitionName"
                )
            )
        }
    }
}
