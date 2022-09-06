package com.app.fragmentcomposedemo.core

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.platform.ViewCompositionStrategy
import com.app.fragmentcomposedemo.ui.theme.FragmentComposeDemoTheme
import com.zhuinden.simplestackextensions.fragments.KeyedFragment

abstract class ComposeFragment : KeyedFragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return ComposeView(requireContext()).apply {
            setContent {
                FragmentComposeDemoTheme {
                    setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed)
                    FragmentContent()
                }
            }
        }
    }

    @Composable
    abstract fun FragmentContent()
}