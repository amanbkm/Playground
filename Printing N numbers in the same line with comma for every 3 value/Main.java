import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    	Scanner n=new Scanner(System.in);
    	int x=n.nextInt();
    	int m=1;
    	for(int i=1;i<=x;++i)
        {		
          		System.out.print(i);
          		if(m%3==0)
                {
                  	System.out.print(",");
          			m=0;
                }
          		m++;
          		
          		
        }
   
  }
}