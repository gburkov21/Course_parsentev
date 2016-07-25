package ru.gburkov.models;

import java.util.Arrays;

public class Item {
    private String id;
    public String name;
    public String description;
    public long create;
    private Comment[] comments = new Comment[10];
    private int commentPosition = 0;

    public Item() {

    }

    public Item(String name, String description, long create) {
        this.name = name;
        this.description = description;
        this.create = create;
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    public long getCreate() {
        return this.create;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Comment addComment(Comment comment) {
        comments[commentPosition++] = comment;
        return comment;
    }

    public void getComments() {
        Comment[] result;
        int count = 0;
        for (Comment comment : comments) {
            if (comment != null) {
                count++;
            }
        }

        result = new Comment[count];
        for (int i = 0; i != comments.length; i++) {
            if (comments[i] != null) {
                result[i] = comments[i];
            }
        }
        for (Comment comment : result) {
            System.out.println(comment);
        }
    }

}