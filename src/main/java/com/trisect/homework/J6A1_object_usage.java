package com.trisect.homework;

public class J6A1_object_usage {

}
 class Point11 {
	 int x,y;
	 Point11 (int x,int y){
		 this.x=x;
		 this.y=y;
		 
	 }
	 public void show() {
		 System.out.println("point :: "+x+" : "+y);
	 }
 }
 class PointTwice{
	 public void doublePoint(Point11 p) {
		 p.x = p.x*2;
		 p.y = p.y*2;
	
	 }
	 public static void main(String []args) {
		 Point11 p1=new Point11(5,4);
		 Point11 p2=new Point11(2,9);
		 PointTwice pt= new PointTwice();
		 pt.doublePoint(p2);
		 p1.show();
		 p2.show();
	 }
 }