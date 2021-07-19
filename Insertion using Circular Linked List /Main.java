import java.util.*;
class Main
{
  public static void main(String args[])
  {
    	Scanner in = new Scanner(System.in);
    	LinkedList<Integer> a = new LinkedList<>();
    	int b = in.nextInt();
    	while(b>0)
        {
          if(b!=1)
            a.add(b);
          b=in.nextInt();
        }
    if(b==0)
    {
      for(int i=0;i<a.size();++i)
      {
        System.out.print(a.get(i)+" ");
      }
    }
  }
}