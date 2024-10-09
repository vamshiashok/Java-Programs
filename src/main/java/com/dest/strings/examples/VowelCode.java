package com.dest.strings.examples;

import java.util.Scanner;

class VowelOperations{
	Scanner sc = new Scanner(System.in);

	void countVowelConsonant(String s) {
		int vowel_count = 0;
		int consonant_count = 0;
		System.out.println("Calculating the Vowel and Consonant Count ");
		for (int i=0; i<s.length(); i++) {
			if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u' ||
					s.charAt(i)=='A' || s.charAt(i)=='E' || s.charAt(i)=='I' || s.charAt(i)=='O' || s.charAt(i)=='U') {
				vowel_count++;
			}else {
				consonant_count++;
			}
		}
		System.out.println("The Vowel Count is: " + vowel_count);
		System.out.println("The Consonant Count is: " + consonant_count);
		System.out.println("------------------------");
	}

	void upperCaseVowels(String s) {
		int upper_vowel_count = 0;
		System.out.println("Calculating the UpperCase Vowels");
		for (int i=0; i<s.length(); i++) {
			if(s.charAt(i)=='A' || s.charAt(i)=='E' || s.charAt(i)=='I' || s.charAt(i)=='O' || s.charAt(i)=='U') {
				upper_vowel_count++;
			}
		}
		System.out.println("The UpperCase Vowel Count is: " + upper_vowel_count);
		System.out.println("------------------------------");
	}

	void lowerCaseVowels(String s) {
		int lower_vowel_count = 0;
		System.out.println("Calculating the LowerCase Vowels");
		for (int i=0; i<s.length(); i++) {
			if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u') {
				lower_vowel_count++;
			}
		}
		System.out.println("The LowerCase Vowel Count is: " + lower_vowel_count);
		System.out.println("------------------------------");
	}

	void replaceAllVowels(String s) {
		String str_temp = "";
		System.out.println("Replacing all the Vowel with a Special Character");
		for (int i=0; i<s.length(); i++) {
			if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u' ||
					s.charAt(i)=='A' || s.charAt(i)=='E' || s.charAt(i)=='I' || s.charAt(i)=='O' || s.charAt(i)=='U') {
				str_temp = str_temp + '@';
			}else {
				str_temp = str_temp + s.charAt(i);
			}
		}
		System.out.println("The replaced string is: " + str_temp);
		System.out.println("-----------------------");
	}

	void replaceUpperCaseVowels(String s) {
		String str_temp = "";
		System.out.println("Replacing all the UpperCase Vowels with a Special Character");
		for (int i=0; i<s.length(); i++) {
			if(s.charAt(i)=='A' || s.charAt(i)=='E' || s.charAt(i)=='I' || s.charAt(i)=='O' || s.charAt(i)=='U') {
				str_temp = str_temp + '@';
			}else {
				str_temp = str_temp + s.charAt(i);
			}
		}
		System.out.println("The replaced string is: " + str_temp);
		System.out.println("-------------------------");
	}

	void replaceLowerCaseVowels(String s) {
		String str_temp = "";
		System.out.println("Replacing all the LowerCase Vowels with a Special Character");
		for (int i=0; i<s.length(); i++) {
			if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u') {
				str_temp = str_temp + '@';
			}else {
				str_temp = str_temp + s.charAt(i);
			}
		}
		System.out.println("The replaced string is: " + str_temp);
		System.out.println("-------------------------");
	}

	void replaceIndividualVowels(String s) {
		String str_temp = "";
		System.out.println("Replacing Individual Vowel with an Individual Special Characters");
		for (int i=0; i<s.length(); i++) {
			if(s.charAt(i)=='a' || s.charAt(i)=='A') {
				str_temp = str_temp + '@';
			} else if(s.charAt(i)=='e' || s.charAt(i)=='E') {
				str_temp = str_temp + '$';
			} else if(s.charAt(i)=='i' || s.charAt(i)=='I') {
				str_temp = str_temp + '#';
			} else if(s.charAt(i)=='o' || s.charAt(i)=='O') {
				str_temp = str_temp + '&';
			} else if(s.charAt(i)=='u' || s.charAt(i)=='U') {
				str_temp = str_temp + '*';
			} else {
				str_temp = str_temp + s.charAt(i);
			}
		}
		System.out.println("The replaced string is: " + str_temp);
	}

}
public class VowelCode {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String s = sc.nextLine();
		VowelOperations vo = new VowelOperations();
		vo.countVowelConsonant(s);
		vo.upperCaseVowels(s);
		vo.lowerCaseVowels(s);
		vo.replaceAllVowels(s);
		vo.replaceUpperCaseVowels(s);
		vo.replaceLowerCaseVowels(s);
		vo.replaceIndividualVowels(s);
	}
}
