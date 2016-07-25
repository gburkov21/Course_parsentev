package ru.gburkov.start;

import ru.gburkov.models.*;

import java.util.Arrays;


public class MenuTracker {
    private Tracker tracker;
    private Input input;
    private UserAction[] actions = new UserAction[6];

    public MenuTracker(Input input, Tracker tracker) {
        this.tracker = tracker;
        this.input = input;
    }

    public void fillActions() {
        this.actions[0] = new AddItem();
        this.actions[1] = new MenuTracker.ShowItems();
        this.actions[2] = new EditItem();
        this.actions[3] = new DeleteItem();
        this.actions[4] = new AddComment();
        this.actions[5] = new ShowComments();

    }

    public void select(int key) {
        this.actions[key].execute(this.input, this.tracker);
    }

    public void show() {
        for (UserAction action : this.actions) {
            if (action != null) {
                System.out.println(action.info());
            }
        }
    }

    private class AddItem implements UserAction {
        public int key() {
            return 0;
        }

        public void execute(Input input, Tracker tracker) {
            String name = input.ask("Please enter the task's name: ");
            String desc = input.ask("Please enter the task's desc: ");
            tracker.add(new Task(name, desc));
        }

        public String info() {
            return String.format("%s. %s", this.key(), "Add the new Item.");
        }
    }

    private class EditItem implements UserAction {
        public int key() {
            return 2;
        }

        public void execute(Input input, Tracker tracker) {
            String id = input.ask("Please enter the task's id: ");
            String name = input.ask("Please enter the task's name: ");
            String desc = input.ask("Please enter the task's desc: ");
            Task task = new Task(name, desc);
            task.setId(id);
            tracker.edit(task);
        }

        public String info() {
            return String.format("%s. %s", this.key(), "Edit the new Item.");
        }
    }

    private class DeleteItem implements UserAction {
        public int key() {
            return 3;
        }

        public void execute(Input input, Tracker tracker) {
            String id = input.ask("Please enter the task's id: ");
            String name = input.ask("Please enter the task's name: ");
            String desc = input.ask("Please enter the task's desc: ");
            Task task = new Task(name, desc);
            task.setId(id);
            tracker.delete(task);
        }

        public String info() {
            return String.format("%s. %s", this.key(), "Delete item.");
        }
    }

    private static class ShowItems implements UserAction {
        public int key() {
            return 1;
        }

        public void execute(Input input, Tracker tracker) {
            for (Item item : tracker.getAll()) {
                if (item != null) {
                    System.out.println(String.format("id: %s  name: %s  description: %s", item.getId(), item.getName(), item.getDescription()));
                }
            }
        }

        public String info() {
            return String.format("%s. %s", this.key(), "Show all items");
        }
    }

    private class AddComment implements UserAction {
        public int key() {
            return 4;
        }

        public void execute(Input input, Tracker tracker) {
            String id = input.ask("Please enter the task's id: ");
            String name = input.ask("Please enter the task's name: ");
            String desc = input.ask("Please enter the task's desc: ");
            String comment = input.ask("Please enter the task's comment: ");
            Task task = new Task(name, desc);
            task.setId(id);
            tracker.addComment(task, new Comment(comment));

        }

        public String info() {
            return String.format("%s. %s", this.key(), "Add Comments.");
        }
    }

    private class ShowComments implements UserAction {
        public int key() {
            return 5;
        }

        public void execute(Input input, Tracker tracker) {
            for (Item item : tracker.getAll()) {
               item.getComments();
            }
        }

        public String info() {
            return String.format("%s. %s", this.key(), "Show all comments");
        }
    }
}