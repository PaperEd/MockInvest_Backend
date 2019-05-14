package com.papered.mockinvest.repository

import com.papered.mockinvest.model.Company
import org.springframework.data.mongodb.repository.MongoRepository

interface CompanyRepository : MongoRepository<Company, String> {
    fun findByTicker(ticker: String): Company
}