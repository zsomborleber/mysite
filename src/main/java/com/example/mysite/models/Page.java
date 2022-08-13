package com.example.mysite.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class Page {

    @Id
    @GeneratedValue
    private long id;

    @Column(unique = true)
    private String slug;

    private String title;

    private String content;

    private LocalDate created;

    public Page() {
    }

    public Page(String slug, String title, String content) {
        this.slug = slug;
        this.title = title;
        this.content = content;
        this.created = LocalDate.now();
    }

    public Page(long id, String slug, String title, String content, LocalDate created) {
        this.id = id;
        this.slug = slug;
        this.title = title;
        this.content = content;
        this.created = created;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDate getCreated() {
        return created;
    }

    public void setCreated(LocalDate created) {
        this.created = created;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Page{" +
                "id=" + id +
                ", slug='" + slug + '\'' +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", created=" + created +
                '}';
    }
}
