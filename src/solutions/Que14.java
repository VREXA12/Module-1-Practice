package solutions;
/*14) HashMap with regnum as key and mark as value. find the avg of marks whose key is odd.
input:{12:90,35:90,33:90,56:88}
output:avg of(90+90) =90
*/
import java.util.HashMap;
public class Que14 {
public static void main(String args[])
{
	Que14 code =new Que14();
HashMap<Integer,Integer> map = new HashMap<>();
map.put(12, 90);
map.put(35, 90);
map.put(33,90);
map.put(56, 88);
Integer ans=code.avgval(map);
System.out.println(ans);
}
public Integer avgval(HashMap<Integer,Integer> map)
{
	Integer sum=0;
	Integer count=0;
	for(Integer iterate:map.keySet())
	{
		int key =iterate;
		int value =map.get(iterate);
		if(key%2==1)
		{
			sum+=value;
			count++;
		}
		
	}
	
return sum/count;
}
}
