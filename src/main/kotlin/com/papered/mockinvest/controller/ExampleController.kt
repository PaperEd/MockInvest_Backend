package com.papered.mockinvest.controller

import com.papered.mockinvest.exception.BadRequestException
import com.papered.mockinvest.model.Test
import com.papered.mockinvest.repository.TestRepository
import org.springframework.data.repository.findByIdOrNull
import org.springframework.web.bind.annotation.*
import java.util.*

@RestController
@RequestMapping("/example")
class ExampleController(val testRepository: TestRepository) {

    @RequestMapping("/test", method = [RequestMethod.GET])
    fun getTest() = testRepository.findAll()

    @RequestMapping("/test/{id}", method = [RequestMethod.GET])
    fun getTestWithId(@PathVariable("id") id: Long): Test? = testRepository.findByIdOrNull(id)
            ?: throw BadRequestException("")

    @RequestMapping("/test", method = [RequestMethod.POST])
    fun saveTest(@RequestBody test: Test) = testRepository.save(test)
}