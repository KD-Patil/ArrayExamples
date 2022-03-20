package com.kd.patil;

//sort array (Bubble Sort)
//highest ele or any(like 2nd highest)in array
//lowest ele in array

public class ArraySortEx {

	public static void main(String[] args) {

		int a[]={19,8,34,96,50};
		int temp;
		for(int i=0; i<a.length;i++)
		{
			for(int j=i+1; j<a.length;j++)
			{
				if(a[i]>=a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
		for(int i : a)
		{
			System.out.println(i);
		}
		
		int max=a[a.length-1];
		System.out.println("MAX number : "+max);
		int small=a[0];
		System.out.println("Smallest number : "+small);
		int max2=a[a.length-2];
		System.out.println("Second MAX number : "+max2);
		
		System.out.println("Third ele in array after sort : "+a[2]);
	}

}
