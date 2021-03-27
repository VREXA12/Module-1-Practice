package solutions;
/*13) Retrieve the palindorme-true number set from given number limit and return the sum
input1:90 input2:120
logic:99+101+111
output:311
*/
public class Que13 {
public static void main(String args[])
{
	Que13 code = new Que13();
	System.out.print(code.givesum(90,120));
	     
}
public int givesum(int n1,int n2)
{int sum=0;
	for(int i=n1;i<n2;i++)
	{
      if(checkpalindrome(i))
    	  sum=sum+i;
		
	}
return sum;
}
public boolean checkpalindrome(int n)
{
	int temp =n ;
	int rev=0;
	while(temp!=0)
	{
		int digit=temp%10;
		temp=temp/10;
		rev=rev*10+digit;
	}
	if (rev==n)
	return true;
	else 
   	return false;
}
}
