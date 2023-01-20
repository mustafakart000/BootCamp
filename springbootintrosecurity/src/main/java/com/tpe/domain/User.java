package com.tpe.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.UniqueElements;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tbl_user")
public class User {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;
    @Column(length =25, nullable = false)
    private String firstName;
    @Column(length =25, nullable = false)

    private String lastName;

    @Column(length =25, nullable = false, unique=true)
    private String userName;

    @Column(length =255, nullable = false)
    private String password;

    @JoinTable(name = "tbl_user_role",
    joinColumns =@JoinColumn(name = "user_id"),
    inverseJoinColumns =@JoinColumn(name = "role_id"))
    @ManyToMany(fetch = FetchType.EAGER)//eager ile hepsini getiriyoruz
    private Set<Role> roles = new HashSet<>();

    @JsonIgnore
    @OneToOne(mappedBy = "user")
    private Student student;



}
