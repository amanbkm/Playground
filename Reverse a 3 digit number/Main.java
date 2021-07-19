import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
    Scanner n=new Scanner(System.in);
    int x=n.nextInt();
    int a=x/100;
    x=x-a*100;
    int b=x/10;
    int c=x%10;
    System.out.println(c*100+b*10+a);
  }
}