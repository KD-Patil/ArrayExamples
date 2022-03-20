package com.kd.patil;

import java.util.Scanner;

public class UserInputArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size : ");
		int k=sc.nextInt();
		int a[]=new int[k];
		System.out.println("Enter "+k+" array elements : ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Entered array elements : ");
		for(int i=0; i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}

}
