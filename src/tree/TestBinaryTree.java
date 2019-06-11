package tree;

public class TestBinaryTree {

	public static void main(String[] args) {
		//创建一个二叉树
		BinaryTree bt = new BinaryTree();
		//创建一个根节点
		TreeNode root = new TreeNode(1);
		//把根节点赋给树
		bt.setRoot(root);
		//创建两个节点
		TreeNode rootL = new TreeNode(2);
		TreeNode rootR = new TreeNode(3);
		//把新创建的节点设置为根节点的子节点
		root.setlNode(rootL);
		root.setrNode(rootR);
		
		//第二层的子节点创建
		rootL.setlNode(new TreeNode(4));
		rootL.setrNode(new TreeNode(5));
		
		rootR.setlNode(new TreeNode(6));
		rootR.setrNode(new TreeNode(7));
		
		//遍历这棵树
		//前序遍历
		System.out.println("---------遍历---------");
		bt.fronShow();
		System.out.println("------------------");
		//中序遍历
		bt.midShow();
		System.out.println("------------------");
		//后序遍历
		bt.afterShow();
		
		System.out.println("-----查找-----------");
		//前序查找
		TreeNode result = bt.frontSearch(5);
		System.out.println(result);
		//删除节点
		System.out.println("-----删除-----------");
		bt.del(4);
		bt.fronShow();
		
	}

}
