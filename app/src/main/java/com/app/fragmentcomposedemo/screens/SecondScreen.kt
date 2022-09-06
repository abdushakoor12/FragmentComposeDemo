package com.app.fragmentcomposedemo.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.app.fragmentcomposedemo.core.ComposeFragment
import com.app.fragmentcomposedemo.core.FragmentKey
import com.zhuinden.simplestackextensions.fragmentsktx.backstack
import kotlinx.parcelize.Parcelize

@Parcelize
class SecondScreen : FragmentKey() {
    override fun instantiateFragment() = SecondScreenFragment()
}

class SecondScreenFragment : ComposeFragment() {

    @Composable
    override fun FragmentContent() {

        Box(modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colors.background)) {

            Text("Second Screen", modifier = Modifier.align(Alignment.Center))

        }

    }

}


