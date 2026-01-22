package com.Polymorphism;

public class DemoAbstract_DynDisp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e;
		
		RegEmp re=new RegEmp(1,"java",20000);
		CtrEmp ce=new CtrEmp(2,"spring");
		
		e=re;
		System.out.println("regular employee "+e.CalSal());
		e.showdata();
		e=ce;
		System.out.println("contract employee "+e.CalSal());
		e.showdata();
		
		

	}
}
	//parent abstract class with incomplete method(calsal())
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
		
		void showdata() {
			System.out.println("Student Data: "+empId+" name: "+empName);
		}

        //incomplete method
		abstract int CalSal();
	}
	
	//1st child class to implement override method and adding bsal in it
	class RegEmp extends Employee{
		int bsal;
		@Override
		int CalSal() {
			int pf=(int) (0.12f*bsal);
					return bsal-pf;
		   }
		public RegEmp() {
			super();
			// TODO Auto-generated constructor stub
		}
		public RegEmp(int empId, String empName ,int bsal) {
			super(empId, empName);
			this.bsal=bsal;
			// TODO Auto-generated constructor stub
		}
	
	}

        //2nd child class to calculate direct contract employee salary
		class CtrEmp extends Employee{
			@Override
			int CalSal() {
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
			
		
		
	
	


