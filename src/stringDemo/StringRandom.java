package stringDemo;

import java.util.Random;

public class StringRandom {

	public static void main(String[] args) {
		String[] cities = { "cambridge", "brampton", "brantford", "cornwall", "burlington", "barrie" };

		Random random = new Random();
		int randomIndex = random.nextInt(cities.length);
		String randomString = cities[randomIndex];
		System.out.println(randomString);

	}

}
