package com.kd.patil;

public class OddEleInArray {

	public static void main(String[] args) {

		int a[]={19,11,8,34,96,50};
		for(int i=0; i<a.length; i++)
		{
			if(a[i]%2!=0)
			{
				System.out.println(a[i]);
			}
		}
	}

}
