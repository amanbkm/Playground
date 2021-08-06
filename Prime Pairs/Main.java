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
    if(count > 1)
      return false;
    else
      return true;
  }
  public static void main(String args[])
  {
    //Try out your code here
    Scanner in = new Scanner(System.in);
    int a = in.nextInt();
    int b = in.nextInt();
    ArrayList<Integer> list = new ArrayList<>();
    for(int i=a;i<=b;++i)
    {
      if(isprime(i))
      {
        list.add(i);
      }
    }
    Collections.sort(list);
    //System.out.println(list);
    int cnt = 0;
    for(int j=0;j<list.size();++j)
    {
      for(int k=j+1;k<list.size();++k)
      {
        if(Math.abs(list.get(j) - list.get(k)) == 6)
        {
          cnt++;
          //System.out.println(list.get(j) + " "+list.get(k));
        }
      }
    }
    if(cnt == 0)
      System.out.println("No Prime Pairs");
    else
      System.out.println(cnt);
  }
}