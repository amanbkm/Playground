import java.util.*;
class Main
{
  public static int ones(int n)
  {
   
        int ans=0;
        while(n>0)
        {
        if(n%2==0)
        {
            n=n/2;
        }
        else
        {
            n=n-1;
            ans++;
        }
        }
   
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
      System.out.println(ones(n));
    }
  }
}