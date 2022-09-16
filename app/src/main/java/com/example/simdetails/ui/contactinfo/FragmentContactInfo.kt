package com.example.simdetails.ui.contactinfo

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.simdetails.R
import com.example.simdetails.databinding.FragmentContactInfoBinding


class FragmentContactInfo : Fragment(R.layout.fragment_contact_info) {
    private lateinit var _binding: FragmentContactInfoBinding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentContactInfoBinding.bind(view)
        _binding.icBack.setOnClickListener {
            findNavController().navigateUp()
        }
    }

}