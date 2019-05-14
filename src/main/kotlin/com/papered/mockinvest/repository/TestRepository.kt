package com.papered.mockinvest.repository

import com.papered.mockinvest.model.Test
import org.springframework.data.jpa.repository.JpaRepository

interface TestRepository : JpaRepository<Test, Long>