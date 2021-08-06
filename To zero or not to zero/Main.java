import java.util.*;
class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        //System.out.println("Enter Numbers: ");
        int m = sc.nextInt();
        int n = sc.nextInt();

        if(n < 10)
        {
            for(int i=m;i<=n;i++)
            System.out.print(i + " ");
        }
        else if(n>=100)
        {
            for(int i=m;i<=n;i++)
            System.out.printf("%03d ",i);
        }
        else if(n>=10)
        {
            for(int i=m;i<=n;i++)
            System.out.printf("%02d ",i);
        }

        sc.close();
    }
  }
