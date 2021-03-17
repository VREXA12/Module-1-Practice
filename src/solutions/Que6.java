package solutions;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*6) HashMap<String,Integer> h1={“abc”:50,”efg”:70};
if the mark is less than 60 then put the output in the
HashMap<String,String> h2={“abc”:”fail”,”efg”:”pass”}
*/
public class Que6 {
	public static void main(String args[]) {
		Que6 example = new Que6();
		HashMap<String, Integer> h1 = new HashMap<>();
		h1.put("abc", 50);
		h1.put("efg", 70);
		example.con(h1);
	}

	public void con(HashMap<String, Integer> map1) {
		HashMap<String, String> finalmap = new HashMap<>();
		Set<Map.Entry<String, Integer>> end = map1.entrySet();
		for (Map.Entry<String, Integer> iterated : end) {
			if (iterated.getValue() >= 60) {
				finalmap.put(iterated.getKey(), "pass");
			} else if (iterated.getValue() < 60) {
				finalmap.put(iterated.getKey(), "fail");
			}
		}
		System.out.print(finalmap);
	}

}
