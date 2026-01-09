package com.collection;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class DemoSet2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<EmployeeData> s=new HashSet<>(); //o allowed duplicates
		EmployeeData ed1=new EmployeeData(101,"java");
		EmployeeData ed2=new EmployeeData(101,"java");
		EmployeeData ed3=ed2;
		EmployeeData ed4=new EmployeeData(104,"python");
		//checking for equality
		System.out.println("is ed1 equals ed2 "+ed1.equals(ed2));
		System.out.println("is ed2 equals ed3 "+ed2.equals(ed3));
		System.out.println("does ed2 and ed3 share same memory location "+(ed2==ed3));
		
		//getting the hash code for every object
		
		System.out.println("hash code of different objects");//comparison
		System.out.println(ed1.hashCode()+"  "+ed2.hashCode()+"   "+ed3.hashCode());//address for an object
		
		//adding emp objects to set
		s.add(ed1);
		s.add(ed2);
		s.add(ed3);
		s.add(ed4);
		System.out.println(s);

	}

}
class EmployeeData{
	int empId;
	String empName;
	public EmployeeData() {
		super();
		
		// TODO Auto-generated constructor stub
	}
	public EmployeeData(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}
	@Override
	public String toString() {
		return "EmployeeData [empId=" + empId + ", empName=" + empName + "]";
	}
	//override hashcode/equals method
	@Override
	public int hashCode() {
		//return Objects.hash(empId);
		return empId +3;             //it can be anything like empId*10;
	}
	@Override
	public boolean equals(Object obj) {         //Object-superclass  equals method signature
		//check for the right instance of the class
		//check whether the given id is already existing in the bucket
	
		
		if((obj instanceof EmployeeData) && ((EmployeeData)obj).empId == this.empId)  //instance of -check for employee object
        return true;
        else;
		    return false;
		
	  /*	if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeData other = (EmployeeData) obj;
		return empId == other.empId;*/
	}
}
	

