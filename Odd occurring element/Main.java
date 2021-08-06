import java.util.*;
class Main
{
  public static int freq(int[] arr,int n)
  {
    int count = 0;
    for(int i=0;i<arr.length;++i)
    {
      if(arr[i] == n)
        count++;
    }
    return count;
  }
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int[] arr = new int[n];
    for(int i=0;i<n;++i)
    {
      arr[i] = in.nextInt();
    }
    for(int j = 0;j<n;++j)
    {
      if(freq(arr,arr[j])%2!=0)
      {
        System.out.println(arr[j]);
        break;
      }
    }
  }
}