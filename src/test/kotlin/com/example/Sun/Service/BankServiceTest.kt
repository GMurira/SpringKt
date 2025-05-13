package com.example.Sun.Service

import com.example.Sun.datasource.BankDataSouce
import io.mockk.every
import io.mockk.mockk
import io.mockk.verify
import org.junit.jupiter.api.Assertions.*
import kotlin.test.Test

class BankServiceTest {
    private val dataSource: BankDataSouce = mockk(relaxed = true)
    private val bankService = BankService(this.dataSource)

    @Test
    fun shouldCallItsDataSource() {
        val banks = bankService.getBanks()
        verify(exactly = 1) { dataSource.retrieveBanks() }
    }
}