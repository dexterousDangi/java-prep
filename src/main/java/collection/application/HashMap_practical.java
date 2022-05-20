package collection.application;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap_practical {

	public static void main(String[] args) {

		Book book = new Book();
		book.setName("get started");
		book.setPrice(2000);
		System.out.println(book.getName() + "," + book.getPrice());
		System.out.println();

		HashMap<Book, Player2> map = new HashMap<>();
		map.put(new Book(412 ,"alpha" ), new Player2(22,"diago"));
		map.put(new Book(190 ,"beta" ), new Player2(25,"siro"));
		map.put(new Book(321 ,"para" ), new Player2(20,"dino"));
		map.put(new Book(222 ,"trop" ), new Player2(21,"petro"));
		
		Set<Entry<Book,Player2>>set=map.entrySet();
		Iterator<Entry<Book, Player2>> itr=set.iterator();
		
		while(itr.hasNext()) {
			Entry<Book, Player2> entry=itr.next();
			Book b=(Book)entry.getKey();
			Player2 player=(Player2)entry.getValue();
			System.out.println("key: "+ b.getName()+" : "+b.getPrice());
			System.out.println("value: "+ player.name + " : "+ player.age);			
		}
	}

}

class Book {
	private int price;
	private String name;

	Book() {
	}

	Book(int price, String name) {
		this.name = name;
		this.price = price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getPrice() {
		return this.price;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

}

class Player2 {
	int age;
	String name;

	Player2() {

	}

	Player2(int age, String name) {
		this.age = age;
		this.name = name;
	}
}
