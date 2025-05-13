package com.example.Sun.datasource.mock

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class MockBankDataSoureTest {
    private val mockDataSource = MockBankDataSoure()

    @Test
    fun shouldProvideAColloectionofBanks() {
        val banks = mockDataSource.retrieveBanks()
        assertThat(banks).isNotEmpty
    }
    @Test
    fun shouldprovidesomemock(){
        val banks = mockDataSource.retrieveBanks()
        assertThat(banks).allMatch { it.accountNumber.isNotBlank() }
        assertThat(banks).anyMatch { it.trust != 0.0 }
        assertThat(banks).allMatch { it.transactionFee != 0 }
    }
}