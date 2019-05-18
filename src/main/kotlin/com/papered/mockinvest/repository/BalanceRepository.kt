package com.papered.mockinvest.repository

import com.papered.mockinvest.model.Balance
import org.springframework.data.mongodb.repository.MongoRepository

interface BalanceRepository : MongoRepository<Balance, Long> {
    fun findByOrders(ticker: Long)
}