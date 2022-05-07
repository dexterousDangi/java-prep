package collection.application;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

// in case of wrapper classes and string class we don't have to implement and override the method 
// because they are internally calling comparable interface and using compareTo() method.

// but in case of user defined class objects we have to implement the comparable interface and override the compareTo() method.
 
// there is also a disadvantage of comparable interface is that we have to write the sorting logics with the busniess logics
public class Usage_of_comparable_ {

	public static void main(String[] args) {

		LinkedList<Team> ll = new LinkedList<>();
		ll.add(new Team("leo", 23));
		ll.add(new Team("jita", 53));
		ll.add(new Team("mita", 34));
		ll.add(new Team("hori", 35));

		Collections.sort(ll); // here sorting is done on the base of string data.
		for (Team l : ll)
			System.out.println(l.player + "," + l.goal);
		
		ArrayList<Club> al=new ArrayList<>();
		al.add(new Club("ultra fc", 4));
		al.add(new Club("madrid fc ",1));
		al.add(new Club("chelsea fc",3));
		al.add(new Club("barcelona fc", 2));
		
		Collections.sort(al);
		for(Club c:al)
			System.out.println(c.name+" position reached "+c.pos);
	}

}

class Team implements Comparable<Team> {      // sorting string data
	String player;
	int goal;

	Team(String player, int goal) {
		this.player = player;
		this.goal = goal;		
	}

	@Override
	public int compareTo(Team o) {
		return player.compareTo(o.player);
	}

}

class Club implements Comparable<Club> {    // sorting integer data

	String name;
	int pos;
	Club(String name,int pos){
		this.name=name;
		this.pos=pos;
	}
	@Override
	public int compareTo(Club o) {
		if(pos==o.pos)
			return 0;
		if(pos>o.pos)
			return 1;
		else
		return -1;
	}

}
