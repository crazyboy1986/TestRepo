
public class MyTreeNode {
	MyTreeNode left;
	MyTreeNode right;
	MyTreeNode parent;
	int data;
	
	MyTreeNode (int d)
	{
		data = d;
	}
	
	public void setLeftChild(MyTreeNode _left)
	{
		left = _left;
		if (_left != null)
		{
			_left.parent = this;
		}
	}
	
	public void setRightChild(MyTreeNode _right)
	{
		right = _right;
		if (_right != null)
		{
			_right.parent = this;
		}
	}
	
	private static MyTreeNode createMinimalBST(int arr[], int start, int end){
		if (end < start)
			return null;
		
		int mid = (start + end)/2;
		MyTreeNode n = new MyTreeNode(arr[mid]);
		n.setLeftChild(createMinimalBST(arr, start, mid-1));
		n.setRightChild(createMinimalBST(arr, mid+1, end));
		return n;
	}
	
	public static MyTreeNode createMinimalBST(int arr[])
	{
		return createMinimalBST(arr, 0, arr.length-1);
	}
	
	public static void main(String[] args) {
		// Create balanced tree
		int[] array = {0, 1, 2, 3, 5, 6, 7, 8, 9, 10};
		MyTreeNode root = MyTreeNode.createMinimalBST(array);
	}
}
