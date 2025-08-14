package com.dolina_purchase_service.services

import com.dolina_purchase_service.dtos.RequestPurchaseHistoryDto
import com.dolina_purchase_service.models.PurchaseModel
import com.dolina_purchase_service.repositories.PurchaseRepository
import org.springframework.stereotype.Service

@Service
class PurchaseService(private val purchaseRepository: PurchaseRepository) {

    fun savePurchaseHistory(payload: RequestPurchaseHistoryDto) {
        val purchaseModel = PurchaseModel(
            userName = payload.userName,
            itemName = payload.itemName,
            amount = payload.itemPrice,
            address = payload.address,
            globalItemId = payload.globalItemId,
            globalUserId = payload.globalUserId
        )
        purchaseRepository.save(purchaseModel)
    }
}