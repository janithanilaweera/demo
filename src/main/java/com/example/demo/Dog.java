package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Dog {

@Id
private String id;
private String name;
private int wight;
public Dog() {}
public Dog(String id, String name, int wight) {
	super();
	this.id = id;
	this.name = name;
	this.wight = wight;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getWight() {
	return wight;
}
public void setWight(int wight) {
	this.wight = wight;
}
@Override
public String toString() {
	return "Dog [id=" + id + ", name=" + name + ", wight=" + wight + "]";
}

}
