package ru.gburkov.start;

import ru.gburkov.models.*;

import java.util.*;

public class Tracker {
    private Item[] items = new Item[10];
    private int position = 0;
    private static final Random RN = new Random();

    public Item add(Item item) {
        item.setId(this.generateId());
        items[position++] = item;
        return item;
    }

    protected Item findById(String id) {
        Item result = null;
        for (Item item : items) {
            if (item != null && item.getId().equals(id)) {
                result = item;
                break;
            }
        }
        return result;
    }

    public void edit(Item fresh) {
        for (int index = 0; index != items.length; ++index) {
            Item item = items[index];
            if (item != null && item.getId().equals(fresh.getId())) {
                items[index] = fresh;
                break;
            }
        }
    }

    public void delete(Item del) {
        for (int i = 0; i != items.length; i++) {
            Item item = items[i];
            if (items[i] != null && item.getId().equals(del.getId())) {
                items[i] = null;
                break;
            }
        }
    }

    public Item findByName(String name) {
        Item result = null;
        for (Item item : items) {
            if (item != null && item.getName().equals(name)) {
                result = item;
                break;
            }
        }
        return result;
    }

    public Item findByDescription(String desc) {
        Item result = null;
        for (Item item : items) {
            if (item != null && item.getDescription().equals(desc)) {
                result = item;
                break;
            }
        }
        return result;
    }

    public Item findByCreate(long create) {
        Item result = null;
        for (Item item : items) {
            if (item != null && item.getCreate()== create) {
                result = item;
                break;
            }
        }
        return result;
    }

    public Comment addComment(Item item, Comment comments) {
        for (int i = 0; i != items.length; i++) {
            if (items[i]!=null && items[i].getId().equals(item.getId())){
                items[i].addComment(comments);
            }
        }
        return comments;
    }

    String generateId() {
        return String.valueOf(RN.nextInt(1000));
    }

    public Item[] getAll() {
        Item[] result = new Item[position];
        for (int index = 0; index != this.position; index++) {
                result[index] = items[index];
        }
        return result;
    }
}