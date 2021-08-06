import java.util.*;
class Main
{
  public static boolean isprime(int n)
  {
    int cnt = 0;
    for(int i=1;i<n;++i)
    {
      if(n%i == 0)
        cnt++;
    }
    if(cnt>1)
      return false;
   	else
      return true;
  }
  public static int nearestprime(int n)
  {
    int ans,num = 0,num2 = 0;
    for(int i = n;i>0;i--)
    {
      if(isprime(i))
      {
        num = i;
        break;
      }
    }
    int cnt = n - num;
    for(int j = n;j<=(n+num);++j)
    {
      if(isprime(j))
      {
        num2 = j;
        break;
      }
    }
    int cnt2 = num2 - n;
    if(cnt == cnt2)
      ans = num;
    else
      ans = cnt2 > cnt?num:num2;
    
    return ans;
  }
  public static void main(String args[])
  {
    //Try out your code here
    	Scanner in = new Scanner(System.in);
    	int t = in.nextInt();
    	for(int i=0;i<t;++i)
        {
          int n = in.nextInt();
          System.out.println(nearestprime(n));
        }
  }
}