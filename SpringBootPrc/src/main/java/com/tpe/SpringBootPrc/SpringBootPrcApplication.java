package com.tpe.SpringBootPrc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootPrcApplication {

	public static void main(String[] args) {
		/*
Katmanları oluşturalım.
ÖDEV:)
1-Customer classı oluştur
2-fieldlar
    private Long id->otomatik identity yöntemiyle oluşturulsun
    private String name->Null olmamalı, space olmamalı, en az 2 en fazla 50 karakter
    private String lastName->Null olmamalı, space olmamalı, en az 2 en fazla 50 karakter
    private String email->geçerli bir email olmalı
    private String phone
3-Gerekli annotationları ekle
    Getter-Setter metodları oluştur
    Parametreli(tüm fieldlar) constructor oluştur
    Parametresiz constructor oluştur
 */


		SpringApplication.run(SpringBootPrcApplication.class, args);
	}

}
