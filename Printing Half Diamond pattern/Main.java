import java.util.Scanner;
class Main {
	public static void main (String[] args)
    {
	      Scanner x=new Scanner(System.in);
            int n=x.nextInt();
         int rows = n, k = 0;

        for(int i = 1; i <= rows; ++i, k = 0) {
            for(int space = 1; space <= rows - i; ++space) {
                System.out.print(" ");
            }

            while(k != 2 * i - 1) {
                System.out.print("*");
                ++k;
            }

            System.out.println();
        }
          
	}
}