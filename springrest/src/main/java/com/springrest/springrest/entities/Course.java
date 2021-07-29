package com.springrest.springrest.entities;

//import javax.persistence.Entity;
//import javax.persistence.Id;

//@Entity
public class Course {
//	@Id
	private long id;
	private String title;
	private String desc;
	private String tutor;
	public Course(long id, String title, String desc, String tutor) {
		super();
		this.id = id;
		this.title = title;
		this.desc = desc;
		this.tutor = tutor;
	}
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public String getTutor() {
		return tutor;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public void setTutor(String tutor) {
		this.tutor = tutor;
	}
	@Override
	public String toString() {
		return "Course [id=" + id + ", title=" + title + ", desc=" + desc + ", tutor=" + tutor + "]";
	}
	
	
}
