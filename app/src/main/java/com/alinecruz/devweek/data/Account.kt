package com.alinecruz.devweek.data

data class Account (val agency: String, val accountNumber: String, val user: Client, val balance: Double, val limit: Double, val card: Card)