import java.util.*;


public class Q9_9 {
	private static int SIZE = 8;
	
	public static void placeQueens(int[] col, int index)
	{
		if (index == SIZE)
		{
			printQueens(col);
			return;
		}
		
		for (int i = 0; i < SIZE; i++)
		{
			col[index] = i;
			if (checkQueens(col, index))
			{
				placeQueens(col, index+1);
			}
		}
	}
	
	
	private static boolean checkQueens(int[] col, int i) {
		for (int j = 0; j < i; j++)
		{
			int diff = col[i] - col[j];
			if (diff == 0 || Math.abs(diff) == Math.abs(i-j))
				return false;
		}

		return true;
	}


	private static void printQueens(int[] col) {
		for (int i = 0; i < SIZE; i++)
		{
			for (int j = 0; j < SIZE; j++)
			{
				if (col[i] == j)
					System.out.print("O");
				else
					System.out.print("X");
			}
			System.out.println("");
		}
		System.out.println("");
	}


	public static void main(String[] args) {
		int[] col = new int[SIZE];
		placeQueens(col, 0);
	}

}
