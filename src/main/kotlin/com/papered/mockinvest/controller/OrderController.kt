package com.papered.mockinvest.controller

import com.papered.mockinvest.model.OrderHistory
import com.papered.mockinvest.model.OrderRequest
import com.papered.mockinvest.repository.BalanceRepository
import com.papered.mockinvest.repository.CompanyRepository
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/order")
class OrderController(val balanceRepository: BalanceRepository, val companyRepository: CompanyRepository) {

    @PostMapping("/buy")
    @ResponseStatus(HttpStatus.OK)
    fun buyFinance(@RequestBody body: OrderRequest) {
        val company = companyRepository.findByTicker(body.ticker)
        with(balanceRepository.findAll()[0]) {
            orders.add(OrderHistory(
                    companyName = company.companyName,
                    count = body.count,
                    price = company.value[1557792000000]?.adjClose,
                    ticker = body.ticker))
            money -= company.value[1557792000000]!!.adjClose * body.count
            balanceRepository.save(this)
        }
    }
}