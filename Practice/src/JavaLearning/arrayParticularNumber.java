package JavaLearning;

import java.util.Scanner;

public class arrayParticularNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int lenght = sc.nextInt();
		System.out.println("Enter the numbers of the array");
		int[] myArray = new int[lenght];
		for (int i = 0; i < myArray.length; i++) {
			myArray[i] = sc.nextInt();
		}
		int i = 0;
		for (i = 0; i < myArray.length; i++) {
			if (myArray[i] == 13) {
				System.out.println("Number exists");

	}
		}
	}
}
