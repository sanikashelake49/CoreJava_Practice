
public class DemoAbstract_DynDisp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e;
		RegEmp re=new RegEmp(1,"java",21000);
		CtrEmp ce=new CtrEmp(111,"spring");
		
		//using DMD-
		//get the salary for the reg employee
		//parent class reference variable pointing to child class object
		e = re;
		System.out.println("reg emp sal is"+e.calcSal());
		//getting the salary for the contract emp
		//now pointing to contract employee object 
		e=ce;
		System.out.println("contract emp sal is"+e.calcSal());

	}

}

//incomplete class given by project lead(PL)
abstract class Employee{
	int empId;
	String empName;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}
	
	//constructor
	

//method
  void showEmpData() {
	System.out.println("emp data is:" +empId+ "\t" +empName);
}
  abstract int calcSal();                             //method modified with keyword abstract 
}
class RegEmp extends Employee{
	int bsal;

	@Override
	int calcSal() {
		// TODO Auto-generated method stub
		int pf=(int)(0.12f*bsal);                    //
		return bsal-pf;
	}

	public RegEmp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RegEmp(int empId, String empName,int bsal) {
		super(empId, empName);
		this.bsal=bsal;
		// TODO Auto-generated constructor stub
	}
	
	
}
class CtrEmp extends Employee{

	@Override
	int calcSal() {
		// TODO Auto-generated method stub
		return 25000;
		
	}

	public CtrEmp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CtrEmp(int empId, String empName) {
		super(empId, empName);
		// TODO Auto-generated constructor stub
	}
	
}