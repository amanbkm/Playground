import java.util.*;
class Main
{
  public static int sop(int n)
  {
    int[] dp = new int[n+1];
    dp[0] = 1;
    dp[1] = 2;
    for(int i=2;i<dp.length;++i)
    {
      dp[i] = dp[i-1] + dp[i-2];
    }
    
    return dp[n-1];
  }
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int N = in.nextInt();
    if(N > 30)
    {
      System.out.println("Invalid Input");
      System.exit(0);
    }
    System.out.println(sop(N));
  }
}