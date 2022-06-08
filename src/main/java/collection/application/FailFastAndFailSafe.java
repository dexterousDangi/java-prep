package collection.application;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * collection class from normal collection are fail-fast type where we can't perform operation while iterating,
 * to make it thread safe or fail-safe we use the classes from the concurrent collection.
 *
 */


public class FailFastAndFailSafe {

	public static void main(String[] args) {

//		List<Integer> list = new ArrayList<>();
//		for (int i = 0; i < 11; i++) {
//			list.add(i);
//		}
//
//		for (Integer lis : list) {
//			System.out.println(lis);
//
//			// list.remove(2); this line will throw the concurrent Modification Exception,
//			// because we are modifying the list while iterating it.
//		}
//
//		Iterator<Integer> itr = list.iterator();
//		while (itr.hasNext()) {
//			Integer num = itr.next();
//
//			if (num == 6) {
//				itr.remove();
//			}
//			System.out.println(num);
//		}
//		System.out.println(list);
		//case2:
		
		
		List<Integer> list1 =Arrays.asList(1,12,24,2,42,42,1);   // this will give us the immutable list, so we can't perform the operation add or remove operation on the list
		Iterator<Integer> itr1 = list1.iterator();
		while(itr1.hasNext()) {
			Integer num=itr1.next();
			if(num==2) {
				//itr1.remove();
			}
		}
		//case3:
		List<Integer> list = new CopyOnWriteArrayList<>();
		for (int i = 0; i < 11; i++) {
			list.add(i);
		}

		for (Integer lis : list) {
			System.out.println(lis);
		}

		Iterator<Integer> itr = list.iterator();
		while (itr.hasNext()) {
			Integer num = itr.next();

			if (num == 6) {
				list.add(3);   // this thing will also throw the concurrentModificationException, to resolve this error convert "ArrayList" to "CopyOnWriteArrayList"
			}
			System.out.println(num);
		}
		System.out.println(list);
	}

}
