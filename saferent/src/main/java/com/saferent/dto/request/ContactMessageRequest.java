package com.saferent.dto.request;


import ch.qos.logback.core.rolling.SizeAndTimeBasedRollingPolicy;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table
public class ContactMessageRequest {

    @Size(min=1, max=50,message="Your name '${validatedValue}' must be between {min} and {max} chars long")
    @NotBlank(message="Please provide your name")
    private String name;

    @Size(min=5, max=50,message="Your subject '${validatedValue}' must be between {min} and {max} chars long")
    @NotBlank(message="Please provide your subject")
    private String subject;

    @Size(min=20, max=200,message="Your body '${validatedValue}' must be between {min} and {max} chars long")
    @NotBlank(message="Please provide your body")
    private String body;
    @Email(message="Provide valid email")
    private String email;
}
