package solutions;
/*9)input array={red,green,blue,ivory}
sort the given array
reverse the given array
if user input is 1 it should give oth element of an reversed array.
*/
import java.util.*;
import java.util.Arrays;
import java.util.Collections;
public class Que9 {
public static void main (String args[])
{
	Que9 example =new Que9();
	String array[] = {"red","green","blue","ivory"}; 
	String output = example.convert2(array,4);
	System.out.print(output);
	}
public String convert(String[] array, int n)
{
	String output=new String();
	Arrays.sort(array,Collections.reverseOrder());
	output=array[n-1];
	return output;
	
}
public String convert2(String[] array, int n)
{  List<String> list=Arrays.asList(array);
   Collections.sort(list);
   Collections.reverse(list);
   String[] reversed = list.toArray(array);
	String output=new String();
	output=reversed[n-1];
	return output;
	
}
}
