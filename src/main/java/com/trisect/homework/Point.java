package com.trisect.homework;

public class Point {
int x;
int y;
	public static void main(String[] args) {
		Point p1=new Point();
		p1.x=4;
		p1.y=4;
	    Point p2=new Point();
	    p2.y=7;
	    p2.x=4;
	    Point p3=new Point();
	    p3.x=p1.y-p2.y;
	    p3.y=p1.x+p2.x;
	    System.out.println(p3.x);
	    System.out.println(p3.y);
	    
	    Point p,pp;
	    p=new Point();
	    pp=new Point();
	    p.x=4;
	    p.y=7;
	    pp.x=p.x+1;
	    pp.y=p.y+3;
	    System.out.println("P1::"+p.x+","+p.y);
	    System.out.println("P2::"+pp.x+","+pp.y);
	    p.x=p.x+pp.x;
	    p.y=p.y-pp.y;
	    System.out.println("P1::"+p.x+","+p.y);
	    System.out.println("P2::"+pp.x+","+pp.y);
	    
	    
		
	}

}
