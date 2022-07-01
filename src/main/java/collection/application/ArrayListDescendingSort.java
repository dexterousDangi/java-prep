package collection.application;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDescendingSort {

	public static void main(String[] args) {
	    ArrayList<Fruit> arrList = new ArrayList<>();
        arrList.add(new Fruit("Apple"));
        arrList.add(new Fruit("banana"));
        arrList.add(new Fruit("Pear"));
        arrList.add(new Fruit("Mango"));
        arrList.add(new Fruit("Pear"));
        
        Collections.sort(arrList);
        
        for(Fruit f:arrList) {
        	System.out.println(f.fruit);
        }
	}
}
class Fruit implements Comparable<Fruit>{
	String fruit;
	Fruit(String fruit){
		this.fruit=fruit;
	}
	
	@Override
	public int compareTo(Fruit o) {

		return -(fruit).compareTo(o.fruit);
	}
}