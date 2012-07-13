import java.util.*;

public class Q9_8 {
	private static int SIZE = 8;

	public static int makeChanges(int total, int coin) {
		int nextCoin = 0;
		switch (coin) {
		case 25:
			nextCoin = 10;
			break;
		case 10:
			nextCoin = 5;
			break;
		case 5:
			nextCoin = 1;
			break;
		case 1:
			return 1;
		}
		
		int ways = 0;
		for (int i = 0; i*coin <= total; i++)
		{
			ways += makeChanges(total - i*coin, nextCoin);
		}
		
		return ways;
	}

	public static void main(String[] args) {
		int ways = makeChanges(10, 25);
	}

}
