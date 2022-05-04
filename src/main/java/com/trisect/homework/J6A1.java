package com.trisect.homework;

public class J6A1 {   // car class
	
	int speed;
	String model;
	J6A1(String model1){
			model= model1;
			speed=0;
	}
	public void accerleration(int x) {
		speed=speed+x;
	}
	public void brake(int x) {
		speed=speed-x;
	}
	public int currentSpeed() {
		return  speed;
	}
	
	public void safeSpeed() {
		if(speed<100)
			System.out.println("safe speed");
		else
			System.out.println("unsafe speed");
	}
	public void emergencyBrake() {
		if(speed >100) {
			speed =0;
			System.out.println("emergency Brake applied : " +model);
		}else {
			System.out.println("under control till now:" + speed);
		}
	}
	
	
	
	public static void main(String[] args) {
		J6A1 car1=new J6A1("maruti swfit");
		car1.accerleration(50);
		int currentSpeed= car1.currentSpeed();
		System.out.println("current speed of swfit :"+currentSpeed);
		car1.brake(34);
		System.out.println(car1.currentSpeed());
		
		J6A1 car2= new J6A1("wagonR");
		J6A1 car3= new J6A1("xuv");
		
		car2.accerleration(45);
		car3.accerleration(50);
		car3.brake(25);
		car3.accerleration(100);
		car2.brake(3);
		if(car2.currentSpeed()>car3.currentSpeed()) {
			System.out.println(car2.model+ " is winning"+ "current speed is :"+car2.currentSpeed());
			
		}else {
			System.out.println(car3.model +" is winning"+ "current speed is :"+car3.currentSpeed());
		}
		car2.safeSpeed();
		car3.safeSpeed();
	
		car3.emergencyBrake();
		System.out.println("current speed :"+car3.currentSpeed());
		
		J6A1 car4= new J6A1("Honda");
		car4.accerleration(50);
		car4.brake(15);
		System.out.println(car4.model+" speed "+car4.currentSpeed());
		car4.accerleration(60);
		car4.safeSpeed();
		car4.emergencyBrake();
		System.out.println(car4.currentSpeed());
		car4.accerleration(20);
		car4.safeSpeed();
		car4.emergencyBrake();
		System.out.println(car4.currentSpeed());
	}

}
