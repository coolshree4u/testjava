package com.tution;

public class Producer1 implements Runnable {
	StringBuffer sb;

	public Producer1() {
		sb = new StringBuffer();
	}

	@Override
	public void run() {
		synchronized (sb) {
			for (int i = 1; i <= 10; i++) {
				try {
					sb.append(i + ":");
					Thread.sleep(100);
					System.out.println("Appending " + i);
				} catch (Exception e) {
					
				}
			}
			 sb.notify();
		}

	}
}
