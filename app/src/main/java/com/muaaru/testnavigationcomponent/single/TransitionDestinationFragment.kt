package com.muaaru.testnavigationcomponent.single

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.transition.TransitionInflater
import com.muaaru.testnavigationcomponent.R


class TransitionDestinationFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        sharedElementEnterTransition = TransitionInflater.from(context).inflateTransition(R.transition.move)
        return inflater.inflate(R.layout.fragment_transition_destination, container, false)
    }
}
