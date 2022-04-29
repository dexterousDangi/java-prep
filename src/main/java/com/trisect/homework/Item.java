package com.trisect.homework;

//J4B.pdf
public class Item {

	int quantity;
	int price;
	Item(int quantity1, int price1){
		quantity=quantity1;
		price=price1;
		
	}
	Item(){
		quantity=10;
		price=5;
	}
	public static void main(String[] args) {
		Item i2=new Item();
		System.out.println(i2.price+":"+i2.quantity);
		Item i1=new Item(20,10);
		System.out.println(i1.price+":"+i1.quantity);

	}

}
