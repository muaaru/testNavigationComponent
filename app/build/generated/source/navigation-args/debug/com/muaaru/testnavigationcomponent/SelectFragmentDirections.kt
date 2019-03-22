package com.muaaru.testnavigationcomponent

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections

class SelectFragmentDirections private constructor() {
    companion object {
        fun actionSelectFragmentToTransitionSourceFragment(): NavDirections =
                ActionOnlyNavDirections(R.id.action_selectFragment_to_transitionSourceFragment)

        fun actionSelectFragmentToTransitionSourceGridFragment(): NavDirections =
                ActionOnlyNavDirections(R.id.action_selectFragment_to_transitionSourceGridFragment)
    }
}
