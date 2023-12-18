package com.yagofellipe.fragments

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.yagofellipe.fragments.R

class conversasFragment: Fragment() {

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.i("ciclo_vida", "Fragment")
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.i("Ciclo_vida", "Fragment onCreatView")
        return inflater.inflate(
            R.layout.fragment_conversas,
            container,
            false
        )
    }
}
