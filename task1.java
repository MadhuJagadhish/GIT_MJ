import java.util.*;                  // Anagram  
public class task1{
	static String remove(String s)
	{
		String t = "";
		for (int i=0; i<s.length(); i++)
		{
			if(s.charAt(i)>=65&&s.charAt(i)<=90 ||s.charAt(i)>=97&&s.charAt(i)<=122)
			{
				t = t + s.charAt(i);
			}
		}
		return t;
	}
	
	static String convert(String s)
	{
		String t ="";
		for(int i=0; i<s.length(); i++)
		{
			if(s.charAt(i)>=65 && s.charAt(i)<=90)
			{
				t = t + (char)(s.charAt(i)+32);
			}
			else
			{
				t = t + s.charAt(i);
			}
		}
		return t;
	}
	
	
	static String sort(String s)
	{
		char ar[] = s.toCharArray();
		for (int i=0; i<s.length()-1; i++)
		{
			for (int j=i+1; j<s.length(); j++)
			{
				if( ar[i] > ar[j])
				{
				  char t = ar[i];
				  ar[i] = ar[j];
				  ar[j] = t;
				   
				}
			}
		}
		String t ="";
		for(int i=0; i<s.length();i++)
		{
			t = t + ar[i];
		}
		return t;
	}
	
	
	static boolean compare(String s1, String s2)
	{
			if(s1.length() != s2.length())
			{
				return false;
			}
			for(int i=0; i<s1.length(); i++)
			{
				if(s1.charAt(i)!=s2.charAt(i))
				{
					return false;
				}
				
			}
		return true;
		
	}
	
	
	
	

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String s1");
		String s1 = scan.nextLine();
		System.out.println("Enter a String s2");
		String s2 = scan.nextLine();
		s1 = remove(s1);
		s2 = remove(s2);
		
		System.out.println(s1 + "   removed numbers and special chars");
		System.out.println(s2 + "   removed numbers and special chars");
		
		s1 = convert(s1);
		s2 = convert(s2);
		
		System.out.println(s1 + "   converted to lowercase");
		System.out.println(s2 + "   converted to lowercase");
		
		s1 = sort(s1);
		s2 = sort(s2);
		
		System.out.println(s1 + "   sorted");
		System.out.println(s2 + "   sorted");
		
		boolean x=compare(s1,s2);
		if(x==true)
		{
			System.out.println("ANAGRAM");
		}
		else
		{
			System.out.println("NOT ANAGRAM");	
		}
		

	}

}
