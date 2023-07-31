package com.basic;

import java.util.Scanner;

public class WordOccurance2 {
public static void main(String[] args) {
//	Scanner sc =new Scanner(System.in);
//	System.out.println("Enter any string");
//	String s=sc.nextLine();
	String s ="India is my country and India having 27 state" ;
			String[] Words = s.split("");
			for (int i = 0; i < Words.length; i++) {
				int count = 0;
				for (int j = i; j < Words.length; j++) {
					if (Words[i].equals(Words[j])) {
						count++;
						if (count > 1)
							Words[j] = "";

					}

				}
				if (!Words[i].isEmpty()) {
					System.out.println(Words[i] + "  =  " + count);
				}
			}

		}
}

