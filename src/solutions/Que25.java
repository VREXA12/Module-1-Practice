package solutions;
/*25) Input1=”Hello World”; output-------à “dello WorlH”.
count the number of words in the string
Input string="i work in capgemini.";
output=4;
*/
public class Que25 {
	public static void main(String args[]) {
      Que25 code = new Que25();

		System.out.println(code.function1("Hello World"));
		System.out.print(code.function2("i work in capgemini."));
	}
	public String reverse(String str)
	{StringBuilder t =new StringBuilder();
	t.append(str);
	t.reverse();
	String res = t.toString();
		return res;
	}
	public String function1(String str)
	{
		char p1=str.charAt(0);
		char p2 = str.charAt(str.length()-1);
		StringBuilder n1=new StringBuilder(str);
		n1.setCharAt(0, p2);
		n1.setCharAt(str.length()-1, p1);
		String test=n1.toString();
		
		
		return test;
	}
	public int function2(String str)
	{int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==' ')
				{ count++; }			
		}
		return count+1;
	}
}
