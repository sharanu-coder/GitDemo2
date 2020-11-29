package programs;

import java.util.Arrays;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		int a[][]= {{1,2,3},{4,5,6}};
        int b[][]= {{4,5,6},{7,8,9}};
        int sum[][]=new int[2][3];
        for(int i=0;i<a.length;i++)
        {
        	for(int j=0;j<b[0].length;j++)
        	{
        		sum[i][j]=a[i][j]+b[i][j];
        	}
        }
        
      System.out.println(Arrays.deepToString(sum));
        
	}

}
