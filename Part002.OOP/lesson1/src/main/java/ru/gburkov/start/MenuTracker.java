package ru.gburkov.start;

import ru.gburkov.models.*;

public class MenuTracker {
    private Tracker tracker;
    private Input input;
    private UserAction[] actions = new UserAction[8];

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
        this.actions[5] = new SearchByName();
        this.actions[6] = new SearchById();
        this.actions[7] = new SearchByDescription();
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
            tracker.delete(new Item(id));
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
                    System.out.println(item);
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
            String comment = input.ask("Please enter the task's comment: ");
            tracker.addComment(new Item(id), new Comment(comment));

        }

        public String info() {
            return String.format("%s. %s", this.key(), "Add Comments.");
        }
    }

    private class SearchByName implements UserAction {
        public int key() {
            return 5;
        }

        public void execute(Input input, Tracker tracker) {
            String name = input.ask("Please enter the task's name: ");
            for (Item item : tracker.getAll()) {
                if (item != null && item.getName().contains(name)){
                    System.out.println(item);
                }
            }

        }

        public String info() {
            return String.format("%s. %s", this.key(), "Search by task's name.");
        }
    }

    private class SearchById implements UserAction {
        public int key() {
            return 6;
        }

        public void execute(Input input, Tracker tracker) {
            String id = input.ask("Please enter the task's id: ");
            for (Item item : tracker.getAll()) {
                if (item != null && item.getId().contains(id)){
                    System.out.println(item);
                }
            }

        }

        public String info() {
            return String.format("%s. %s", this.key(), "Search by task's ID.");
        }
    }

    private class SearchByDescription implements UserAction {
        public int key() {
            return 7;
        }

        public void execute(Input input, Tracker tracker) {
            String desc = input.ask("Please enter the task's description: ");
            for (Item item : tracker.getAll()) {
                if (item != null && item.getDescription().contains(desc)){
                    System.out.println(item);
                }
            }

        }

        public String info() {
            return String.format("%s. %s", this.key(), "Search by task's description.");
        }
    }

}