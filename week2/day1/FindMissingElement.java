package week2.day1;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		
		int a[]= {1,4,3,2,8, 6, 7}; 
		
		Arrays.sort(a);
		int sum=0;
		
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		
		System.out.println(sum);
		
		int sum1=0;
		
		for(int i=1;i<=8;i++)
			
			
		{
			sum1=sum1+i;
		}
		System.out.println(sum1);
		System.out.println(sum1-sum);

	}

}
