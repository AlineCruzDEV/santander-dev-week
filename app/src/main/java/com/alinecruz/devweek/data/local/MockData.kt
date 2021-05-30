package com.alinecruz.devweek.data.local

import com.alinecruz.devweek.R
import com.alinecruz.devweek.data.Account
import com.alinecruz.devweek.data.AvailableService
import com.alinecruz.devweek.data.Card
import com.alinecruz.devweek.data.Client

class MockData() {

    fun getMockAccount(): Account {
        val client = Client("Aline", "Cruz", "123456789-01", "(99) 99999-9999")
        val card = Card("1234", "Visa", "Credit")

        return Account("4321", "987654-2", client, 132455.23, 15000.00, card)
    }

    fun getMockAvailableServices(): List<AvailableService> {
        lateinit var list: List<AvailableService>

        val servicePay = AvailableService("Pagar", R.drawable.ic_service_pay)
        val serviceTransfer = AvailableService("Transferir", R.drawable.ic_service_transfer)
        val serviceRecharge = AvailableService("Recarga", R.drawable.ic_service_recharge)
        val serviceVoucher = AvailableService("Comprovantes", R.drawable.ic_service_voucher)

        list = listOf(servicePay, serviceTransfer, serviceRecharge, serviceVoucher)

        return list
    }
}