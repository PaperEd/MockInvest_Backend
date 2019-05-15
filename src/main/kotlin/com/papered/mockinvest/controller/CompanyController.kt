package com.papered.mockinvest.controller

import com.papered.mockinvest.model.Value
import com.papered.mockinvest.repository.CompanyRepository
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/company")
class CompanyController(val companyRepository: CompanyRepository) {

    @RequestMapping("/{ticker}", method = [RequestMethod.GET])
    fun getCompanyWithId(@PathVariable("ticker") ticker: String) = companyRepository.findByTicker(ticker)


    @RequestMapping("/{ticker}/{date}", method = [RequestMethod.GET])
    fun getStockValue(@PathVariable("ticker") ticker: String, @PathVariable("date") date: Long): Value? =
            companyRepository.findByTicker(ticker).value[date]

    @RequestMapping("/{ticker}/date", method = [RequestMethod.GET])
    fun getStockWithDate(@PathVariable("ticker") ticker: String, @RequestParam("startdate") startDate: Long, @RequestParam("enddate") endDate: Long): Map<Long, Value> {
        val company = companyRepository.findByTicker(ticker)
        return company.value.filter {
            it.key in (startDate + 1)..(endDate - 1)
        }
    }
}
