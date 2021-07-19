import java.util.Scanner;
class Main
{
  	public static int summ(int a)
    {
      	int Sum=0;
      for(int i=1;i<=a;++i)
      {
        Sum+=i;
      }
      return(Sum);
    }
	public static void main (String[] args)
    {
	  	Scanner n=new Scanner(System.in);
      	int x=n.nextInt();
      	System.out.println(summ(x));
	}
}