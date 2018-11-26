package JavaLearning;

import java.util.Scanner;

public class arraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int lenght = sc.nextInt();
		int [] myArray = new int[lenght];
		System.out.println("Enter the numbers of the array");
		for(int i=0; i<myArray.length; i++) {
			myArray[i] = sc.nextInt();
		}
		int sum = 0;
		for(int i=0; i<myArray.length; i++) {
			if(i %2 !=0) {
				sum += myArray[i];
			}
		}
		System.out.println(sum);

	}

}
