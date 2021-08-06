import java.util.*;
class Main
{
  public static void main(String args[])
  {
    	Scanner in = new Scanner(System.in);
    	LinkedList<Integer> a= new LinkedList<>();
    	int b=in.nextInt();
    	while(b>0)
        {
          a.add(b);
          b=in.nextInt();
        }
    	int c = a.size()-2;
    	if(a.size()<2)
          System.out.print("Deletion of second last element is not possible");
    	else
        {
          a.remove(c);
        for(int i=0;i<a.size();++i)
        {      
            System.out.print(a.get(i)+" ");
        }
        }
    	
  }
}