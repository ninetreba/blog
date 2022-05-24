package com.example.blog.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title, anons, full_Text;
    private int views=0;

    public Post() {
    }

    public Post(String title, String anons, String full_Text) {
        this.title = title;
        this.anons = anons;
        this.full_Text = full_Text;
    }

    public String getFull_Text() {
        return full_Text;
    }

    public void setFull_Text(String full_Text) {
        this.full_Text = full_Text;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAnons() {
        return anons;
    }

    public void setAnons(String anons) {
        this.anons = anons;
    }


    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }
}
