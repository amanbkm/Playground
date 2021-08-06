import java.util.*;
class Main
{
  public static int staircase(int n)
  {
    if(n == 0)
      return 0;
    if(n == 1 || n == 2)
      return n;
    else
      return staircase(n-1) + staircase(n-2);
  }
  public static void main(String args[])
  {
    //Try out your code here
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    System.out.println(staircase(n));
  }
}