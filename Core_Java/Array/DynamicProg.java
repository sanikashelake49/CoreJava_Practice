import java.util.*;

public class DynamicProg{

    // Fibonacci Recursion Code
    //static int fib(int n) {

        //if (n <= 1)
        //    return n;

      //  return fib(n - 1) + fib(n - 2);
    //}


    // Fibonacci DP Code - Memoization
  //  static int fibDP(int n, int[] f) {

    //    if (n <= 1)
      //      return n;

        //if (f[n] != -1) {
          //  return f[n];
        //}

        //return f[n] = fibDP(n - 1, f) + fibDP(n - 2, f);
    //}

//Fibonacci DP code - Tabulation

static int fibTabDP(int n){
int []dp=new int[n+1];
dp[0]=0;
dp[1]=1;
 
for (int i=2;i<=n;i++){
dp[i]=dp[i-1]+dp[i-2];
}
 return dp[n];
}

    public static void main(String[] args) {

        int n = 6;

        //int[] f = new int[n + 1];

       // Arrays.fill(f, -1);

        //System.out.println(fibDP(n, f));

System.out.println(fibTabDP(n));
    }
}