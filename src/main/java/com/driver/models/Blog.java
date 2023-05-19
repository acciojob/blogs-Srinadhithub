package com.driver.models;


import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GeneratorType;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Builder
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Blog{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String title;
    String content;
    @CreationTimestamp
    Date pubDate;
    @OneToMany(mappedBy = "blog",cascade = CascadeType.ALL)
    List<Image> imageList= new ArrayList<>();

    @ManyToOne
    @JoinColumn
    User user;

}

