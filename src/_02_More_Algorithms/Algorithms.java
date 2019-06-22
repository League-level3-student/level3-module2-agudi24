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

	public static List<Double> sortScores(List<Double> scores) {
		for(int i = 0; i < scores.size(); i++) {
			for(int j = i+1; j<scores.size(); j++) {
				if(scores.get(i) > scores.get(j)) {
					
					double temp = scores.get(i);
					scores.set(i, scores.get(j));
					scores.set(j, temp);
				}
			}
		}
		return scores;
	}
	
	public static List<String> sortDNA(List<String> sequence){
		for (int i = 0; i < sequence.size(); i++) {
			for (int j = i + 1; j < sequence.size(); j++) {
				if(sequence.get(i).length() > sequence.get(j).length()) {
					String temp = sequence.get(i);
					sequence.set(i, sequence.get(j));
					sequence.set(j, temp);
				}
			}
		}
		return sequence;
		
	}
	
	public static List<String> sortWords(List<String> words){
		for (int i = 0; i < words.size(); i++) {
			for (int j = i + 1; j < words.size(); j++) {
				if(words.get(i).compareTo(words.get(j)) > 0) {
					String temp = words.get(i);
					words.set(i, words.get(j));
					words.set(j, temp);
				}
			}
		}
		return words;
		
	}
}
