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


    public Comment addComment(Item item, Comment comments) {
        for (int i = 0; i != items.length; i++) {
            if (items[i]!=null && items[i].getId().equals(item.getId())){
                if (items[i].getComment()==null) {
                    items[i].addComment(comments);
                }else items[i].setComment(comments);
            }
        }
        return comments;
    }

    String generateId() {
        return String.valueOf(RN.nextInt(10000));
    }

    public Item[] getAll() {
        Item[] result = new Item[position];
        for (int index = 0; index != this.position; index++) {
                result[index] = items[index];
        }
        return result;
    }
}