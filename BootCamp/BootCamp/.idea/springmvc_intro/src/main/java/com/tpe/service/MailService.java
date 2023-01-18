package com.tpe.service;

import com.tpe.domain.Message;
import org.springframework.stereotype.Component;

@Component("mailService")
public class MailService  implements MessageService{



    public void sendMessage(Message message){
        System.out.println("Ben mail service size mesaj gönderiyorum..." +message.getMessage());

    }


}
