package com.papered.mockinvest.repository

import com.papered.mockinvest.model.Balance
import com.papered.mockinvest.model.OrderHistory
import org.springframework.data.mongodb.repository.MongoRepository

interface BalanceRepository : MongoRepository<Balance, String> {
    fun findByOrdersOrderId(orderId: String): OrderHistory
}