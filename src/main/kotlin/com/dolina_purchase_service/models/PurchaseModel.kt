package com.dolina_purchase_service.models

import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table
import java.math.BigDecimal
import java.time.LocalDateTime
import java.util.UUID

@Entity
@Table(name = "tb_purchase")
data class PurchaseModel(

    @Id
    val id: UUID = UUID.randomUUID(),

    val userName: String,

    val globalUserId: UUID,

    val itemName: String,

    val globalItemId: UUID,

    val localStamp: LocalDateTime = LocalDateTime.now(),

    val address: String,

    val amount: BigDecimal
)
