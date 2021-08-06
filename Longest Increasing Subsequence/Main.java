import java.util.*;
class Main
{
  public static int LIS(int[] arr)
  {
    int omax = 0;
    int[] dp = new int[arr.length];
    for(int i = 0;i<dp.length;++i)
    {
      int max = 0;
      for(int j = 0;j<i;++j)
      {
        if(arr[i] > arr[j])
          if(dp[j] > max)
            max = dp[j];
      }
      dp[i] = max + 1;
      if(dp[i] > omax)
        omax = dp[i];
    }
    return omax;
  }
  public static void main(String args[])
  {
    //Try out your code here
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int[] arr = new int[n];
    for(int i = 0;i<n;++i)
    {
      arr[i] = in.nextInt();
    }
    System.out.println(LIS(arr));
  }
}