package xyz;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class FriendsGraph {

	public static void main(String[] args) {
		Map<String,List<String>>graph=new HashMap<>();
		graph.put("Lishi",Arrays.asList("Giyan") );
		graph.put("Giyan",Arrays.asList("Lishi","Divith") );
		graph.put("Divith",Arrays.asList("Giyan") );
		for(String person:graph.keySet()) {
			System.out.println(person +"is friends with"+ graph.get(person));
		}
		
		// TODO Auto-generated method stub

	}

}
