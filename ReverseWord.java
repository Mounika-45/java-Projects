package com.mouni;

public class ReverseWord {

	public static void main(String[] args) {
	
		        String input = "Java is simple and easy";
		        String result = reverseWords(input);
		        System.out.println("Original String: " + input);
		        System.out.println("Reversed Words: " + result);
		    }

		    public static String reverseWords(String input) {
		        String[] words = input.split("\\s+");
		        StringBuilder reversedSentence = new StringBuilder();

		        for (String word : words) {
		            StringBuilder reversedWord = new StringBuilder(word);
		            reversedSentence.append(reversedWord.reverse().toString()).append(" ");
		        }

		        return reversedSentence.toString().trim();
		    }
		}

		
