package com.tpe.service;

import com.tpe.domain.Message;
import com.tpe.repository.Dbrepository;
import com.tpe.repository.FileRepository;
import com.tpe.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("smsService")
public class SmsService implements MessageService{
    @Autowired //dependency Injection
    Repository dbrepository;
    @Qualifier("fileRepository2")


    @Override
    public void sendMessage(Message message) {
        System.out.println("Ben sms service size mesaj gönderiyorum..." +message.getMessage());
        dbrepository.saveMessage(message);


    }
}
