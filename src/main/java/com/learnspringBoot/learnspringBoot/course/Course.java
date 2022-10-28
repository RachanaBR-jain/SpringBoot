package com.learnspringBoot.learnspringBoot.course;

public class Course {
	private long id;
	private String course, author;
	

	public Course(long id, String course, String author) {
		this.id = id;
		this.course = course;
		this.author = author;
	}


	public long getId() {
		return id;
	}


	public String getCourse() {
		return course;
	}


	public String getAuthor() {
		return author;
	}


	public void setId(long id) {
		this.id = id;
	}


	public void setCourse(String course) {
		this.course = course;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	@Override
	public String toString() {
		return "Course [id=" + id + ", course=" + course + ", author=" + author + "]";
	}
	

}
