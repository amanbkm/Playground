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
    	System.out.println("Enter the nth node:");
    	int n = in.nextInt();
    	if(n>a.size())
          System.out.println("There is no nth node in the list");
    	else
        {
          int c = (a.size()-n);
          System.out.println(a.get(c)+""+" is the nth node element in the list" );
        }
  }
}