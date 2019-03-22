package com.muaaru.testnavigationcomponent.single

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.muaaru.testnavigationcomponent.R

class TransitionSourceFragmentDirections private constructor() {
    companion object {
        fun actionTransitionSourceFragmentToTransitionDestinationFragment(): NavDirections =
                ActionOnlyNavDirections(R.id.action_transitionSourceFragment_to_transitionDestinationFragment)
    }
}
