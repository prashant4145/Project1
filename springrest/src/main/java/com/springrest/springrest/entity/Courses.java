package com.springrest.springrest.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Courses {
	@Id
private long id;
private String title;
private String descr;
public Courses(long id, String title, String descr) {
	super();
	this.id = id;
	this.title = title;
	this.descr = descr;
}
public Courses() {
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
public void setTitle(String title) {
	this.title = title;
}
public String getDesc() {
	return descr;
}
public void setDesc(String desc) {
	this.descr = desc;
}
@Override
public String toString() {
	return "Courses [id=" + id + ", title=" + title + ", desc=" + descr + "]";
}


}
