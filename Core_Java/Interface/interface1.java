interface i1
{
  int x=6;
 void f1();                          //public abstract function:no body
static void f2()                     //java8 feature:declare function AS static
 {
 
System.out.println(x);
}


}

interface i2 extends i1
 {
   int x=9;
   int y=2;
static void f2()                    
 {
 
System.out.println(x);
}


void f3();


}

class c1 implements i2,i1
{
public void f1()
 {
  
}
public void f3()
{

}

}



class interface1
 {
  public static void main(String[]args)
   { 
    // i1.f2();                                     //static member can be called by class name
    c1 c=new c1();
     System.out.println(c.x);
     System.out.println(c.y);
  
    i2.f2();                                    //static memeber doesn't inheri

  }
}