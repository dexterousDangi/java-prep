package Interview.question;

import multithreading_wati_notify_notifyAll.Message;

public class Notifier implements Runnable {

	private Message msg;

	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		System.out.println(name + " started");
		try {
			Thread.sleep(1000);
			synchronized (msg) {
				msg.setMsg(name + " Notifier work done");
				msg.notify();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
