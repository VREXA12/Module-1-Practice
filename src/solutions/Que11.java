package solutions;
/*11)Given two arrayslist. retrieve the odd position elements form first input and even position elemetns from second list.
put it into the new arraylist at the same positions from where they are retrieved from.
(consider 0th position as even position, and two lists are of same size)
input1:{12,1,32,3}
input2:{0,12,2,23}
output:{0,1,2,3}
*/
import java.util.ArrayList;
public class Que11 {
public static void main(String args[]){
	Que11 code =new Que11();
	ArrayList<Integer> ar1 = new ArrayList<>();
			ar1.add(12);
			ar1.add(1);
			ar1.add(32);
			ar1.add(3);
	ArrayList<Integer> ar2=new ArrayList<>();
	ar2.add(0);	
	ar2.add(12);
	ar2.add(2);
	ar2.add(23);
	ArrayList<Integer> ar3 =code.convert(ar1,ar2);
	System.out.println(ar3);
}

public ArrayList<Integer> convert (ArrayList<Integer> ar1,ArrayList<Integer> ar2)
{
	int size1 =ar1.size();
	int size2=ar2.size();
	int size=0;
	if(size2<=size1)
	{size=size1;}
	else
	size=size2;
	ArrayList<Integer> ar3=new ArrayList<>();
	for(int i=0;i<size;i++)
	{
		if(i%2!=0)
		{
			Integer temp = ar1.get(i);
			ar3.add(temp);
		}
		else
		{
			Integer temp =ar2.get(i);
			ar3.add(temp);
		}
	}
	return ar3;
}
}
