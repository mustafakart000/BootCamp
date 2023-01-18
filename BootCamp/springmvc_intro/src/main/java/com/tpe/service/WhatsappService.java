package com.tpe.service;

import com.tpe.domain.Message;
import com.tpe.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("whatsappService")
public class WhatsappService implements MessageService{


    @Autowired
    Repository dbrepository;

    public void sendMessage(Message message) {
        System.out.println("Ben whatsapp service size mesaj gönderiyorum..." +message.getMessage());

        dbrepository.saveMessage(message);
    }
}
