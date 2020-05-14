import java.util.Scanner;
class Main{
	public static void main (String[] args)
    {
	    Scanner n=new Scanner(System.in);
        int num=n.nextInt(); 
     int originalNumber, remainder, result = 0;
        originalNumber = num;
      int sum=0;
        while (originalNumber != 0)
        {
            remainder = originalNumber % 10;
            int fact=1;
            for(int i=1;i<=remainder;++i)
            {
                  fact*=i;
              		
            }
          	sum+=fact;
            originalNumber /= 10;
        }
      if(sum==num)
        System.out.println("Yes");
      else
        System.out.println("No");
      
	}
}