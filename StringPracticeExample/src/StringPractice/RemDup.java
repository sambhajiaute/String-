package StringPractice;

import java.util.HashSet;
import java.util.Set;

public class RemDup {

	public static void main(String[] args) {
		String str="poojaaa";
		int cnt=0;
		HashSet<Character> s = new HashSet<>();
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<str.length();i++) {
			if(!s.contains(str.charAt(i))) {
			s.add(str.charAt(i));
			}else {
				sb.append(str.charAt(i));
			}
		}

		for(Character us:s){
			System.out.print(us);
		}
		System.out.println("   duplicate charaters are "+ sb);
	}

}
