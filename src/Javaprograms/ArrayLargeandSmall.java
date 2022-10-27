package Javaprograms;

public class ArrayLargeandSmall {

	public static void main(String[] args) {
		int a[]= {10,67,45,23,54,90};
		int temp=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
			}
//System.out.println(a[i]);
	}
System.out.println(a[3]);
}
	}

