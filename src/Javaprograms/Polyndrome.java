package Javaprograms;

public class Polyndrome {

	public static void main(String[] args) {
		int n=565;
		int r,sum=0;
		int temp=n;
	while(n!=0) {
		
		r=n%10;
		sum=sum*10+r;
		n=n/10;
		
		
	}



	if(temp==sum)
	{
	System.out.println("polyndrome");	
	}
	else
	{
		System.out.println("not a polyndrome");
	}
}
}






