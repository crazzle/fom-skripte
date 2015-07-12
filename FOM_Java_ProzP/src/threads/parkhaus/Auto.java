package threads.parkhaus;

import java.util.Random;

public class Auto implements Runnable {
	static Parkhaus p = Parkhaus.getInstance();
	String name = null;

	public Auto(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		p.passieren();
		System.out.println(name + " hat passiert.");
		try {
			Thread.sleep(new Random().nextInt(500));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Fahrer von Auto " + name + " geht einkaufen.");
		p.verlassen();
		System.out.println(name + " hat verlassen.");
	}
}
