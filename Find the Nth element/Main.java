import java.util.*;
class Main
{
  public static void main(String args[])
  {
    //Try out your code here
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    LinkedList<Integer> list = new LinkedList<>();
    for(int i=0;i<n;++i)
    {
      list.add(in.nextInt());
    }
    int N = in.nextInt();
    if(N > list.size())
      	System.out.println("No node found");
    else
    	System.out.print(list.get(N-1));
  }
}