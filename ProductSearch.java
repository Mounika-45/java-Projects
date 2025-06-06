package xyz; 
import java.util.TreeSet;
import java.util.Scanner;

public class ProductSearch {

	public static void main(String[] args) {
	
		        // Create TreeSet of product names
		        TreeSet<String> products = new TreeSet<>();
		        products.add("Keyboard");
		        products.add("Mouse");
		        products.add("Monitor");
		        products.add("CPU");
		        products.add("Webcam");

		        // Display all products
		        System.out.println("Product List:");
		        for (String product : products) {
		            System.out.println(product);
		        }

		        // Simulate search functionality
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter product name to search: ");
		        String search = scanner.nextLine();

		        if (products.contains(search)) {
		            System.out.println(search + " is available.");
		        } else {
		            System.out.println(search + " is not available.");
		        }

		        scanner.close();
		    }
		}
		// TODO Auto-generated method stub

