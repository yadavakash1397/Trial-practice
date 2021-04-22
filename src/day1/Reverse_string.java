package day1;

public class Reverse_string
{

	public static void main(String[] args) 
	{
		String s="akash";
		String rev="";
		String rev2=new StringBuffer(s).reverse().toString(); 
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
		System.out.println(rev2);
	}

}
