package com.muaaru.testnavigationcomponent.grid

import android.os.Bundle
import androidx.navigation.NavDirections
import com.muaaru.testnavigationcomponent.R
import kotlin.Int
import kotlin.String

class TransitionSourceGridFragmentDirections private constructor() {
    private data class
            ActionTransitionSourceGridFragmentToTransitionDestinationGridFragment(val transitionName:
            String) : NavDirections {
        override fun getActionId(): Int =
                R.id.action_transitionSourceGridFragment_to_transitionDestinationGridFragment

        override fun getArguments(): Bundle {
            val result = Bundle()
            result.putString("transitionName", this.transitionName)
            return result
        }
    }

    companion object {
        fun actionTransitionSourceGridFragmentToTransitionDestinationGridFragment(transitionName: String):
                NavDirections =
                ActionTransitionSourceGridFragmentToTransitionDestinationGridFragment(transitionName)
    }
}
