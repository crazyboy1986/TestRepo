import java.util.HashMap;


public class MyTrieNode {
	private HashMap<Character, MyTrieNode> children = new HashMap<Character, MyTrieNode>();
	private char ch;
	private boolean terminated;
	
	public void setTerminated(boolean terminated) {
		this.terminated = terminated;
	}

	MyTrieNode(char _ch)
	{
		ch = _ch;
		terminated = false;
	}
	
	public void addString(String str)
	{
		char ch = str.charAt(0);
		MyTrieNode child = null;
		if (children.containsKey(ch))
		{
			child = children.get(ch);
		}
		else
		{
			child = new MyTrieNode(ch);
			children.put(ch, child);
		}
		
		if (str.length() > 1)
		{
			child.addString(str.substring(1));
		}
		else
		{
			setTerminated(true);
		}
	}
}
