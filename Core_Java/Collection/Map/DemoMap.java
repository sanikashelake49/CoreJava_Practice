package com.collection;

import java.util.HashMap;

public class DemoMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Map<Integer,String>  m;                                       //key-Integer(class which should be unique
         HashMap<Integer,String> hm=new HashMap<>();                         //value-class
	  //add some objects
         hm.put(91, "India");
         hm.put(911, "USA");
         hm.put(65, "Singapore");
         hm.put(91, "INDIA");                           //it will not delete "India" but update "INDIA"
         //list out all the objects
         System.out.println(hm);
        //retrieve an object for a specific id
         System.out.println(hm.get(91));
         System.out.println("get all the keys"+hm.keySet());
         

}
}