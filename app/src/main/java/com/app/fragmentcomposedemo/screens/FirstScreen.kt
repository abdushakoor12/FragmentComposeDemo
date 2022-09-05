package com.app.fragmentcomposedemo.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.app.fragmentcomposedemo.core.ComposeFragment
import com.app.fragmentcomposedemo.core.FragmentKey
import kotlinx.parcelize.Parcelize

@Parcelize
class FirstScreen : FragmentKey() {
    override fun instantiateFragment() = FirstScreenFragment()
}

class FirstScreenFragment : ComposeFragment() {

    @Composable
    override fun FragmentContent() {

        Box(modifier = Modifier.fillMaxSize().background(MaterialTheme.colors.background)) {
            Text("First Screen", color = MaterialTheme.colors.onBackground,
            modifier = Modifier.align(Alignment.Center)
                )
        }

    }

}


