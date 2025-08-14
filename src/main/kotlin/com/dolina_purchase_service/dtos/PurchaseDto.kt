package com.dolina_purchase_service.dtos

import java.math.BigDecimal

data class PurchaseDto(
    val userName: String,
    val itemName: String,
    val address: String,
    val amount: BigDecimal
)
