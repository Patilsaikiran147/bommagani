package Javaprograms;

public class StringCharacterCount {

	public static void main(String[] args) {
		String s="tomatottt";
		char search='t';
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==search)
			count ++;	
		}
System.out.println("Character search:"+count);
	}

}
