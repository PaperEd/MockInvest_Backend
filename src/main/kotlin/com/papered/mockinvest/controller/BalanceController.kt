package com.papered.mockinvest.controller

import com.papered.mockinvest.model.OrderHistory
import com.papered.mockinvest.repository.BalanceRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/balance")
class BalanceController(val balanceRepository: BalanceRepository) {
    @GetMapping("/info")
    fun getBalance() = balanceRepository.findAll()[0]

    @GetMapping("/info/{ticker}")
    fun getBalanceByTicker(@PathVariable("ticker") ticker: String): List<OrderHistory> {
        val balance = balanceRepository.findAll()[0]
        return balance.orders.filter { it.ticker == ticker }
    }
}