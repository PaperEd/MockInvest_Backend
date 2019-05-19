package com.papered.mockinvest.model

import javax.persistence.GeneratedValue

data class OrderHistory(
        @GeneratedValue
        val orderId: String? = null,
        val count: Int?,
        val price: Int?,
        var benefit: Long? = 0,
        val ticker: String?,
        val companyName: String?
)