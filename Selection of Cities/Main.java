import java.util.*;
class Main
{
  public static int cities(int n)
  {
    if(n == 1)
      return 1;
   	else
      return (int)Math.pow(2,n) - 1;
  }
  public static void main(String args[])
  {
    //Try out your code here
    Scanner in = new Scanner(System.in);
    int t = in.nextInt();
    for(int i=0;i<t;++i)
    {
      int n = in.nextInt();
      System.out.println(cities(n));
    }
  }
}