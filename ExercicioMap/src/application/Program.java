package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Map<String, Integer> votes = new HashMap<>();

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter file full path: ");
		String path = sc.nextLine();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line = br.readLine();

			while (line != null) {

				String[] fields = line.split(",");
				String name = fields[0];
				int amountOfVotes = Integer.parseInt(fields[1]);

				if (votes.containsKey(name)) {

					int parcialCount = votes.get(name);
					votes.put(name, parcialCount + amountOfVotes);

				} else {
					votes.put(name, amountOfVotes);
				}

				line = br.readLine();

			}
			for (String key : votes.keySet()) {
				System.out.println(key + ": " + votes.get(key));

			}
		} catch (IOException e) {
			System.out.println("Error " + e.getMessage());
		}

		sc.close();

	}

}
