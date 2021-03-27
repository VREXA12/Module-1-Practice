package solutions;
import java.util.HashSet;
/*16) Check whether a given string is palindrome also check whether it has atleast 2 different vowels
input: "madam"
output: false(no 2 diff vowels)
*/
import java.util.Set;
public class Que16 {
	public static void main(String args[])
	{
		Que16 code = new Que16();
		String ans=code.getans("meadaem");
		System.out.print(ans);
	}
public String getans(String str)
{
String ans="True";
int i=0,j=str.length()-1;

while(i<j)
{if(str.charAt(i)!=str.charAt(j))
	ans="false (Not palindrome)";
i++;
j--;}
Set<String> vowel=new HashSet<>();
for(i=0;i<str.length();i++){
	char t=str.charAt(i);
	if(t=='a'||t=='e'||t=='i'||t=='o'||t=='u')
	{
		vowel.add(Character.toString(t));
	}
}
if(vowel.size()<2)
	ans="False (No 2 different vowels)";

return ans;
}
}
