package com.mouni;

public class ConstantTimeExample {
	public static void printFirstElement(int [] arr) {
		if(arr.length >0) {
			System.out.println("first element is:"+arr[0]);
		} else {
			System.out.println("Array is empty.");
		}
	}

	public static void main(String[] args) {
		int [] numbers= {10,20,30,40,50,60,70,80,90,15,25,35,45,55,65,44,32,22,11,99,88,77,66,56,67};
		printFirstElement(numbers);
		

	}

}
