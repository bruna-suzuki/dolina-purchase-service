package com.dolina_purchase_service.configs

import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class RabbitMQConfig {

    //criar conversor de mensagens
    @Bean
    fun convertMessage(): Jackson2JsonMessageConverter {
        val objectMapper = jacksonObjectMapper()
        return Jackson2JsonMessageConverter(objectMapper)
    }
}