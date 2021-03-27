package solutions;
/*23) String[] input={"100","111","10100","10","1111"} input2="10"
output=2;count strings having prefix"10" but "10" not included in count
operation-- for how many strings input2 matches the prefix of each string in input1
String[] input={"01","01010","1000","10","011"}
output=3; count the strings having prefix"10","01" but "10","01" not included
*/
public class Que23 {
public static void main(String args[])
{Que23 code = new Que23();
	String[] input={"100","111","10100","10","1111"};
	int count = code.count2(input);
	System.out.println(count);
	String[] input2={"01","01010","1000","10","011"};
	int count1 = code.count1(input2);
	System.out.println(count1);
}
public int count1(String[] arr) {
	int res=0;
	for(String it:arr)
	{
		if((it.charAt(0)=='1'&&it.charAt(1)=='0')||(it.charAt(0)=='0'&&it.charAt(1)=='1'))
		{
			String temp=it.substring(1,it.length());
			if(!temp.contains("10")&&!temp.contains("01"))
			{
				System.out.println("pos"+it);
				res++;
			}
		}
	}
	return res;
}
public int count2(String[] arr) {
	int res=0;
	for(String it:arr)
	{
		if(it.charAt(0)=='1'&&it.charAt(1)=='0')
		{
			String temp=it.substring(1,it.length());
			if(!temp.contains("10"))
			{
				res++;
			}
		}
	}
	return res;
}

}
