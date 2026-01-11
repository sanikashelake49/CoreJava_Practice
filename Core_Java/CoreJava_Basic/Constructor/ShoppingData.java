//comment
public class ShoppingData {
	//properties
	   int custID;
	   String custName;
	   int bill_no;
	public ShoppingData() {// no-args constructor
		//super();
		// TODO Auto-generated constructor stub
	}
	public ShoppingData(int custID, String custName, int bill_no) {//parameterized constructor/overloaded constructor
		super();
		this.custID = custID;
		this.custName = custName;
		this.bill_no = bill_no;
	}
	   
	//constructor-default/overloaded
	   
	//methods
	void showCustData() {
		System.out.println("cust data is"+custID + "\t" + custName + "\t" + 
	        "\t" + bill_no);
	}
}
