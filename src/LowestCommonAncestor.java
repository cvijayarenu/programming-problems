/**
 * Given Two node value, get the lowest common ancestor. 
 * @author chandru
 *
 */
public class LowestCommonAncestor {

	public static void main(String[] args) {
		
		Treenode root = GetSampleTree();
		
		Treenode lca = Lowestcommonancestor(root, 2 , 3); //expected out 5
		System.out.println(lca.value);
		
		lca = Lowestcommonancestor(root, 5 , 6); //expected out 4
		System.out.println(lca.value);
		

	}

	private static Treenode Lowestcommonancestor(Treenode root, int i, int j) {
		if (root == null){
			return null;
		}
		if (root.value == i || root.value == j){
			return root;
		}
		Treenode left = Lowestcommonancestor(root.left, i, j);
		Treenode right = Lowestcommonancestor(root.right, i, j);
		
		if (left != null && right !=null){
			return root;
		} else if (left != null){
			return left;
		} else {
			return right;
		}
		
	}

	private static Treenode GetSampleTree() {
		return new Treenode(4, 
					new Treenode(5,
								new Treenode(2, 
										null,
										null),
								new Treenode(3,
										null, 
										null)),
					new Treenode(6, 
							null, 
							null));
		
	}


}

class Treenode{
	int value ;
	Treenode left;
	Treenode right;
	
	Treenode(int value, Treenode left, Treenode right){
		this.value = value;
		this.left = left;
		this.right = right;
	}
}
