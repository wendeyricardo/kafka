package com.wendey.str_consumer.exceptions;

import org.springframework.kafka.listener.KafkaListenerErrorHandler;
import org.springframework.kafka.listener.ListenerExecutionFailedException;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

import lombok.extern.log4j.Log4j2;

@Log4j2
@Component
public class ErrorCustomHandler implements KafkaListenerErrorHandler {

    
    @Override
    public Object handleError(Message<?> message, ListenerExecutionFailedException e) {
        log.info("EXCEPTION_HANDLER ::: Capturei um erro");
        log.info("Payload ::: {}", message.getPayload());
        log.info("Headers ::: {}", message.getHeaders());
        log.info("Offset ::: {}", message.getHeaders().get("kafka_offset"));
        log.info("Messa exception ::: {}", e.getMessage());
        return null;
    }

    /*@Override
    public Object handleError(Message<?> message, ListenerExecutionFailedException exception) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'handleError'");
    }*/
    
}
