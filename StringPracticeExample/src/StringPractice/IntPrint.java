package StringPractice;

public class IntPrint {

	public static void main(String[] args) {
		
		String s="W1e2l3c4o5m6e";
		int sum=0;
		String  s1="";
		String s2="";
	
        for (int i=0; i<s.length();i++)
        {
        	if (Character.isDigit(s.charAt(i)))
        		{
        		 s1=s1+s.charAt(i);	
        		 Integer sum1=Integer.parseInt(null, s.charAt(i));
        		 sum=sum1+s.charAt(i);
        	}
        	
        	else if(true)
        	{	s2=s2+ s.charAt(i);
        	 
        	}
        }
        System.out.println((s2));
        System.out.println(s1);
        System.out.println(sum);
        
	}

}
