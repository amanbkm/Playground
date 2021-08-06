import java.util.*;
import java.io.*;
class Main
{
  static boolean isPrime(int n)
{
// Corner case
if (n <= 1)
    return false;
 
// Check from 2 to n-1
for (int i = 2; i < n; i++)
    if (n % i == 0)
        return false;
 
return true;
}
 
// Function to print primes
static void printPrime(int n)
{
for (int i = 2; i <= n; i++)
{
    if (isPrime(i))
        System.out.print(i + " ");
}
}
 
// Driver Code
public static void main(String[] args)
{
    Scanner in =new Scanner(System.in);
  	int n = in.nextInt();
    printPrime(n);
}
  }
