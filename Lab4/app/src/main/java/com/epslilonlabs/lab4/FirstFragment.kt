package com.epslilonlabs.lab4

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.appcompat.widget.LinearLayoutCompat
import androidx.fragment.app.Fragment
import com.epslilonlabs.lab4.databinding.FragmentFirstBinding
import com.google.android.material.button.MaterialButton

class FirstFragment : Fragment() {

    private var _binding: FragmentFirstBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentFirstBinding.inflate(inflater, container, false)

        binding.buttonRed.setOnClickListener {
            binding.layout.setBackgroundColor(requireContext().getColor(R.color.red))
        }
        binding.buttonGreen.setOnClickListener {
            binding.layout.setBackgroundColor(requireContext().getColor(R.color.green))
        }
        binding.buttonBlue.setOnClickListener {
            binding.layout.setBackgroundColor(requireContext().getColor(R.color.blue))
        }

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}