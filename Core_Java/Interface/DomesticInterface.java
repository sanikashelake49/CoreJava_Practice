package com.demo.electric;

//whatever we declared under interface must be a constant

public interface DomesticInterface {         //compiler is providing abstra
	
	//constant

	int MIN_CHGS=30;                     //constant -must be in uppercase/and value must be assigned while declaring constant
	final float Z_50_UC=0.60f;
	public static final float F1_100_UC=0.9f;  //automatically came
	float GT_100_UC=1.3f;
    int calcBill(int noUnits); //abstract method 
	

}
