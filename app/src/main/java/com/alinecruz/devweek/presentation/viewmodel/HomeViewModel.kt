package com.alinecruz.devweek.presentation.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.alinecruz.devweek.data.Account
import com.alinecruz.devweek.data.local.MockData

class HomeViewModel() : ViewModel() {
    private val accountLiveData: MutableLiveData<Account> = MutableLiveData()

    fun fetchAccount(): LiveData<Account> {
        accountLiveData.value = MockData().getMockAccount()
        return accountLiveData
    }

}