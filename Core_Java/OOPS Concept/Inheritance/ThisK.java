class ThisK
 {
  public static void main (String []args)
    {
    Example e1=new Example();
     e1.f1(34,45);
     e1.display();
     Example e2=new Example();
     Example1 e3=new Example1();
     e3.f3(7,8);
     }
 }



class Example
 {
   int x,y;
  void f1(int x,int y)
  {
   this.x=x;
   this.y=y;
    System.out.println(this.x);
   System.out.println(this.y);
    
  }
 void display()
  {
    int x=4,y=5;
   //System.out.println(this.x);
   //System.out.println(this.y);
}
}

class Example1 extends Example
 {
   void f3(int x,int y)
    {
      super.x=x;
      super.y=y;
     //  System.out.println(this.x);
   //System.out.println(this.y);
    }
}