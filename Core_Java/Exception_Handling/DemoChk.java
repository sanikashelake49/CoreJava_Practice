package com.exception;

public class DemoChk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplyForLicense al=new ApplyForLicense(111,"java");
		try {
			al.applyForLicense(12);
			System.out.println("sth....");
		} catch (AgeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("eligible to apply after"+(18 - e .getAge())+"yrs");
		}

		
	}

}

//writing a custom exception class 
class AgeException extends Exception{  //superclass-exception
	int age;

	public AgeException(int age) {
		super();
		this.age = age;
	}
    int getAge() {
	return age;
}
}

class ApplyForLicense{             //
	int per_id;
	String name;
	public ApplyForLicense(int per_id, String name) {
		super();
		this.per_id = per_id;
		this.name = name;
	}
	//custom method to check the eligibility of the candidate
	void applyForLicense(int age) throws AgeException{//here compiler check for try catch block
		if (age<16) {
			AgeException ae=new AgeException(age);
			throw ae;                                               //after throw it will go out of the try block
			//System.out.println("hii");                           //code could not be written here
			
			//alternatively,the above can be written as
			//throw new AgeException(age);
		}
		else
			System.out.println("candidate is applicable");
	}
}
