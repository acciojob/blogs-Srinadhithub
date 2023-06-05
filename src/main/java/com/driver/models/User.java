package com.driver.models;


import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

@Entity
public class User{
@Id
    int id;
String userName;
String password;
String firstName;
String lastName;
@OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
    List<Blog> blogsList= new ArrayList<>();

    public User( String name,String password) {

        this.userName = name;
        this.password = password;
        this.firstName = "test";
        this.lastName = "test";

    }

    public String getUsername() {
        return userName;
    }

    public void setUsername(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstname() {
        return firstName;
    }

    public void setFirstname(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<Blog> getBlogsList() {
        return blogsList;
    }

    public void setBlogList(List<Blog> blogsList) {
        this.blogsList = blogsList;
    }
    public  int getId(){
        return this.id;
    }
    public  int setId(int id){
        return this.id=id;
    }

    public List<Blog> getBlogList() {
        return blogsList;
    }
}