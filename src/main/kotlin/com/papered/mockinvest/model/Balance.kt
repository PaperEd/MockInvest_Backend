package com.papered.mockinvest.model

import org.springframework.data.mongodb.core.mapping.Document

@Document("balance")
data class Balance(
        val money: Long,
        val orders: ArrayList<Order>
)

