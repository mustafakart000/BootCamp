package com.tpe;


import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.swing.*;

//web.xml yerine bu sınıfımızı kullacağız
//Bu ve diğer classlarımızı spring mvs yapısına uygun olması için extends veya implements etmek durumundayız.
//xml dosyasının java karşılığı.
public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    //Dispatcher servlet -> front controller request'i ilk karşılayan yapıdır
    // servlet -> request'leri alır response'a çevirir.

        //bizden web xml dosyası istiyor olunsaydı aşağıdaki 3 method'u kullanacaktık

    //db ve hibernate ile ilgili ayarları için kullanılacaktır
    // showSql: true
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{
                RootContextConfig.class
        };

    }
    //Mvs config ayarları (servet)
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]  {
                WebMvsConfig.class
        };

    }
    //Hangi url hangi servlet ilişkililendirilecek
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};//gelen bütün request leri bu servlet tarafından cevaplanır not ancak birden fazla servlet olabilir ve
    }



}
