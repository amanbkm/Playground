import java.util.Scanner;
class Main { 
	public static void main(String[] args)
    {
  		Scanner in = new Scanner(System.in);
      	int x=in.nextInt();
      	int m=1;
      	for(int i=1;i<=x;++i)
        {
          	for(int j=0;j<i;++j)
            {   
              if(m%2!=0)
                System.out.print("*");
              else 
                System.out.print("#"); 
                               		
                  m++;
            }
          	System.out.print("\n");
        }
          
  		
    }
}