import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int val1 = 0 , val2 = 0;
    ArrayList<Integer> list = new ArrayList<>();
    list.add(val1);
    list.add(val2);
    for(int i=0;i<n;++i)
    {
      val1+=2;
      list.add(val1);
      val2+=1;
      list.add(val2);
    }
    
    System.out.println(list.get(n-1));
  }
}