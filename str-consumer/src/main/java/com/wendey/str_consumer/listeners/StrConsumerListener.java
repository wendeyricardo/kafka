package com.wendey.str_consumer.listeners;

import org.springframework.stereotype.Component;

import com.wendey.str_consumer.custom.StrConsumercustomListener;

import lombok.extern.log4j.Log4j2;

@Log4j2
@Component
public class StrConsumerListener {
    
    @StrConsumercustomListener(groupId = "group-1")
    public void create(String message){
        log.info("CREATE ::: Receive message {}", message);
    }

    @StrConsumercustomListener(groupId = "group-1")
    public void log(String message){
        log.info("LOG ::: Receive message {}", message);
    }

    @StrConsumercustomListener(groupId = "group-2")
    public void history(String message){
        log.info("HISTORY ::: Receive message {}", message);
    }
}
