import java.util.Scanner;
class Main{
	public static void main (String[] args)
    {
         Scanner n=new Scanner(System.in);
        int number=n.nextInt(); 
      	int fact=1;
      for(int i=1;i<=number;++i)
      {
        	fact*=i;
      }
      System.out.println(fact);
	}
}