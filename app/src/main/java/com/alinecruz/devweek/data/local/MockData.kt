package com.alinecruz.devweek.data.local

import com.alinecruz.devweek.data.Account
import com.alinecruz.devweek.data.Card
import com.alinecruz.devweek.data.Client

class MockData() {

    fun getMockData(): Account {
        val client = Client("Aline", "Cruz", "123456789-01", "(99) 99999-9999")
        val card = Card("1234", "Visa", "Credit")

        return Account("4321", "987654-2", client, 132455.23, 15000.00, card)
    }
}