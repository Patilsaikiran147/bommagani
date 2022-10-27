package Javaprograms;

public class StringReverse {

	public static void main(String[] args) {
	String s="rajitha is a girl";
	String r=" ";
	String[] split = s.split(" ");
	for(int i=split.length-1;i>=0;i--)
	{
		r=r+" "+ split[i];
	}
	System.out.println(" "+r);

	}

}
