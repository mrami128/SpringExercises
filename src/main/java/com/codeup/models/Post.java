package com.codeup.models;
import javax.persistence.*;

@Entity                //tells intellj that we are using a table
@Table(name="posts")  //

public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false, columnDefinition = "text")
    private String body;

// --- Add  @one to one relationship --JPA standard;Hibernate creates the column. later this will be many to one
// -- this JAVA bean is a class with def constructor also has getter setter for all attribs props &instan variable
// -- Both the ORM(Hibernate and
    @OneToOne
    private User owner;
//---------------------

    public void setId(long id) {
        this.id = id;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public Post() {   }

    public Post(String title, String body,User owner) {
        this.title = title;
        this.body = body;
        this.owner=owner;  }

    public String getTitle() {  return title;   }
    public void setTitle(String title) { this.title = title; }


    public String getBody() {  return body; }
    public void setBody(String body) {
        this.body = body;
    }
//--------------------------
    public Integer getId() {
        return (int)id;
    }
    public void setId(Integer id)  {
        this.id = id;
    }
//--------------------------
}
