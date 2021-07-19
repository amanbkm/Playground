
import java.util.Stack;
import java.util.Scanner;
public class Main 
{
	static boolean checkRedundancy(String s) {
		
		Stack<Character> st = new Stack<>();
		char[] str = s.toCharArray();
		
		for (char ch : str) {

			
			if (ch == ')') {
				char top = st.peek();
				st.pop();

				
				
				boolean flag = true;

				while (top != '(') {
					if (top == '+' || top == '-'
							|| top == '*' || top == '/') 
                    {
						flag = false;
					}
					top = st.peek();
					st.pop();
				}
				if (flag == true) {
					return true;
				}
			} else {
				st.push(ch); 
			}			 
		}
		return false;
	}

// Function to check redundant brackets
	static void findRedundant(String str) {
		boolean ans = checkRedundancy(str);
		if (ans == true) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

	public static void main(String[] args) 
    {
      Scanner in = new Scanner(System.in);
      
		String str = in.nextLine();
		findRedundant(str);

	}
}
