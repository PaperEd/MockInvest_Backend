package com.papered.mockinvest.repository

import com.papered.mockinvest.model.Balance
import com.papered.mockinvest.model.Order
import org.springframework.data.mongodb.repository.MongoRepository

interface BalanceRepository : MongoRepository<Balance, String> {
    fun findByOrdersOrderId(orderId: String): Order
}