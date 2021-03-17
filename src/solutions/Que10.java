package solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*10) Given two integer arrays. merge the common elements into a new array. find the sum of the elements
input1:{1,2,3,4}
input2:{3,4,5,6}
logic:{3,4}
output:7
*/

public class Que10 {
public static void main(String args[])
{
Que10 example = new Que10();
Integer arr1[]= {1,2,3,4};
Integer arr2[]= {3,4,5,6};
int sum=example.function1(arr1,arr2);
System.out.println(sum);
}
public int function1(Integer[] arr1,Integer[] arr2) {
	int sum=0;
	List<Integer> list1=Arrays.asList(arr1);
	List<Integer> list2=Arrays.asList(arr2);
	List<Integer> list3=new ArrayList<>();
	List<Integer> list4=new ArrayList<>();
	list3.addAll(list1);
	list4.addAll(list1);
	list3.removeAll(list2);
	list4.removeAll(list3);
    for (int i: list4) {
        sum += i;
    }

	return sum;
}
}
