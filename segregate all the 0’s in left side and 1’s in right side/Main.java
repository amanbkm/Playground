import java.util.*;
class Main
{
  public static void main(String args[])
  {
    //Try out your code here
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int[] arr = new int[n];
    for(int i=0;i<n;++i)
    {
      arr[i] = in.nextInt();
    }
    Arrays.sort(arr);
    for(int val : arr)
    {
      System.out.print(val);
    }
  }
}