import java.util.*;
class Main
{
  public static ArrayList<Integer> sort(int[] arr)
  {
    ArrayList<Integer> even = new ArrayList<>();
    ArrayList<Integer> odd = new ArrayList<>();
    for(int i=0;i<arr.length;++i)
    {
      if(i%2 == 0)
        even.add(arr[i]);
      else
        odd.add(arr[i]);        
    }
    Collections.sort(even);
    Collections.sort(odd,Collections.reverseOrder());
    //ArrayList<Integer> res = new ArrayList<>();
    //res = even;
    for(int j = 0;j<odd.size();++j)
      even.add(odd.get(j));
    
    return even;
  }
  public static void main(String args[])
  {
    //Try out your code here
    Scanner in = new Scanner(System.in);
    int t = in.nextInt();
    for(int i=0;i<t;++i)
    {
      int n = in.nextInt();
      int[] arr = new int[n];
      for(int k = 0;k<n;++k)
      {
        arr[k] = in.nextInt();
      }
      for(int j: sort(arr))
        System.out.print(j+" ");
      System.out.println();
    }
  }
}