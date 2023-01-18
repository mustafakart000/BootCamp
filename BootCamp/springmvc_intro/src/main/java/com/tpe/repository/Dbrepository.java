package com.tpe.repository;

import com.tpe.domain.Message;
import org.springframework.stereotype.Component;

@Component("dbrepository")
 public class Dbrepository implements Repository{



    @Override
    public void saveMessage( Message message) {
        System.out.println("mesajınız VeriTabanına Dbrepository kaydedildi: " + message.getMessage());

    }
}
