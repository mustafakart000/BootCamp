package com.tpe;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

//bu dosya üzerinden ihtiyaç duydugumuz tüm configurationları yapacağız
//spring bizden webMvcConfigurer implement etmemizi istiyor
//Sping Mvc uygulamamız ayağa kalktığı zaman herhangi bir server da run edildiği zaman ilk
// arayacağı class @Configuration class'ıdır (neyi nerde bulacağını @Configuration annatotaion sayesinde sağlıyor )
@Configuration
@EnableWebMvc //bu annatotaion sayesinde mvc ile çalışacağımızı belirtiyoruz
@ComponentScan ("com.tpe")//compenent ve bean olarak annotation edilmiş tum hepsini tara
public class WebMvsConfig implements WebMvcConfigurer {


    //viewResolver objemi bean olarak ekliyorum

    @Bean
    public InternalResourceViewResolver resolver(){

        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setViewClass(JstlView.class);//Jsp ile çalıştığımız için bu formatta yazıyoruz. bağımlılığımzda da bu var
        resolver.setPrefix("/WEB-INF/views/");// view dosyalarımın nerede olduğunu yazıyoruz. ve oraya bakması gerektiğini söylüyoruz
        resolver.setSuffix(".jsp");//jsp uzantılı dosyaları dikkate almasını söylüyorum

        return resolver;
    }
    //kullancağımız kaynakların yerini söylüyoruz html css resimler vs hangi class'ın altındaysa onun yolunu
    // belirtmeliyiz
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/resources/**").
                addResourceLocations("/resources/").setCachePeriod(0);//bir kaynağı ulaşmak // path Patterns benim
                                                                        // resources'larımı şu kaynakta ara


    }
}
