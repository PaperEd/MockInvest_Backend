package com.papered.mockinvest.model

import org.bson.types.ObjectId
import javax.persistence.GeneratedValue

data class Order(
        @GeneratedValue
        val orderId: String,
        val count: Long?,
        val price: Long?,
        val benefit: Long?,
        val ticker: Long?,
        val companyName: String?
)