import java.util.Scanner;

public class ArraySwapping{
public static void main(String args[]){

Scanner sc=new Scanner(System.in);
System.out.println("enter no.of element");
int n=sc.nextInt();
System.out.println("enter the " +n+ "elements");


int arr[]=new int[n];

for(int i=0;i<arr.length;i++){
arr[i]=sc.nextInt();
}

for(int i=0,j=arr.length-1;i<j;i++,j--){
int temp=arr[i];
arr[i]=arr[j];
arr[j]=temp;
}

for(int swap:arr){
System.out.println("Swapped elements"+swap);
}


}}