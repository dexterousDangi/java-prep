package collection.application;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

// comparator interface contains two methods: compare() and equals()
public class Comparator_interface_usage {

	public static void main(String[] args) {

		LinkedList<Player> lk = new LinkedList<>();
		lk.add(new Player("pardeep", 183));
		lk.add(new Player("jack", 186));
		lk.add(new Player("zoro", 176));
		lk.add(new Player("pink", 163));

		Collections.sort(lk, new HeightComp());
		System.out.println("sorting is done on the bases of height in cms");
		for (Player p : lk)
			System.out.println(p.height + " -- " + p.name);
		
		Collections.sort(lk, new NameComp());
		System.out.println("sorting is done on the bases of String data:");
		for (Player k : lk)
			System.out.println(k.height + "--" + k.name);

	}

}

class Player {
	String name;
	int height;

	Player(String name, int height) {
		this.name = name;
		this.height = height;
	}
}
// here we write sorting logics in seperate class unlike the comparable interface where we had written the sorting logics inside the same class

class HeightComp implements Comparator<Player> {

	@Override
	public int compare(Player o1, Player o2) {

		if (o1.height == o2.height)
			return 0;
		if (o1.height > o2.height)
			return 1;
		else
			return -1;
	}

}

class NameComp implements Comparator<Player> {

	@Override
	public int compare(Player o1, Player o2) {
		return (o1.name).compareTo(o2.name);
	}

}