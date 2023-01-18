package com.tpe;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

import javax.sql.DataSource;
import java.util.Properties;

//configuration file or class
@Configuration
@PropertySource("classpath:db.properties")
public class RootContextConfig {

    @Autowired
    private Environment environment; //db.properties 'e ulaşmak için enject'e ediyoruz  (37-39 lines)

    @Bean
    public LocalSessionFactoryBean sessionFactory(){
        LocalSessionFactoryBean sessionFactory =new LocalSessionFactoryBean();
        sessionFactory.setDataSource(dataSource());
        sessionFactory.setPackagesToScan(new String[] {"com.tpe.domain"});
        sessionFactory.setHibernateProperties(hibernateProperties());

        return sessionFactory;
    }
    //enject'e etmeye gerek yok sadece burada kullanacağız
    private Properties hibernateProperties() {

        Properties properties = new Properties();
        properties.put("hibernate.dialect",environment.getRequiredProperty("hibernate.dialect"));
        properties.put("hibernate.show_sql",environment.getRequiredProperty("hibernate.show_sql"));
        properties.put("hibernate.format_sql",environment.getRequiredProperty("hibernate.format_sql"));
        properties.put("hibernate.hbm2ddl.auto",environment.getRequiredProperty("hibernate.hbm2ddl.auto"));
        return properties;
    }

    //yukardaki setdatasource( burayı dolduracağız)
@Bean
public DataSource dataSource() {

    DriverManagerDataSource dataSource = new DriverManagerDataSource();
    dataSource.setDriverClassName(environment.getRequiredProperty("jdbc.driverClassName"));
    dataSource.setDriverClassName(environment.getRequiredProperty("jdbc.url"));
    dataSource.setDriverClassName(environment.getRequiredProperty("jdbc.username"));
    dataSource.setDriverClassName(environment.getRequiredProperty("db_password"));
    return dataSource;
    }
}
