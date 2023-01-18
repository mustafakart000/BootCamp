package com.hb06.oneTomany.practice2;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Book06P {
    @Id
    private int id;
    private  String name;

    //Getter-Setter


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Book06{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
