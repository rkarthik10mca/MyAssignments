package week2.day2;

import java.util.Arrays;

public class FindMissingElement {
	
	public static void main(String[] args) {
		
		int a[]={1, 4,3,2,8, 6, 7};
		
		int len=a.length; //get size of array
		
		Arrays.sort(a);
		for(int i=0; i<len; i++)
		{
			if(a[i]==a[i+1])
			{
				System.out.println(a[i]);
			}
		}
		
		

	}

}
