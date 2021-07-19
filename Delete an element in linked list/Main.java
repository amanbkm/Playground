import java.util.Scanner;
import java.util.*;
class Main
{
  public static void main(String args[])
  {
    	Scanner in=new Scanner(System.in);
    	LinkedList<Integer> a = new LinkedList<>();
    	int b = in.nextInt();
    	while(b>0)
        {
          a.add(b);
          b = in.nextInt();
        }
    	a.remove(0);
    	for(int i=0;i<a.size();++i)
        {
          System.out.println(a.get(i));
        }
  }
}