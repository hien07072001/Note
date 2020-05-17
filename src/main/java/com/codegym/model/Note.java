package com.codegym.model;

import javax.persistence.*;

@Entity
@Table
public class Note {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String title;
    private String content;

    @ManyToOne(targetEntity = Note_Type.class)
    @JoinColumn
    private Note_Type note_Type;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Note_Type getNoteType() {
        return note_Type;
    }

    public void setNoteType(Note_Type note_Type) {
        this.note_Type = note_Type;
    }

    public Note() {
    }

    public Note(Integer id, String title, String content, Note_Type note_Type) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.note_Type = note_Type;
    }

    public Note(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public Note(Integer id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;
    }
}
