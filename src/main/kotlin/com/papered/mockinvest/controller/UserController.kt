package com.papered.mockinvest.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/user")
class UserController {
    @GetMapping("/balance")
    fun getBalance() {

    }

    @GetMapping("/balance/history")
    fun getBalanceHistory(@RequestParam("startDate") startDate: Long, @RequestParam("endDate") endDate: Long) {

    }

    @GetMapping("/balance/stock/{ticker}")
    fun getBalanceStockByTicker(@RequestParam("ticker") ticker: String) {

    }



}