package com.Project2.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Post {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;

    private String title, anons, full_text;
    private int views;
}
