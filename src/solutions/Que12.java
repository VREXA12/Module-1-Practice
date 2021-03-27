package solutions;
/*12) arraylist of string type which has name#mark1#mark2#mark3 format. retrieve the name of the student who has
scored max marks(total of three)
input:{"arun#12#12#12","deepak#13#12#12"}
output:deepak
*/
import java.util.ArrayList;
public class Que12 {
public static void main(String args[])
{
Que12 code = new Que12();	
ArrayList<String> arr =new ArrayList<>();
arr.add("Arun#12#12#12");
arr.add("Deepak#13#12#12");
/*arr.add("Pranav#23#32#12");
arr.add("Daksh#23#12#22");
arr.add("Shreya#13#22#12");
*/
String str = code.findname(arr);
System.out.print(str);
}
public String findname(ArrayList<String> arr)
{
	String result="Null";
	int maxmarks=0;
	for(int i=0;i<arr.size();i++)
	{String temp=arr.get(i);
	 int firstindex =temp.indexOf("#");
	 String name = temp.substring(0,firstindex);
	 int secondindex = temp.indexOf("#",firstindex+1);
	 int lastindex = temp.lastIndexOf("#");
	 String marks1=temp.substring(firstindex+1,secondindex);
	 String marks2=temp.substring(secondindex+1,lastindex);
	 String marks3=temp.substring(lastindex+1,temp.length());
	 Integer m1=Integer.parseInt(marks1);
	 Integer m2=Integer.parseInt(marks2);
	 Integer m3=Integer.parseInt(marks3);
	 Integer sum =m1+m2+m3;
	 if(maxmarks<sum)
	 {
		 maxmarks=sum;
		 result=name;
		 
	 }
		
	}
	
	
	return result;
}
}
