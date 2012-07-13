import java.util.*;


public class Q9_5 {
	
	public static ArrayList<String> getPermut(String str)
	{
		ArrayList<String> result = new ArrayList<String>();
		
		if (str.length() == 0)
		{
			result.add("");
			return result;
		}
		
		char ch = str.charAt(0);
		ArrayList<String> lastResult = getPermut(str.substring(1));
		for (String word : lastResult)
		{
			for (int i = 0; i <= word.length(); i++)
			{
				String s = insertCharAt(word, ch, i);
				result.add(s);
			}
		}
		
		return result;
	}
	
	public static String insertCharAt(String word, char c, int i) {
		String start = word.substring(0, i);
		String end = word.substring(i);
		return start + c + end;
	}
	
	public static void main(String[] args) {
		ArrayList<String> list = getPermut("abc");
		System.out.println("There are " + list.size() + " permutations.");
		for (String s : list) {
			System.out.println(s);
		}
	}

}
