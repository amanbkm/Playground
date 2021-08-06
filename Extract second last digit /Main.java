import java.util.Scanner;
class Main {
	public static void main (String[] args) 
    {
		Scanner n=new Scanner(System.in);
      int x=n.nextInt();
      int second = (x / 10) % 10;
    	System.out.println(second);
    }
}