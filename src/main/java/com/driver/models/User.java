package com.driver.models;


import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Builder
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class User{
@Id
    int id;
String userName;
String password;
String firstName;
String lastName;
@OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
    List<Blog> blogsList= new ArrayList<>();
}