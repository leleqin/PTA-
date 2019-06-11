package tree;

/**
 * 树节点
 * 
 * @author leleqin
 *
 */
public class TreeNode {

	// 结点的权
	int value;

	// 左儿子
	TreeNode lNode;

	// 右儿子
	TreeNode rNode;

	public TreeNode(int value) {
		this.value = value;
	}

	// 设置左儿子
	public void setlNode(TreeNode lNode) {
		this.lNode = lNode;
	}

	// 设置右儿子
	public void setrNode(TreeNode rNode) {
		this.rNode = rNode;
	}

	// 前序遍历
	public void fronShow() {
		// 先遍历当前节点
		System.out.println(value);
		// 左节点
		if (lNode != null) {
			lNode.fronShow();
		}
		// 右节点
		if (rNode != null) {
			rNode.fronShow();
		}
	}

	// 中序遍历
	public void midShow() {
		// 左子节点
		if (lNode != null) {
			lNode.midShow();
		}
		// 当前节点
		System.out.println(value);
		// 右子节点
		if (rNode != null) {
			rNode.midShow();
		}
	}

	// 后序遍历
	public void afterShow() {
		// 左节点
		if (lNode != null) {
			lNode.afterShow();
		}
		if (rNode != null) {
			rNode.afterShow();
		}
		System.out.println(value);
	}

	// 前序查找
	public TreeNode fronrSearch(int i) {
		TreeNode target = null;
		if (this.value == i) {
			return this;
		} else {
			if (lNode != null) {
				target = lNode.fronrSearch(i);
			}
			if (target != null) {
				return target;
			}
			if (rNode != null) {
				target = rNode.fronrSearch(i);
			}
		}
		return target;
	}

	// 删除节点
	public void del(int i) {
		TreeNode parent = this;
		// 判断左儿子
		if (parent.lNode != null && parent.lNode.value == i) {
			parent.lNode = null;
			return;
		}
		// 判断右儿子
		if (parent.lNode != null && parent.rNode.value == i) {
			parent.rNode = null;
			return;
		}

		//递归检查并删除左儿子
		parent = lNode;
		if(parent != null) {
			parent.del(i);
		}
		
		//递归检查并删除右儿子
		parent = rNode;
		if(parent != null) {
			parent.del(i);
		}
	}

}
