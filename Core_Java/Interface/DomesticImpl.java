package com.demo.electric.domestic_impl;

import com.demo.electric.DomesticInterface;

public class DomesticImpl implements DomesticInterface {
	int custId;
	String name;
	

	public DomesticImpl(int custId, String name) {
		super();
		this.custId = custId;
		this.name = name;
	}

	public DomesticImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public int calcBill(int noUnits) {  //method must be public whenever we an override in a class
		int totCost=0;
		// TODO Auto-generated method stub
		if(noUnits>=0 && noUnits<=50)
			totCost+=calc_0_50(noUnits);
		else if(noUnits>=51 && noUnits<=100)
			totCost+=calc_51_100(noUnits);
		else
			totCost+=calc_gt_100(noUnits);
		
		return totCost;
		
	}

	int calc_0_50(int units) {
		int sub=0;
		sub+=units * Z_50_UC;
		return sub;
		
		
	}
	int calc_51_100(int units){
		int sub=0;
		sub+=calc_0_50(50);
		int temp=units - 50;
		sub+=temp*F1_100_UC;
		return sub;
		
	}
	int calc_gt_100(int units) {
		int sub=0;
		sub+=calc_51_100(100);
		int temp=units-100;
		sub+=temp*GT_100_UC;
		return sub;
	}
}
