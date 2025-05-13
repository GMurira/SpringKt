package com.example.Sun.datasource

import com.example.Sun.model.Bank

interface BankDataSouce {
    fun retrieveBanks(): Collection<Bank>
}