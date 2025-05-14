package com.example.Sun.Service

import com.example.Sun.datasource.BankDataSouce
import com.example.Sun.model.Bank
import org.springframework.stereotype.Service

@Service
class BankService(private val dataSource: BankDataSouce) {
    fun getBanks(): Collection<Bank> = dataSource.retrieveBanks()

    fun getBank( accountNumber: String): Bank = dataSource.retrieveBank(accountNumber)
}