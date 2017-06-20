package com.codeup.models;


public class Post {
    private long id;
    private String title;
    private String body;

    public Post(String title, String body) {
        this.title = title;
        this.body = body;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setBody(String body) {
        this.body = body;
    }
//--------------------------
    public Integer getId() {
        return (int)id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
//--------------------------
}