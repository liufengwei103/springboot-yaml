package com.qsh.controller

import com.qsh.domain.Person
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController {
    @Autowired
    Person person

    @RequestMapping("/hello")
    Person person() {
        return person
    }
}
