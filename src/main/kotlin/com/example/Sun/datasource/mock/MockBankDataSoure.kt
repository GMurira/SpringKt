package com.example.Sun.datasource.mock

import com.example.Sun.datasource.BankDataSouce
import com.example.Sun.model.Bank
import org.springframework.stereotype.Repository

@Repository
class MockBankDataSoure: BankDataSouce {

    val banks = listOf<Bank>(
        Bank("1234", 1.0, 3),
        Bank("1234", 4.0, 3),
        Bank("1234", 5.0, 3),
        Bank("1234", 8.0, 3),
        Bank("1234", 8.0, 3)
    )
    override fun retrieveBanks(): Collection<Bank> {
        return banks
    }

    override fun retrieveBank(accountNumber: String): Bank {
        return banks.firstOrNull(){ it.accountNumber == accountNumber} ?: throw NoSuchElementException("Could Not find a bank with account number $accountNumber")
    }
}