package test_jvisualvm;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		// modificare din eclipse
		int counter = 0;
		List<MyObject> list = new ArrayList<>();
		while (true) {
			list.add(new MyObject(counter++));
			System.out.println(counter);
			Thread.sleep(100);
		}

	}

}
