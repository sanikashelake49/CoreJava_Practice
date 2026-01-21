package com.array;

import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//simple array print if we know its size
		int arr[]= {1,2,3,4,5,6};
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
			//i++;
		}
		System.out.println("the success");
		//reverse array print
		for(int i=5;i>=0;i--)
		{
			System.out.println(arr[i]);
		}
		System.out.println("the success");
		//when we do not know the actual array
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		System.out.println("the success");
		//reverse array when we don't know the index
		for(int i=arr.length-1;i>=0;i--) {
			System.out.println(arr[i]);
		}
		//taking input from console and create there array
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
		int size=sc.nextInt();
	    //declare the array variable,taking size from console
		int arr1[]=new int[size];
	    System.out.println("enter a input");
	    for(int i=0;i<size;i++)
	    {
	    	arr1[i]=sc.nextInt();
	    	
	    }
	   // int n=0;
	    System.out.println("given array is");
	    for(int i=0;i<size;i++) {
	    	
	     System.out.println(arr1[i]);
	   }
      }    
	}
