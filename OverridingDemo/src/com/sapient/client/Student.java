package com.sapient.client;

public class Student {

	private int marks;
	private String sname;
	private int sid;

	public Student(int sid, String name, int marks) {
		super();
		this.sid = sid;
		this.sname = name;
		this.marks = marks;

	}

	public String toString() {

		return sid + " " + sname + " " + marks;
	}

	public boolean equals(Object obj) {
		Student stud = (Student) obj;
		if (this.sid == stud.sid && this.sname == stud.sname)
			return true;
		return false;
	}
	
	
}
