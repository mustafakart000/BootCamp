package com.tpe.app;

import com.tpe.AppConfiguration;
import com.tpe.domain.Message;
import com.tpe.service.MessageService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApplication {

    public static void main(String[] args) {


        Message message = new Message();
        message.setMessage(":::::Siparişiniz verildi");
        //!!!!!!!! Config dosyamı gösterdim @Configuration 'nın bulunduğu class dan okumayı yapıyorum.
        //Spring framework2'e conf,guration dosyamın kim olduğunu AnnotationConfigApplicationContext class'ı ile
        // aşağıdaki gibi söylüyorum.
        AnnotationConfigApplicationContext  context = new AnnotationConfigApplicationContext(AppConfiguration.class);


        //Bean talep ediyoruz //interface yapısı olunca hangi child 'ı bean olarak oluşturacağını anlayamadığı için exception fırlatır
        //ihtiyacımız olduğunda bize servis objesi gönder dediğimiz  methodu oluşturarak object'i heap de oluşturmuş olacağız
//        MessageService service= context.getBean(MessageService.class);
        //yukardaki getBean methodu ile hiç new object yapmadan object oluşturduk aslında IOC yapısına bu işi bıraktık
        MessageService service= context.getBean("whatsappService",MessageService.class);
        service.sendMessage(message);
        context.close();//progamı kapatırken oluşan beanleri yok ediyoruz.



    }
}
