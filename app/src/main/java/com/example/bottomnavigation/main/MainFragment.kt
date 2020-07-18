package com.example.bottomnavigation.main

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import com.example.bottomnavigation.R

class MainFragment : Fragment() {

    companion object {
        fun newInstance() = MainFragment()
    }

    private lateinit var navController : NavController
    private lateinit var viewModel: MainViewModel
    private lateinit var buttonGo : Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val viewFragment = inflater.inflate(R.layout.main_fragment, container, false)

        buttonGo = viewFragment.findViewById(R.id.goToSecondFragment)

        return viewFragment
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)
        // TODO: Use the ViewModel

        navController = findNavController()

        buttonGo.setOnClickListener{
            navController.navigate(R.id.action_mainFragment_to_dashboardFragment)
        }
    }

}