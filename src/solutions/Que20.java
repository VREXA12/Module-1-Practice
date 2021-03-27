package solutions;
/*20) String[] input1=["Vikas","Lokesh",Ashok]
expected output String: "Vikas,Lokesh,Ashok"
*/
public class Que20 {
	public static void main(String args[]) {
		Que20 code =new Que20();
		String[] arr={"Vikas","Lokesh","Ashok"};
		String ans=code.attach(arr);
		System.out.print(ans);
		
	}
	public String attach(String[] arr)
	{
		String res=new String();
		for(int i=0;i<arr.length;i++)
		{
		res=res.concat(arr[i]);
		if(i!=arr.length-1)
			res=res.concat(",");
		}
		return res;	
	}

}
