package solutions;
import java.util.LinkedHashSet;
/*22) Square root calculation of
((x1+x2)*(x1+x2))+((y1+y2)*(y1+y2))
o/p should be rounded of to int;
5)INPUT1= helloworld
INPUT2= 2. delete the char,if rpted twice.
if occurs more than twice,leave the first occurence and delete the duplicate
O/P= helwrd;
*/
import java.util.Set;
public class Que22 {
	public static void main(String[] args) {
	Que22 code = new Que22();
	int ans=code.math(2, 2, 2, 1);
	System.out.println(ans);
	
	String test="helloworld";
	String ans2=code.change1(test);
			System.out.print(ans2);
	}
public int math(int x1,int x2,int y1, int y2)
{
	int sum=((x1+x2)*(x1+x2))+((y1+y2)*(y1+y2));
	int root=(int) Math.sqrt(sum);
	return root;
}
public String change(String str) {
	String ans=new String();
	for(int i=0;i<str.length();i++)
	{
		char ch = str.charAt(i);
		if(ans.contains(Character.toString(ch)))
				{
			ans.concat(Character.toString(ch));
				}
	}
	System.out.print(ans);
	return ans;
}
public String change1(String str) {
	
	Set<Character> ch =new LinkedHashSet<>();
	for(int i=0;i<str.length();i++)
	{
		ch.add(str.charAt(i));
	}
	
	StringBuilder stnew =new StringBuilder();
	for(char it:ch)
	{
		stnew.append(it);
	}
	String res = stnew.toString();
	return res;
}
}
