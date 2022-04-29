package com.trisect.homework;

//J4A
public class Rectangle {
	int length;
	int width;
	public static void main(String[] args) {
		Rectangle r=new Rectangle();
		r.length=12;
		r.width=14;
		System.out.println(r.length+","+r.width);
	}

}

//J4A.pdf

class Teacher{
	String name;
	String subject;
	public static void main(String []args) {
		Teacher t=new Teacher();
		t.name="Rita";
		t.subject="Math";
		Teacher tt=new Teacher();
		tt.name="Pardeep";
		tt.subject="Geography";
		System.out.println("teacher: "+t.name+","+"subject :"+t.subject);
		System.out.println("teacher :"+tt.name+","+"subject :"+tt.subject);
	}
}
