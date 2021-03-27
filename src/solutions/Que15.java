package solutions;
/*15) A integer input is accepted. find the square of individual digits and find their sum.
input:125
output:1*1+2*2+5*5

*/
public class Que15 {
public static void main(String args[])
{
Que15 code=new Que15();	
int num=125;
int ans=code.findans(num);
System.out.print(ans);
}
public int findans(int num) {
	int temp=num;
	int sum=0;
	while(temp>0)
	{
		int digit = temp%10;
		temp=temp/10;
		int digitsquare=digit*digit;
		sum+=digitsquare;
	}
	return sum;
}
}
