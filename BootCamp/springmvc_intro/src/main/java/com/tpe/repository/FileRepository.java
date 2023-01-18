package com.tpe.repository;


import com.tpe.domain.Message;
import org.springframework.stereotype.Component;

@Component("fileRepository")
public class FileRepository implements Repository{




    public void saveMessage(Message message) {
        System.out.println("mesajınız fileRepository olarak kaydedildi: " + message.getMessage());

    }


}
