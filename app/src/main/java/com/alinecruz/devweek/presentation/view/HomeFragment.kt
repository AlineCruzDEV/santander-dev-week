package com.alinecruz.devweek.presentation.view

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.alinecruz.devweek.R
import com.alinecruz.devweek.R.layout.fragment_home
import com.alinecruz.devweek.data.AvailableService
import com.alinecruz.devweek.data.local.MockData
import com.alinecruz.devweek.di.injectAvailableServicesModule
import kotlinx.android.synthetic.main.fragment_home.*


class HomeFragment : Fragment() {

    private lateinit var listServices: List<AvailableService>
    private lateinit var adapter: ServiceAdapter
    private val mockData: MockData = MockData()

    init {
        //injectAvailableServicesModule()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupRecycler()
    }

    private fun setupRecycler() {
        listServices = mockData.getMockAvailableServices()
        adapter = ServiceAdapter(listServices, activity)

        recyclerHomeAvailableServices.adapter = adapter
    }
}