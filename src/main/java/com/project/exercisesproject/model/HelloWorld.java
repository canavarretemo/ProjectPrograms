package com.project.exercisesproject.model;

import jakarta.persistence.*;
import jakarta.persistence.GeneratedValue;



@Entity
@Table(name = "helloworld")
public class HelloWorld {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "message", columnDefinition = "HelloWorld")
    private String message;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
