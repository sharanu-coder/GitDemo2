package programs;

import java.util.Arrays;

public class Sorting {

	public static void main(String[] args) {
		
		int a[]= {2,7,4,1,5,3};
		int temp=0;
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;		
				}
			}
			System.out.println(Arrays.toString(a));
			
		}
		
	}

}
