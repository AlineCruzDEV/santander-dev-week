package com.alinecruz.devweek.data.local

import android.content.Context
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

    fun getMockAvailableServices(context: Context?): List<AvailableService> {
        lateinit var list: List<AvailableService>

        val servicePay = AvailableService(context!!.getString(R.string.pagar), R.drawable.ic_service_pay)
        val serviceTransfer = AvailableService(context!!.getString(R.string.transferir), R.drawable.ic_service_transfer)
        val serviceRecharge = AvailableService(context!!.getString(R.string.recarga), R.drawable.ic_service_recharge)
        val serviceVoucher = AvailableService(context!!.getString(R.string.comprovantes), R.drawable.ic_service_voucher)

        list = listOf(servicePay, serviceTransfer, serviceRecharge, serviceVoucher)

        return list
    }
}