package Interview.question;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableInterfaceUsage {

	public static void main(String[] args) {
		List<Mobile> list = new ArrayList<>();
		list.add(new Mobile("vivo",123333));
		list.add(new Mobile("samsung",133333));
		list.add(new Mobile("apple",143333));
		list.add(new Mobile("onepuls",153333));
		for(Mobile mlist:list)
		System.out.println(mlist.name+" mrp: " +mlist.mrp);
		Collections.sort(list);
		for(Mobile mlist:list)
			System.out.println(mlist.name+" mrp: " +mlist.mrp);
		
	}

}

class Mobile implements Comparable<Mobile> {
	String name;
	double mrp;

	Mobile(String name, double mrp) {
		this.name = name;
		this.mrp = mrp;
	}

	@Override
	public int compareTo(Mobile o) {
		if(mrp>o.mrp) {
			return 1;
		}else if(mrp<o.mrp) {
			return -1;
		}else {
			return 0;
		}
	}
}