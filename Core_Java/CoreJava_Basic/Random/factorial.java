public class factorial{
public static void main(String args[]){
factorial1 fact=new factorial1();
//fact.factorial(5);
System.out.println(fact.factorial(5));

}}

class factorial1{
int factorial(int n){
if(n==0){
return 1;
}
 return n * factorial(n-1);
}
}