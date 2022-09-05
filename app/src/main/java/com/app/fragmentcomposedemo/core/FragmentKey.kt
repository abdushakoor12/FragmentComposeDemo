package com.app.fragmentcomposedemo.core

import androidx.fragment.app.Fragment
import com.zhuinden.simplestackextensions.fragments.DefaultFragmentKey
import com.zhuinden.simplestackextensions.fragments.KeyedFragment

abstract class FragmentKey: DefaultFragmentKey() {

    abstract override fun instantiateFragment(): KeyedFragment
}