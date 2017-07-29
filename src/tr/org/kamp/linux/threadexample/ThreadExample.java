package tr.org.kamp.linux.threadexample;

import java.util.Scanner;

public class ThreadExample {
	
	static Scanner scan = new Scanner(System.in);
	static int i = 0;
	static boolean shouldRun = true;

	public static void main(String[] args) {
		
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				while(true) {
					System.out.println("Thread calisiyor, sayi: " + i);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
			}
		});
		thread.start();
	
		Thread thread2 = new Thread(new Runnable() {
			@Override
			public void run() {
				while(shouldRun) {
					System.out.println("--------------");
					System.out.println("-1 programi durdurur");
					System.out.println("Bir sayi girin: ");
					System.out.println("--------------");
					i = scan.nextInt();
					if(i == -1) {
						shouldRun = false;
					}
				}
			}
		});
		thread2.start();
	}

}
