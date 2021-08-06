import java.util.*;
import java.io.*;
class Main
{
  public static void main(String args[])
  {
    //Try out your code here
    Scanner in =new Scanner(System.in);
    int n = in.nextInt();
    int count = 0;
    for(int i=1;i<n;++i)
    {
      if(n%i==0)
        count++;
    }
    if(count>1)
      System.out.println("Given number is not a prime number");
    else
      System.out.println("Given number is a prime number");
  }
}