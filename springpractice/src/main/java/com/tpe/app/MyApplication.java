package com.tpe.app;

import com.tpe.AppConfiguration;
import com.tpe.domain.Message;
import com.tpe.service.MailService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApplication {


    public static void main(String[] args) {


        Message message = new Message();//Bir yapıyı göstermek için new liyoruz normalde bunu  da newlemyemecegiz
//  Configuration dosyamızı okutturmak için class'ımızı tanıtmamız gerekiyor.
        message.setMessage("Hello");
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfiguration.class);


        //Bean talep ediyoruz.



        MailService service= context.getBean(MailService.class);
        service.sendMessage(message);

        context.close();







    }



}
