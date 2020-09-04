package com.wll.entity;

import javax.persistence.*;

@Entity
@Table(name = "sjt_user")
public class User {
    @Id
    @GeneratedValue
    Long id;
    @Column
    String name;
    @Column
    Integer age;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
