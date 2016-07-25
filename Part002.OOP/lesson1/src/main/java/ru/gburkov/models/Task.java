package ru.gburkov.models;

public class Task extends Item {
	public Task (String name, String desc){
		this.name = name;
		this.description = desc;
		this.create = System.currentTimeMillis();
	}

	public String calculatePrice(){
		return "100%";
	}
}