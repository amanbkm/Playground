import java.util.*;
class Main
{
  public static int unique(int a,int b)
  {
    int count = 0;
    for(int i=a;i<=b;++i)
    {
      if(i%11 == 0)
        count++;
    }
    return (b-a-count+1);
  }
  public static void main(String args[])
  {
    //Try out your code here
    Scanner in = new Scanner(System.in);
    int a = in.nextInt();
    int b = in.nextInt();
    if(unique(a,b) == 0)
      System.out.println("No Unique Number");
    else
      System.out.println(unique(a,b));
  }
}