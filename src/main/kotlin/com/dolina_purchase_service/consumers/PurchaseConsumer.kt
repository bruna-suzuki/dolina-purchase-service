package com.dolina_purchase_service.consumers

import com.dolina_purchase_service.dtos.RequestPurchaseHistoryDto
import com.dolina_purchase_service.services.PurchaseService
import org.springframework.amqp.rabbit.annotation.RabbitListener
import org.springframework.messaging.handler.annotation.Payload
import org.springframework.stereotype.Component

@Component
class PurchaseConsumer(private val purchaseService: PurchaseService) {

    @RabbitListener(queues = arrayOf("\${broker.queue.purchase.history}"))
    fun receiveFromBroker(@Payload data: RequestPurchaseHistoryDto) {
        purchaseService.savePurchaseHistory(data)
    }
}