import java.util.*;
class Main
{
  public static void main(String args[])
  {
  	Scanner in = new Scanner(System.in);
    int mint = in.nextInt();
    int n = in.nextInt();
    int[] dp = new int[n];
    dp[0] = mint;
    int sum = mint;
    for(int i=1;i<n;++i)
    {
      	dp[i] = sum - 1;
      	sum+=dp[i];
    }    
    System.out.println(sum);
    
  }
}