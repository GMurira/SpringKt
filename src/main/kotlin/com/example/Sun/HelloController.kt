package com.example.Sun

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping
class HelloController{

    @GetMapping("/api/hello1")
    fun helloController(): String = "Hello Controller"
}