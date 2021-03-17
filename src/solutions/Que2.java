package solutions;

import java.util.HashMap;
import java.util.*;
/*
2) I/P hashmap<String String>{"ram:hari","cisco:barfi","honeywell:cs","cts:hari"};
i/p 2="hari";
o/p string[]={"ram","cts"};
*/

public class Que2 {
	public static void main (String[] args) {
		HashMap<String,String> name = new HashMap<>();
		name.put("ram","hari");
		name.put("cisco","barfi");
		name.put("honeywell","cs");
		name.put("cts","hari");
		
		
		for(Map.Entry<String,String>arr:name.entrySet())
		{if(arr.getValue()=="hari")
			System.out.println(arr.getKey()+" ");
		}
		
		
	}

}
