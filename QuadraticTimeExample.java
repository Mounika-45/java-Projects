package com.mouni;

public class QuadraticTimeExample {

	public static void main(String[] args) {
		int [] numbers= {1,1,2,2,3,4,5};
		boolean hasDuplicate=false;
		for(int i=0;i<numbers.length;i++) {
			for(int j=i+1;j<numbers.length;j++) {
				if(numbers[i]==numbers[j]) {
					hasDuplicate=true;
					System.out.println("Duplicate found:" + numbers[i]);
				}
			}
			
			
			
		}
		if(!hasDuplicate) {
			System.out.println("No duplicates found.");
		}

	}

}
