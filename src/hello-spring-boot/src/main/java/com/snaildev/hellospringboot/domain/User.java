package com.snaildev.hellospringboot.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name="user")
@Getter
@Setter
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String username;
    private Date birthday;
    private int sex;

    public User() { }

    public User(int id, String username, Date birthday, int sex) {
        this.id = id;
        this.username = username;
        this.birthday = birthday;
        this.sex = sex;
    }
}
