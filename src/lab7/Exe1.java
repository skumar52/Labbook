package lab7;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;



public class Exe1 {
	public List getvalues(HashMap map) {
		List temp = new ArrayList<>(map.values());
		Collections.sort(temp);
		return temp;
		
	}

	public static void main(String[] args) {
		Exe1 ex1 =new Exe1();
		HashMap hm1 = new HashMap();
		hm1.put("c", 5);
		hm1.put("h",7);
		hm1.put("e",9);
		hm1.put("m",2);
		hm1.put("i",4);
		System.out.println(ex1.getvalues(hm1));

	}

}
