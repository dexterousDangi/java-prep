package Interview.question;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorInterfaceUsage {

	public static void main(String[] args) {
		List<Product> list= new ArrayList<>();
		list.add(new Product("house","infra",2000000));
		list.add(new Product("car","transport",20000));
		list.add(new Product("tv","electronics",40000));
		list.add(new Product("computer","information",22000));
		for(Product pro:list) {
			System.out.println(pro.name+" "+ pro.type+" "+pro.rate);
		}
		Collections.sort( list,new ProductNameComparator());
		System.out.println();
		for(Product pro:list) {
			System.out.println(pro.name+" "+ pro.type+" "+pro.rate);
		}
		
		System.out.println();
		
		Collections.sort( list,new ProductTypeComparator());
		for(Product pro:list) {
			System.out.println(pro.name+" "+ pro.type+" "+pro.rate);
		}
		
		System.out.println();
		Collections.sort( list,new ProductRateComparator());
		for(Product pro:list) {
			System.out.println(pro.name+" "+ pro.type+" "+pro.rate);
		}
	}

}

class Product {
	String name;
	String type;
	double rate;

	Product(String name, String type, double rate) {
	this.name=name;
	this.type=type;
	this.rate=rate;
	
	}
}

class ProductNameComparator implements Comparator<Product>{

	@Override
	public int compare(Product o1, Product o2) {
		return o1.name.compareTo(o2.name);
	}
	
}

class ProductRateComparator implements Comparator<Product>{

	@Override
	public int compare(Product o1, Product o2) {
		if(o1.rate>o2.rate) {
			return 1;
		}
		else if(o1.rate<o2.rate) {
			return -1;
		}else {
			return 0;
		}
	}
	
}

class ProductTypeComparator implements Comparator<Product>{

	@Override
	public int compare(Product o1, Product o2) {
		return o1.type.compareTo(o2.type);
	}
	
}