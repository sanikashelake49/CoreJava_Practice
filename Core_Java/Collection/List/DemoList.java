package com.collection;

import java.util.ArrayList;

public class DemoList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//List l=new ArrayList();
		ArrayList<StudentData> al=new ArrayList<>();   //generic
		//add couple of objects
		//StudentData sd1=new StudentData(1,"java",99,100);
		//System.out.println(sd1);
		
		
		
		//al.add(sd1);
		al.add(new StudentData(1,"java",99,100));
		al.add(new StudentData(2,"java",99,100));
		al.add(new StudentData(2,"Spring",100,100));
		al.add(new StudentData(3,"web",99,89));
		al.add(new StudentData(4,"sb",60,50));
		al.add(null);
		System.out.println(al);
		//an ideal practice
		//read every object and get the tot mks and display the student prop
		for(StudentData s:al) {
			//get the student profile
			s.showStudentData();
			s.getTotMks();
			System.out.println("tot mks is "+s.getTotMks());
		}

	
		
		//int a=10;
		//a1.add(a);
		//Integer in=new Integer(25);
		//a1.add(1);         //auto boxing Integer
		//a1.add(1);
		/*al.add(1);
		al.add(2);
		//a1.add(4.5f);
		al.add(3);
		//check the size of the collection
		System.out.println("collection size "+al.size());
		//search for a given object
		System.out.println("is java there " +al.contains("java"));
		System.out.println("is java there "+al.contains("JAVA"));
		System.out.println("is available "+al.contains(3));
		al.add(3,56);
		//list out all the objects
		//System.out.println("list of all objects"+al);
		//efficient way of listing objects-allows manipulation
		for(Integer s:al)//known as for each object-advanced for loop
			
			System.out.println(s);*/
		
		

	}

}
class StudentData{
	int std_id;
	String std_name;
	int mks_csc;
	int mks_mm;
	//cons
	public StudentData() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StudentData(int std_id, String std_name, int mks_csc, int mks_mm) {
		super();
		this.std_id = std_id;
		this.std_name = std_name;
		this.mks_csc = mks_csc;
		this.mks_mm = mks_mm;
	}
	void showStudentData() {
		System.out.println("stud data is "
				+ ""+std_id+" "+std_name);
	}
	int getTotMks() {
		return (mks_csc+mks_mm);
	}
	@Override
	public String toString() {
		return "StudentData [std_id=" + std_id + ", std_name=" + std_name + ", mks_csc=" + mks_csc + ", mks_mm="
				+ mks_mm + "]";
	}
	
}
