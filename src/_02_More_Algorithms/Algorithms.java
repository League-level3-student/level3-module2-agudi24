package _02_More_Algorithms;

import java.util.List;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		for (int i = 0; i < eggs.size(); i++) {
			if(eggs.get(i) == "cracked") {
				return i;
			}
		}
		return 0;
	}
	public static int countPearls(List<Boolean> oysters) {
		int count = 0;
		for (int i = 0; i < oysters.size(); i++) {
			if(oysters.get(i) == true){
				count++;
			}
		}
		return count;
	}
	public static double findTallest(List<Double> peeps) {
		double tallest = 0;
		for (int i = 0; i < peeps.size(); i++) {
			if(peeps.get(i) > tallest) {
				tallest = peeps.get(i);
			}
		}
		return tallest;
	}
	public static String findLongestWord(List<String> words) {
		String longestWord = "";
		for (int i = 0; i < words.size(); i++) {
			if(words.get(i).length() > longestWord.length()) {
				longestWord = words.get(i);
			}
		}
		return longestWord;
	}
	public static boolean containsSOS(List<String> message) {
		for (int i = 0; i < message.size(); i++) {
			if(message.get(i).contains("... --- ...")) {
				return true;
			}
		}
		return false;
	}
	public static List<Double> sortScores(List<Double> results){
		for (int i = 0; i < results.size(); i++) {
			boolean sorted = true;
			while (sorted) {
			sorted = false;
			for (int j = 1; j < results.size(); i++) {
				if(results.get(j - 1) > results.get(j)) {
					Double result = results.get(j - 1);
					Double temp = results.get(j - 1);
				    Double result2 = results.get(j);
					result = results.get(j);
					result2 = temp;
					sorted = true;
				}
			}
			if(sorted == true) {
				System.out.println(results);
			}
			}
		}
		return results;
	}
}
