package com;
import java.util.*;
public class Student implements Comparable<Student> {
	int age ;
	String name;
	Student(int age,String name){
		this.age= age;
		this.name= name;
	}
	public String toString() {
		return name;
	}
	//public int compareTo(Student s) {
	//	return this.name.compareTo(s.name);
	//}


}

