package com.impetuson.rexroot.view.main

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.Window
import android.view.WindowManager
import androidx.databinding.DataBindingUtil
import com.impetuson.rexroot.R
import com.impetuson.rexroot.databinding.FragmentActionsBinding
import com.impetuson.rexroot.databinding.FragmentDashboardBinding
import com.impetuson.rexroot.view.jobs.SearchActivity


class DashboardFragment : Fragment() {

    private lateinit var binding: FragmentDashboardBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_dashboard, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        changeStatusBarColor()


        binding.apply {
            llSearch.setOnClickListener {
                startActivity(Intent(requireContext(), SearchActivity::class.java))
            }
        }


    }

    private fun changeStatusBarColor() {
        val window: Window = requireActivity().window
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
        window.statusBarColor = Color.parseColor("#e5e5ff")
    }
}