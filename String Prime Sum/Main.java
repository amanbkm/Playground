import java.util.*;
class Main
{
  public static boolean isprime(int n)
  {
    int count = 0;
    for(int i=1;i<n;++i)
    {
      if(n%i == 0)
        count++;
    }
    if(count>1)
      return false;
   	else
      return true;
  }
  public static void main(String args[])
  {
    //Try out your code here
    Scanner in = new Scanner(System.in);
    int sum = 0;
    try
    {
      String str = in.next();
      int n = Integer.parseInt(str);
      for(int i=2;i<n;++i)
      {
        if(isprime(i))
        {
          sum+=i;
        }
      }
      System.out.println(sum);
    }
    
    catch(Exception e)
    {
      System.out.println("0");
    }
  }
}