package day1;

import java.util.HashMap;

public class Occurance_of_letter 
{

	public static void main(String[] args) 
	{
		String s="akakash";
		HashMap<Character, Integer> hm=new HashMap<Character, Integer>();
		
		
		for(int i=0;i<=s.length()-1;i++)
		{
			System.out.println(hm);
			if(hm.containsKey(s.charAt(i)))
			{
				hm.put(s.charAt(i),hm.get(s.charAt(i))+1);
			}
			else
			{
				hm.put(s.charAt(i), 1);
			}
		}
		System.out.println(hm);

	}

}
