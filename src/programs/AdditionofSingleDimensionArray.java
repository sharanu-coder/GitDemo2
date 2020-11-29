package programs;

import java.util.Arrays;

public class AdditionofSingleDimensionArray {

	public static void main(String[] args) {
		int a[]= {10,20,30,40,50};
		int b[]= {1,2,3,4,5};
		int sum[]=new int[5];
		for(int i=0;i<a.length;i++)
		{
			sum[i]=a[i]+b[i];
		}
		System.out.println(Arrays.toString(sum));
	}

}
