import java.util.*;
class Main
{
  public static int fact(int n)
  {
    int[] dp = new int[n+1];
    dp[0] = 1;
    for(int i=1;i<dp.length;++i)
    {
      dp[i] *= dp[i-1];
    }
    return dp[n];
  }
  public static int largestprime(int n, int p)
  {
     int ans = 0;
 
        // Calculate x = n/p + n/(p^2) + n/(p^3) + ....
        while (n > 0)
        {
            n /= p;
            ans += n;
        }
        return ans;
  }
  public static void main(String args[])
  {
   
    Scanner in = new Scanner(System.in);
    int t = in.nextInt();
    for(int i=0;i<t;++i)
    {
      int n = in.nextInt();
      int p = in.nextInt();
      System.out.println(largestprime(n,p));
    }
  }
}