package com.example.Sun.controller

import com.example.Sun.model.Bank
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestFactory
import org.junit.jupiter.api.TestInstance
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.http.MediaType
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.get
import org.springframework.test.web.servlet.post

@SpringBootTest
@AutoConfigureMockMvc
class BankControllerTest {

    @Autowired
    lateinit var mockMvc: MockMvc
    val baseUrl = "/api/banks"

    @Nested
    @DisplayName("GET api/banks")
    @TestInstance(TestInstance.Lifecycle.PER_CLASS)
    inner class GetBanks {
        @Test
        fun ShouldReturnAllBanks() {
            mockMvc.get(baseUrl)
                .andDo { print() }
                .andExpect {
                    status { isOk() }
                }


        }

    }

    @Nested
    @DisplayName("GET /api/bank/{accountNummber}")
    @TestInstance(TestInstance.Lifecycle.PER_CLASS)
    inner class GetBank {
        @Test
        fun shouldReturnBankWithGivenAccountNumber() {
            //given
            val accountNumber = 1234
            //then
            mockMvc.get("$baseUrl/$accountNumber")
                .andDo { println() }
                .andExpect {
                    status { isOk() }
                    content { contentType(MediaType.APPLICATION_JSON) }
                }
        }

        @Test
        fun shouldreturnnotfoundifaccountnumberDOESNOTexist() {
            val accountNumber = "Does Not Exist"

            mockMvc.get("$baseUrl/$accountNumber")
                .andDo { print() }
                .andExpect { status { isNotFound() } }

        }
    }

    @Nested
    @DisplayName("POST /api/banks")
    @TestInstance(TestInstance.Lifecycle.PER_CLASS)
    inner class PostNewBank{
        @Test
        fun sholdAddANewBank(){
            //when
            val newBank = Bank("1234ab", 3.14, 23)

            mockMvc.post(baseUrl){
                contentType = MediaType.APPLICATION_JSON
                content =
            }
                .andDo { print() }
                .andExpect { status { isCreated() } }
        }
    }

}