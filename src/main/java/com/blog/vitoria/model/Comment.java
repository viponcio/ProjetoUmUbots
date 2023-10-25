package com.blog.vitoria.model;
import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Comment implements Serializable {
    private static final long serialVersionUID=1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String content;
    private String created_at;
    @ManyToOne
    private User author;
    @ManyToOne
    private Post post;

    public Comment(Long id, String content, String created_at, User author, Post post) {
        this.id = id;
        this.content = content;
        this.created_at = created_at;
        this.author = author;
        this.post = post;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }
}