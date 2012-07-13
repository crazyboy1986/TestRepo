import java.util.*;


public class Q9_6 {
	
	public static void printParenthesis(char[] str, int left, int right, int index)
	{
		if (left == 0 && right == 0)
			System.out.println(str);
		
		if (left > 0)
		{
			str[index] = '(';
			printParenthesis(str, left-1, right, index+1);
		}
		
		if (right > left)
		{
			str[index] = ')';
			printParenthesis(str, left, right-1, index+1);
		}
	}
	
	
	public static void main(String[] args) {
		int len = 3;
		char[] str = new char[2*len];
		printParenthesis(str, len, len, 0);
	}

}
