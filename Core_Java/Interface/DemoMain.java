package com.demo.main;

import com.demo.electric.DomesticInterface;
import com.demo.electric.domestic_impl.DomesticImpl;

public class DemoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create an object for the impl class
		DomesticInterface cust;           //reference variable =cust for interface
		
		//using DMD
		//DomesticInterface cust=new DomesticImpl(111,"java");     polymorphism i think
		cust=new DomesticImpl(111,"java");
		//get the bill for the customer
		int bill=cust.calcBill(170);
		System.out.println("total bill to be paid "+bill);
		

	}

}
