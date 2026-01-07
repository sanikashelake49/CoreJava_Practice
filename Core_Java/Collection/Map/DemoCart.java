package com.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class DemoCart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//defining the map-adding items to the map
		Map<Integer,ItemDescription> itemDesc=new HashMap<>();
		itemDesc.put(1, new ItemDescription("apple",35.5f));
		itemDesc.put(2, new ItemDescription("orange",25.45f));
		
		//adding items to the cart
		Map<Integer,Integer> cart =new HashMap<>();
		cart.put(1, 10);
		cart.put(2, 20);
		
		//check out
		Chkout chk_out =new Chkout();
		System.out.println("total amount to be paid "+chk_out.pay(itemDesc, cart));


	}
}
class Chkout{
	 
	int pay(Map<Integer,ItemDescription> item_desc,Map<Integer,Integer> cart) {
		
		int tot_cost=0;
		//getting all the entries from the cart 
		//iterating every cart object to the unit cost and multiply with quty
        for(Map.Entry<Integer,Integer>crt :cart.entrySet()) {     //entryset-return all the key and value to another map collection
        	//get the value from the crt and finally based on the key----  //map.entry-it refer to the line which treated as one object
        	
        	ItemDescription item=item_desc.get(crt.getKey());
        	//getting the unit cost and the value
        	tot_cost+=item.unit_cost*crt.getValue();
        }		
		return  tot_cost;
	}
} 


class ItemDescription{
	String item_name;
	float unit_cost;
	public ItemDescription() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ItemDescription(String item_name, float unit_cost) {
		super();
		this.item_name = item_name;
		this.unit_cost = unit_cost;
	}
	@Override
	public String toString() {
		return "ItemDescription [item_name=" + item_name + ", unit_cost=" + unit_cost + "]";
	}
	
}
