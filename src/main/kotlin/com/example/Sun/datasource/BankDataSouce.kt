package com.example.Sun.datasource

import com.example.Sun.model.Bank

interface BankDataSouce {
    fun retrieveBanks(): Collection<Bank>
    fun retrieveBank( accountNumber: String): Bank
}


val banks = listOf<Bank>(
    Bank("12345", 10.0, 3),
    Bank("12345", 10.0, 3),
    Bank("12345", 10.0, 3),
    Bank("12345", 10.0, 3),
    Bank("12345", 10.0, 3),
    Bank("12345", 10.0, 3),
    Bank("12345", 10.0, 3),
    Bank("12345", 10.0, 3)
)