package ru.gburkov.models;

public class Item {
    private String id;
    public String name;
    public String description;
    public long create;
    private Comment[] comments = new Comment[10];
    private int commentPosition = 0;

    public Item() {

    }

    public Item(String id) {
        this.id = id;
    }

    public Item(String name, String description, long create) {
        this.name = name;
        this.description = description;
        this.create = create;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public void setComment(Comment comment) {
        this.comments[this.commentPosition] = comment;
    }

    public String getComment() {
        String result = "";
        for (int i = 0; i < comments.length; i++){
            if (comments[i]!=null){
                result = comments[i].getComment();
            }
        }
        return result;

    }

    @Override
    public String toString() {
        return "id: " + id + ";   name: " + name + ";   description: " + description + ";   comments: " + this.getComment();
    }
}