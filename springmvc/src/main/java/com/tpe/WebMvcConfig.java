package com.tpe;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration
@EnableWebMvc//MVC ile çalışacağımı beliriyorum.
@ComponentScan("com.tpe")
public class WebMvcConfig implements WebMvcConfigurer {

//ViewResolver ogjemi bean olarak ekliyorum.


    @Bean
    public InternalResourceViewResolver resolver(){
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setViewClass(JstlView.class);
        resolver.setPrefix("/WEB-INF/views/");//view dosyalarımın nerede olduğunu yazıyorum.
        resolver.setSuffix(".jsp");//jsp uzantılı dosyaları dıkkate almasını söylüyoruz
        return resolver;
    }

    @Override
    //Kullanacağımız kaynaklarının yerini gösteriyoruz (Css, image vs)
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/resources/**").addResourceLocations("/resources/").setCachePeriod(0);
    }
}
