
public class Q1_1 {
	
	public static boolean isUniqueChars(String str)
	{
		int result = 0;
		for (int i = 0; i < str.length(); i++)
		{
			int temp = str.charAt(i) - 'a';
			if ((result & (1 << temp)) > 0)
				return false;
			result |= 1 << temp;
		}
		
		return true;
	}
	
	public static boolean isUniqueChars2(String str)
	{
		boolean[] result = new boolean[256];
		for (int i = 0; i < str.length(); i++)
		{
			int temp = str.charAt(i);
			if (result[temp])
				return false;
			result[temp] = true;
		}
		return true;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] words = {"abcde", "hello", "apple", "kite", "padle"};
		for (String word : words) {
			System.out.println(word + ": " + isUniqueChars(word) + ", " + isUniqueChars2(word) );
		}
	}

}
