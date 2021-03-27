package solutions;
/*17) An arraylist of Strings is given as input. The count of the String elements that are not of size input2 string is to be
returned.
input1: {"aaa","bb","cccc","d"}
input2: "bb"
output: 3("bb"-length:2)
*/
import java.util.ArrayList;
public class Que17 {
public static void main(String args[])
{ Que17 code = new Que17();
	ArrayList<String> arr = new ArrayList<>();
	arr.add("aaa");
	arr.add("bb");
	arr.add("cccc");
	arr.add("d");
	int count = code.countstring(arr,"bb");
	System.out.print(count);
}
public int countstring(ArrayList<String> arr , String len) {
	int count=0;
	int lengthtobefound = len.length();
	for(String it:arr)
	{if(lengthtobefound!=it.length()) {
		count++;
	}
		
	}	
	return count;
}
}
