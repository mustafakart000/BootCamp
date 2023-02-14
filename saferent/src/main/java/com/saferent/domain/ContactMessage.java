package com.saferent.domain;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "tbl_cmessage")
public class ContactMessage {
    @Id
    private Long id;// yoksa null gecelim bu yüzden wrapper olan Long Class'ı tercih ettik

    private String name;

    private String subject;

    private String body;

    private String email;





}
