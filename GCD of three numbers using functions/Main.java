import java.util.Scanner;
public class Main
{
	public static void main (String[] args)
	{
	    Scanner n=new Scanner(System.in);
      	int x=n.nextInt();
      	int y=n.nextInt();
      	int z=n.nextInt();
      	int a=hcf(x,y);
      	System.out.println(hcf(a,z));
	}
  	public static int hcf(int n1,int n2)
  {
      if (n2 != 0)
         return hcf(n2, n1 % n2);
      else 
         return n1;
  }
    
  
}