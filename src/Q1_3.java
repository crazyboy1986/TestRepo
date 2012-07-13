
public class Q1_3 {
	
	public static void deUniqueChars(char[] chars)
	{
		int len = chars.length;
		int index = 0;
		int i;
		for (i = 1; i < len; i++)
		{
			boolean duplicated = false;
			for (int j = 0; j <= index; j++)
			{
				if (chars[j] == chars[i])
				{
					duplicated = true;
					break;
				}
			}
			
			if (!duplicated)
				chars[++index] = chars[i];
		}
		
		for (; ++index < len; i++)
			chars[index] = ' ';
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] words = {"abcaaabbbcccde", "abcde", "hello", "apple", "kite", "padle"};
		for (String word : words) {
			char[] chars = word.toCharArray();
			System.out.println(chars);
			deUniqueChars(chars);
			System.out.println(chars);
		}
	}

}
