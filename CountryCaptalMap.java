package xyz;
import java.util.TreeMap;
import java.util.Map;
public class CountryCaptalMap {

	public static void main(String[] args) {
		
		        TreeMap<String, String> countryCapital = new TreeMap<>();

		        // Add entries
		        countryCapital.put("India", "New Delhi");
		        countryCapital.put("USA", "Washington");
		        countryCapital.put("Germany", "Berlin");
		        countryCapital.put("Japan", "Tokyo");
		        countryCapital.put("India", "Delhi"); 
		        System.out.println("Country - Capital:");
		        for (Map.Entry<String, String> entry : countryCapital.entrySet()) {
		            System.out.println(entry.getKey() + " - " + entry.getValue());
		        }

		        System.out.println("\nFirst Key: " + countryCapital.firstKey());
		        System.out.println("Last Key: " + countryCapital.lastKey());
		        System.out.println("Higher Key than 'Germany': " + countryCapital.higherKey("Germany"));
		        System.out.println("Lower Key than 'Germany': " + countryCapital.lowerKey("Germany"));
		    }
}

	
