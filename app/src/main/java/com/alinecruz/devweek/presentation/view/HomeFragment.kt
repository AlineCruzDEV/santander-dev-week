package com.alinecruz.devweek.presentation.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.alinecruz.devweek.R
import com.alinecruz.devweek.data.AvailableService
import com.alinecruz.devweek.data.local.MockData
import com.alinecruz.devweek.di.injectAvailableServicesModule
import com.alinecruz.devweek.presentation.viewmodel.HomeViewModel
import kotlinx.android.synthetic.main.fragment_home.*
import java.text.NumberFormat
import java.util.*


class HomeFragment : Fragment() {

    private lateinit var listServices: List<AvailableService>
    private lateinit var adapter: ServiceAdapter
    private val mockData: MockData = MockData()
    private lateinit var viewModel: HomeViewModel
    //private val viewModel: HomeViewModel by viewModel()


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
        viewModel = ViewModelProvider(this).get(HomeViewModel::class.java)
        loadAccount()
    }

    private fun loadAccount() {
        val myCountry : Locale = Locale("pt", "br")

        activity?.let { it ->
            viewModel.fetchAccount().observe(it, Observer {
                val finalNumberCard = it.card.numberCard.substring(it.card.numberCard.length - 4)

                textHomeClient.text = it.user.firstName + " " + it.user.lastName
                textHomeNumberAgency.text = it.agency
                textHomeNumberAccount.text = it.accountNumber
                textHomeBalance.text = NumberFormat.getCurrencyInstance(myCountry).format(it.balance).toString()
                textHomeBalanceTotalPlusLimit.text = NumberFormat.getCurrencyInstance(myCountry).format(it.balance + it.limit).toString()
                textHomeNumberFinalCard.text = finalNumberCard

            })
        }
    }

    private fun setupRecycler() {
        listServices = mockData.getMockAvailableServices()
        adapter = ServiceAdapter(listServices, activity)

        recyclerHomeAvailableServices.adapter = adapter
    }
}