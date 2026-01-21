//program with drawbacks
public class CollegeMIS {//parent class
	//properties
	int stdId;
	String stdName;
	//constructor
	public CollegeMIS() {
		super();
		//    TODO Auto-generated constructor stub
	}
	public CollegeMIS(int stdId,String stdName) {
		super(); 
		this.stdId = stdId;
		this.stdName = stdName;
	}
	void disp()
	{
		System.out.println("Student data is" +stdId + "\t" + stdName);
	}
}


//child class
class Stud_Mks extends CollegeMIS{//now the compiler understand that CollegeMIS is the Parent class
	String[] sub;
	
	


	public Stud_Mks(int stdId,String stdName,String[] sub) {
	//	int a;     does not work because super will be first in constructor
	super(stdId,stdName);
	this.sub = sub;
}

 //method overriding
void4 disp() {
	int a;  // aloows here because super could be place anywhere
	super.disp();;
	//displaying the subjects name
	for(int i=0;i<sub.length;i++)
		System.out.println(sub[i]);
}