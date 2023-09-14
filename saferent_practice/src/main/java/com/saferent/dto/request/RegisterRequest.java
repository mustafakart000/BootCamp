package com.saferent.dto.request;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RegisterRequest {
    @Size(max =50)
    @NotBlank(message = "Please provide your first Name")
    private String firstName;

    @Size(max =50)
    @NotBlank(message = "Please provide your Last Name")
    private String lastName;

    @Size(min = 4,max =50, message = "Please provide Correct Size of Password")
    @NotBlank(message = "Please provide your  password")
    private String password;

    @Pattern(regexp ="^((\\(\\d{3}\\))|\\d{3})[- .]?\\d{3}[- .]?\\d{4}$",
                message = "Please provide valid phone number")
    @Size(min = 14, max =14)
    @NotBlank(message = "Please provide valid your phone number")
    private String phoneNumber;

    @Size(max = 15)
    @NotBlank(message = "please provide your zip code")
    private String zipCode;

}
