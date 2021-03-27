package solutions;
/* 18)An array of integers is given.The given element is removed new array is returned.
input1:{10,10,20,30,76}
output: {20,20,76}(10 is asked to remove)
*/
import java.util.*;
public class Que18 {
public static void main(String args[])
{
Que18 code =new Que18();
int arr[]= {10,10,20,30,76};
Integer ans[]=code.getans(arr,10);
for(int i:ans)
System.out.println(i);
}
public Integer[] getans (int[] arr , int find)
{
	List<Integer> list=new ArrayList<>();
	for(int i:arr)
	{
		if(i!=find)
			list.add(i);
	}
	Integer res[]=list.toArray(new Integer[0]);

	return res;}
}
