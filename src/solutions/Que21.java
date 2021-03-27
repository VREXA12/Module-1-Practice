package solutions;
/*21)Email Validation
String input1="test@gmail.com"
1)@ & . should be present;
2)@ & . should not be repeated;
3)there should be five charcters between @ and .;
4)there should be atleast 3 characters before @ ;
5)the end of mail id should be .com;*/

public class Que21 {
public static void main(String args[]) {
	Que21 code =new Que21();
	String input1="test@gmail.com";
	boolean ans = code.check(input1);
	if(ans)
		System.out.print("Valid");
	else
		System.out.print("Invalid");
	
}
public boolean check(String em){
  //1
	if(!em.contains("@")||!em.contains("."))
		return false;
	
	//2
	int count1=0;
	int count2=0;
	for(int i=0;i<em.length();i++)
	{
		if(em.charAt(i)=='@')
			count1++;
		if(em.charAt(i)=='.')
			count2++;
	}
	if(count1>1||count2>1)
		return false;
	//3
	int index1=em.indexOf("@");
	int index2=em.indexOf(".");
	int diff=index2-index1-1;
	if(diff!=5)
		return false;
	//4)there should be atleast 3 characters before @ ;
	if(index1<3)
		return false;
	//5
	if(!em.endsWith(".com"))
		return false;
	
	return true;
}
}

