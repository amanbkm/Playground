import java.util.*;
class Main
{
  public static int Handshakes(int n)
  {
    if(n == 1 || n == 0)
      return 0;
    else
      return (n*(n-1)/2); 
  }
  public static void main(String args[])
  {
    //Try out your code here
    Scanner in = new Scanner(System.in);
    int t = in.nextInt();
    for(int i=0;i<t;++i)
    {
      int n = in.nextInt();
      System.out.println(Handshakes(n));
    }
  }
}