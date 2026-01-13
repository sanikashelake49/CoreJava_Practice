class Nokia1
 {
     int x,y;
void f1(int p,int q)
 {
 x=p;
y=q;
    System.out.println("parent function 1 executed");
  }
void f2()
{
     System.out.println("parent function 2 executed");
 }
}
class Nokia2 extends Nokia1
{
  int z;
void f3()
{
  System.out.println("child function 1 executed");
 }
Nokia2()
{
 super(6,7);
 System.out.println("child constructor executes");
}

}
class Nokia3 extends Nokia1
{
}

class Inherit
 {
  public static void main(String[]args)
   {
      //Nokia1 n2=new Nokia1(); 
      //System.out.println(n2.x);
       //we can also create an object of parent class but does not inherit child properties
  //    n2.f1();
//n2.f2();
//n2.f3();
    Nokia2 n1=new Nokia2();     //but if we create an object of a child then we can inherit properties of parent also
 	n1.f1();
	n1.f2();
	n1.f3();
}
  }