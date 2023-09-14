package com.saferent.domain;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.management.relation.Role;
import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length =50, nullable = false)
    private String firstName;

    @Column(length =50, nullable = false)
    private String lastName;

    @Column(length =50, nullable = false,unique = true)
    private String email;

    @Column(length =50, nullable = false)
    private String password;

    @Column(length =14, nullable = false)
    private String phoneNumber;

    @Column(length =14, nullable = false)
    private String address;

    @Column(length =15, nullable = false)
    private String zipCode;

    @Column(length =15, nullable = false)
    private Boolean builtIn= false;

    @ManyToMany//Lazy
    @JoinTable(name = "t_user_role", joinColumns = @JoinColumn(name = "user_id"),
                  inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> roles = new HashSet<Role>();

}
