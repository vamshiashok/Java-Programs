package com.dest.strings.examples;

import java.util.Scanner;
/*
 * Password contain at-least one Capital and Smaller Case Alphabet
 * Password contain at-least one number
 * Password must contain a Special Character
 * Password length should be 8 to 12 character 
 * Password don't starts with a number
 */
public class PasswordValidate {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the password: ");
		String str = sc.nextLine();
		int cond_1=0;
		int cond_2=0;
		int cond_3=0;
		int cond_4=0;
		//check the password length, if it is in between 8 to 12 characters length then accept else exit 
		if(str.length()<8 || str.length()>13) {
			System.out.println("Password length should be between 8 to 12 characters.");
			System.exit(0);
		}
		if(str.charAt(0)>=48 && str.charAt(0)<=57) {
			System.out.println("Invalid Password.");
			System.exit(0);
		}
		else {
			for (int i=0; i<str.length(); i++) {
				if(str.charAt(i)>=65 && str.charAt(i)<=90) {
					cond_1 = 1;
				}else if(str.charAt(i)>=97 && str.charAt(i)<=122 ) {
					cond_2 = 1;
				}else if(str.charAt(i)>=48 && str.charAt(i)<=57) {
					cond_3 = 1;
				}else if(str.charAt(i)==' ') {
					System.out.println("Invalid Password.");
					System.exit(0);
				}else {
					cond_4 = 1;
				}
			}
		}
		if(cond_1==1 && cond_2==1 && cond_3==1 && cond_4==1) {
			System.out.println("Valid Password.");
		}else {
			System.out.println("Invalid Password.");
		}
		sc.close();
	}
}

