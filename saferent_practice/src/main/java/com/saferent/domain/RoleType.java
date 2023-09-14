package com.saferent.domain;

public enum RoleType {

    ROLE_CUSTOMER("customer"),
    ROLE_ADMIN("administrator");

    private String name;

    private RoleType(String name) {this.name = name;}

    public String getName() {return name;}

}
