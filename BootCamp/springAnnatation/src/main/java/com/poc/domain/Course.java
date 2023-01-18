package com.poc.domain;

public class Course {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private int a;
    private int b;

    private int c;

    public int getC()
        {c=a*b;
            return c;
        }

    public void setC(int a, int b) {
        this.a = a;
        this.b = b;
    }
}
