package com.driver.models;


import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Builder
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Image{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String description;
    String dimensions;
    @ManyToOne
    @JoinColumn
    Blog blog;
}