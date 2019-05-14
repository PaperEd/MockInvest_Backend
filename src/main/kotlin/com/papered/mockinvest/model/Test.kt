package com.papered.mockinvest.model

import javax.persistence.*

@Entity
@Table(name = "testt")
data class Test(
        @Id
        val id: Long,
        @Column
        val name: String
)