package solutions;
import java.util.HashMap;
/*
1) Create a program to get the hashmap from the given input string array where the key for the hashmap
is first three letters of array element in uppercase and the value of hashmap is the element itself
Input:{“goa”,”kerala”,”gujarat”} [string array]
Output:{{GOA,goa},{KER,kerala},{GUJ,Gujarat}} [hashmap]
*/

public class Que1 {
public static void main (String[] args) {
String name[] =	{"goa","kerala","gujarat"};
HashMap<String,String> map =new HashMap<>();
for(int i=0;i<name.length;i++)
{
	String key =name[i].substring(0,3).toUpperCase();
	map.put(key, name[i]);
}
System.out.println(map);
}
}
