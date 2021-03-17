package solutions;

import java.util.ArrayList;

/*
8) arraylist1={ 1,2,3,4,5}
arraylist2={ 6,7,8,9,10}
size of both list should be same
output={6,2,8,4,10}
*/

public class Que8 {
	public static void main (String args[])
	{
		Que8 example = new Que8();
	    ArrayList<Integer> al1= new ArrayList<>();
	    al1.add(1);
	    al1.add(2);
	    al1.add(3);
	    al1.add(4);
	    al1.add(5);
	    ArrayList<Integer> al2= new ArrayList<>();
	    al2.add(6);
	    al2.add(7);
	    al2.add(8);
	    al2.add(9);
	    al2.add(10);
	    example.generate(al1,al2);
		
	}
	public void generate(ArrayList<Integer> al1,ArrayList<Integer> al2)
	{
		ArrayList<Integer> al3 = new ArrayList<>();
		if(al1.size()!=al2.size())
			{System.out.print("Size of Lists are different "+al1.size()+"  "+al2.size());}
		else
		{
			for(int i=0;i<al1.size();i++)
			{
				if(i%2==0)
				{Integer temp = al2.get(i);
				al3.add(temp);}
				else 
				{Integer temp = al1.get(i);
				al3.add(temp);}
			}
			System.out.print(al3);
			
		}
		}
	
}
