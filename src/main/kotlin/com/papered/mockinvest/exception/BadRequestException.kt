package com.papered.mockinvest.exception

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.ResponseStatus
import java.lang.RuntimeException

@ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "값이 없어요")
class BadRequestException(message: String) : RuntimeException(message)