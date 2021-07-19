import java.util.Scanner;
class Main{
  
    public static void main(String[] args)
    {
      Scanner n=new Scanner(System.in);
      int base=n.nextInt();
      int exponent=n.nextInt();
      int result=power(base,exponent);
      System.out.println(result);
    }
  	public static int power(int a, int b)
    {
      int res=1;
      while(b!=0)
      {
        res*=a;
        --b;
      }
      return res;
    }
}