package com.runtime;

public class DemoRTE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//declaring a variable to hold a length of args
		
		try {
		int len=args.length;
		
         
		System.out.println("result of div"+(10/len));
		System.out.println("division done");
		}
		
		catch(ArithmeticException ae) {
			System.out.println("how can you divide a no by 0");
			ae.printStackTrace();              //throwable
		}
		try {
		
		
		int[] a= {10,20,30};
		
		System.out.println(a[4]);
		
		System.out.println(args[2]);
		
		System.out.println("all good");
		}
		
		catch(ArrayIndexOutOfBoundsException aiobe) {
			aiobe.printStackTrace();
		}
		try {
		
		
		
		A obj=null;
		obj.disp();
		}
		catch(NullPointerException npe) {
			npe.printStackTrace();
		}
		finally {     
		
		System.out.println("finally,at the end of the program");

	}


	}

}

class A{
	void disp()
{
		System.out.println("Inside class A");
		}
}
