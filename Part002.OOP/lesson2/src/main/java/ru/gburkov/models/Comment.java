package ru.gburkov.models;

public class Comment{
	private String comment;

	public Comment(String text) {
		this.comment = text;
	}

	public Comment() {
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	@Override
	public String toString() {
		return comment;
	}
}