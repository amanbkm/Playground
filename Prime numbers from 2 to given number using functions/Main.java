import java.util.Scanner;
class Main{
	public static void main (String[] args)
    {
	    Scanner n=new Scanner(System.in);
      	int x=n.nextInt();
      	for(int j=2;j<=x;++j)
        {
          prime(j);
        }
	}
  	public static void prime(int a)
    {
      int count=0;
      for(int i=1;i<=a;i++)
      {
        if(a%i==0)
          ++count;
        else
          count=count+0;
      }
      if(count==2)
      	System.out.println(a);
    }
}