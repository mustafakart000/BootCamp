package com.tpe.service;

import com.tpe.domain.Message;
import org.springframework.stereotype.Component;

@Component
public class MailService implements MessageService {
    public void sendMessage(Message message){

        System.out.println("Ben mail servisiciyim size mesaj gonderiyorum..." + message.getMessage());


    }

}
