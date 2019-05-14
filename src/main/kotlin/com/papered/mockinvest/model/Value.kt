package com.papered.mockinvest.model

import org.springframework.data.mongodb.core.mapping.Field

data class Value(
        @Field("Open")
        val open: Int,
        @Field("High")
        val high: Int,
        @Field("Low")
        val low: Int,
        @Field("Close")
        val close: Int,
        @Field("Adj Close")
        val adjClose: Int,
        @Field("Volume")
        val volume: Int
)