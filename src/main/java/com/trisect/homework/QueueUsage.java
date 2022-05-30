package com.trisect.homework;

import java.util.LinkedList;
import java.util.Random;
import java.util.*;
public class QueueUsage {

		public static void main(String[] args) {
			
			Random random= new Random();
			Queue<Integer> queue = new LinkedList<>();
			
			System.out.println(queue.peek());
			
			queue.add(random.nextInt(100));
			queue.add(random.nextInt(100));
			queue.add(random.nextInt(100));
			queue.add(random.nextInt(100));
			queue.add(random.nextInt(100));
			System.out.println(queue);
			System.out.println("size :"+queue.size());   
			
			System.out.println(queue.element());   // gives us front of the queue, and throws exception if the queue is empty
			System.out.println(queue);
			System.out.println(queue.peek());    // will give us the head of the queue, if empty didn't throw any exception and will print null instead. 
			System.out.println(queue);
			System.out.println(queue.poll());    // always removes head
			System.out.println(queue);
			System.out.println(queue.remove());   // if args didn't provided in the remove() then head will be deleted
			System.out.println(queue);
			System.out.println("size: "+queue.size());   
		}
}
