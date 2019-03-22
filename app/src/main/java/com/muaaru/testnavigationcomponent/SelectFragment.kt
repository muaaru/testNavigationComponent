package com.muaaru.testnavigationcomponent

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController

class SelectFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_select, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<View>(R.id.button_single).setOnClickListener {
            it.findNavController().navigate(R.id.action_selectFragment_to_transitionSourceFragment)
        }
        view.findViewById<View>(R.id.button_grid).setOnClickListener {
            it.findNavController().navigate(R.id.action_selectFragment_to_transitionSourceGridFragment)
        }
    }
}
