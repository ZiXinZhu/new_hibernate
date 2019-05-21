package com.zzx.entity;


import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Mr.John on 2018/9/19 10:46.
 **/
@Entity
@Table(name = "girl")
public class GirlEntity implements Serializable {

    @Id
    @Column(length = 32)
    private int id;
    private int age;
    private String cupSize;

    @Override
    public String toString() {
        return "GirlEntity{" +
                "id=" + id +
                ", age=" + age +
                ", cupSize='" + cupSize + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCupSize() {
        return cupSize;
    }

    public void setCupSize(String cupSize) {
        this.cupSize = cupSize;
    }
}
