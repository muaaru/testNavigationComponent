package com.muaaru.testnavigationcomponent.grid

import android.os.Bundle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.String
import kotlin.jvm.JvmStatic

data class TransitionDestinationGridFragmentArgs(val transitionName: String) : NavArgs {
    fun toBundle(): Bundle {
        val result = Bundle()
        result.putString("transitionName", this.transitionName)
        return result
    }

    companion object {
        @JvmStatic
        fun fromBundle(bundle: Bundle): TransitionDestinationGridFragmentArgs {
            bundle.setClassLoader(TransitionDestinationGridFragmentArgs::class.java.classLoader)
            val __transitionName : String?
            if (bundle.containsKey("transitionName")) {
                __transitionName = bundle.getString("transitionName")
                if (__transitionName == null) {
                    throw IllegalArgumentException("Argument \"transitionName\" is marked as non-null but was passed a null value.")
                }
            } else {
                throw IllegalArgumentException("Required argument \"transitionName\" is missing and does not have an android:defaultValue")
            }
            return TransitionDestinationGridFragmentArgs(__transitionName)
        }
    }
}
