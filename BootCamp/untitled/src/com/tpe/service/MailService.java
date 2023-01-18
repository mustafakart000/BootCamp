package com.tpe.service;

import com.tpe.domain.Message;

public class MailService {

    public void sendMessage (Message message){
        System.out.println("ben mail servisiyim ."+ message.getMessage());
    }


}
