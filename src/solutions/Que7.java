package solutions;
/*7) In a hashmap if key is odd then find average of value as integer
ex: h1={1:4,2:6,4:7,5:9}
output=(4+9)/2
*/
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class Que7 {
	public static void main(String args[])
	{
		Que7 example=new Que7();
		HashMap<Integer,Integer> h=new HashMap<>();
		h.put(1,4);
		h.put(2,6);
		h.put(4,7);
		h.put(5,9);
		float avg =example.findsum(h);
		System.out.print(avg);
	}
	public float findsum(HashMap<Integer,Integer> h)
	{  float sum=0;
	   float count=0;
		Set<Map.Entry<Integer,Integer>> end = h.entrySet();
		for(Map.Entry<Integer,Integer> iterate:end) {
			if(iterate.getKey()%2==1)
			{
			 sum=sum+iterate.getValue();
			 count++;
			}
		}
		float avg=sum/count;
		return avg;
	}
}
