package solutions;

import java.util.ArrayList;


/*
 26)int[] input={2,1,4,1,2,3,6};
check whether the input has the sequence of "1,2,3". if sooutput=
true;
int[] input={1,2,1,3,4,5,8};
output=false
*/
public class Que24 {
public static void main(String args[])
{
Que24 code=new Que24();
String ans =code.sol("hello");
System.out.print(ans);
}
public String sol(String str)
{
	String ans=new String();
	ArrayList<Character> list=new ArrayList<>();
	for(int i=0;i<str.length();i+=2)
	{
		list.add(str.charAt(i));
	}
	StringBuilder new1=new StringBuilder();
	for(char it:list) {
		new1.append(it);
	}
	ans=new1.toString();
return ans;}
}
