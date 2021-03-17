package solutions;

import java.util.ArrayList;

/*
3) Collect no’s frm list1 which is not present in list2
& Collect no’s frm list2 which is not present in list1
and store it in output1[].
ex: input1={1,2,3,4}; input2={1,2,3,5}; output1={4,5};
*/
public class Que3 {
	
	public static void main (String[] args) {
		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();
		ArrayList<Integer> list3 = new ArrayList<>();
		
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		
		list2.add(1);
		list2.add(2);
		list2.add(3);
		list2.add(5);
		
		list3.addAll(list1);
		list1.removeAll(list2);
		list2.removeAll(list3);
		list1.addAll(list2);
		System.out.println(list1);
	}
}
