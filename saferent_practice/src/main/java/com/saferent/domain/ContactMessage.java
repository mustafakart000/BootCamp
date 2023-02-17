package com.saferent.domain;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "tbl_cmessage")
public class ContactMessage {

    @Id
    @Setter(AccessLevel.NONE)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Size(min = 1, max =50, message = "Your name '${validatedValue}' must be between {min} and {max} characters ")
    @NotNull(message = "please proivde your subject")
    @Column(length = 50, nullable = false)
    private String name;

    @Size(min = 5, max =25, message = "Your sybject '{$validatedValue}' must be between {min} and {max} characters")
    @NotNull(message = "please proivde your subject")
    @Column(length = 25, nullable = false)
    private String subject;

    @Size(min =20, max =200, message = "Your body '{$validatedValue}' must be between {min} and {max} characters")
    @NotNull(message = "please proivde your body")
    private String body;

    @Email(message = "provide valid Your email")
    @Column(length =50, nullable = false)
    private String email;


}
