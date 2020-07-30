
public class PalindromeWOrd {
	
	static boolean IsPalindrome(String s)
	{
		int l=s.length();
		String rev="";
		for(int i=l-1; i>=0; i--)
		{
			rev=rev+s.charAt(i);
		}
		if(rev.equals(s))
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
	String str="mom and dad";
	String[]ch=str.split(" ");
	int count=0;
	
	for(int i=0;i<ch.length;i++) {
		
		if(IsPalindrome(ch[i])) {
			count++;
		}
		
	}
	
	System.out.println("count of palindrome string "+ str+ " is "+ count);
	}

}
