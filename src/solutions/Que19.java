package solutions;
/*19) Find the sum of the numbers in the given input string array
Input{“2AA”,”12”,”ABC”,”c1a”)
Output:6 (2+1+2+1)
Note: in the above array 12 must not considered as such
i.e,it must be considered as 1,2
*/
public class Que19 {
	public static void main(String args[])
	{
		Que19 code = new Que19();
		String[] arr= {"2AA","12","ABC","c1a"};
		int ans=code.findsum(arr);
		System.out.println(ans);
	}
	public int findsum(String[] arr)
	{int sum=0;
		for(String it:arr) {
			int len=it.length();
			for(int i=0;i<len;i++)
			{
				char temp=it.charAt(i);
				if(Character.isDigit(temp))
				{
					Integer t=Integer.parseInt(String.valueOf(temp));
					sum+=t;
				}
			}
		}
		return sum;
	}
}
