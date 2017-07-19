import java.util.*;

public class NikiBotAssignment {
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++) {
        long n = sc.nextLong();
        System.out.println(getfibb(n+2));
        }
    }
    
    static long getfibb(long n) {
    long A[][] = new long[][]{{1,1},{1,0}};
    if (n == 0)
        return 0;
    power(A, n-1);
   
    return A[0][0];
    }
    
     static void multiply(long A[][], long B[][])
    {
         int mod = (int)1e9+7;
        
    long x =  A[0][0]*B[0][0] + A[0][1]*B[1][0];
    long y =  A[0][0]*B[0][1] + A[0][1]*B[1][1];
    long z =  A[1][0]*B[0][0] + A[1][1]*B[1][0];
    long w =  A[1][0]*B[0][1] + A[1][1]*B[1][1];
     
   
    
    A[0][0] = x%mod;
    A[0][1] = y%mod;
    A[1][0] = z%mod;
    A[1][1] = w%mod;
    }
    
    static void power(long A[][], long n) {
    if( n == 0 || n == 1)
      return;
    long B[][] = new long[][]{{1,1},{1,0}};
      
    power(A, n/2);
    multiply(A, A);
      
    if (n%2 != 0)
       multiply(A, B);
    }
  
}
   