package com.papered.mockinvest.model

import org.springframework.data.mongodb.core.mapping.Document
import javax.persistence.Id

@Document("company")
data class Company(
        @Id
        val _id: String,
        val companyName: String,
        val ticker: String,
        val value: HashMap<Long, Value>
)