package com.saferent.dto;


import com.saferent.domain.Role;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {

    //!!! Bu class'dan gelen pojo'yu DTO'ya çevirmek için kullanılacak


    private Set<String> roles;

    public void setRoles(Set<Role> roles) {
        Set<String> roleStr = new HashSet<>();
        roles.forEach(r -> {
            roleStr.add(r.getType().getName()); // Customer , Administrator

        });

        this.roles = roleStr;

    }
}
