package xyz;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class studentHashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> stu=new HashMap<>();
		stu.put(1, "mounika");
		stu.put(2, "anusha");
		stu.put(3, "jyothi");
		stu.put(4, "keerthi");
		stu.put(5, "yasu");
		System.out.println(stu);
		stu.remove(1);
		System.out.println(stu);
		stu.replace(3, "mahi");
		System.out.println(stu);
			if(stu.containsKey(4)){
				System.out.println("yes");
			}else {
				System.out.println("no");
			}
			for(int i=1;i<stu.size()+1;i++) {
				System.out.println(stu.get(i));
			}
		//stu.keySet();
		System.out.println(stu.keySet());
	}

}
