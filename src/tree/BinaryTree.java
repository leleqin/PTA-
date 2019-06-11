package tree;

/**
 * 二叉树：任何一个节点的子节点数量不超过2 二叉树的子节点分左节点和右节点
 * 
 * 满二叉树：所有叶子节点都在最后一层，而且节点的总数为2^n-1。n是树的高度
 * 完全二叉树：所有叶子节点都在最后一层或倒数第二层，且最后一层的叶子节点在左边连续，倒数第二层的叶子节点在右边连续
 * 
 * @author leleqin
 *
 */
public class BinaryTree {

	TreeNode root;

	public TreeNode getRoot() {
		return root;
	}

	public void setRoot(TreeNode root) {
		this.root = root;
	}

	// 前序遍历
	public void fronShow() {
		if (root != null) {
			root.fronShow();
		}
	}

	// 中序遍历
	public void midShow() {
		if (root != null) {
			root.midShow();
		}
	}

	// 后序遍历
	public void afterShow() {
		if (root != null) {
			root.afterShow();
		}
	}

	// 前序查找
	public TreeNode frontSearch(int i) {
		return root.fronrSearch(i);
	}

	// 删除节点
	public void del(int i) {
		if (root.value == i) {
			root = null;
		} else {
			root.del(i);
		}
	}

}
