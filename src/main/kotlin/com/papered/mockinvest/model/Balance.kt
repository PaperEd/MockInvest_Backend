package com.papered.mockinvest.model

import org.springframework.data.mongodb.core.mapping.Document
import javax.persistence.GeneratedValue

@Document("balance")
data class Balance(
        @GeneratedValue
        val _id: String,
        var money: Int,
        val orders: ArrayList<OrderHistory>
)

