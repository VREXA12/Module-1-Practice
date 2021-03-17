package solutions;

/*5) input1-- Hello*world
output-- boolean(true or false)
operation-- if the character before and after * are same return true else false
if there in no star in the string return false(Ignore case)
*/
public class Que5 {
	public static void main(String args[]) {
		Que5 example = new Que5();
		boolean a = example.check("dlrop*porld");
		System.out.println(a);
	}

	public Boolean check(String str) {
		if (!str.contains("*"))
		{
			return false;
		}
		int indexof = str.indexOf('*');
		int before = indexof - 1;
		int after = indexof + 1;
		char ch1 = str.charAt(before);
		char ch2 = str.charAt(after);
		if (ch1 == ch2)
			return true;
		else
			return false;
	}
}
/*
 * char arr[] = string.toCharArray(); int c = 0,size1=0,size2=0; int h=0;
 * for(char y : arr) { if(y=='*') h++; } if (h > 0) { for (char i : arr) { if (i
 * != '*') { c++; } if (c==0) { size1++; } else if(c==1) { size2++; } } int
 * notequal=0; int i=0; int j=size1+1;
 * 
 * while( i<size1 ) {
 * //System.out.println("arr1 ["+i+"] ="+arr[i]+" arr2 ["+j+"] ="+arr[j]);
 * 
 * if(arr[i]==arr[j]) continue; else notequal++;
 * 
 * i++; j++; }
 * 
 * if(notequal==0) System.out.print(true); else System.out.print(false); }
 * System.out.print(false); } }
 * 
 */