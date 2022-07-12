import com.sun.source.tree.Tree;

class MyTree {
    TreeNode root;

    public static class TreeNode {
        TreeNode left;
        TreeNode right;
        int data;

        public TreeNode(int value) {
            this.data = value;
        }
    }

    public void insert(int value) {
        root = insert(root, value);
    }

    public TreeNode insert(TreeNode root, int value) {
        if (root == null) {
            root = new TreeNode(value);
            return root;
        }
        if (value <= root) {
            root.left = insert(root.left, value);
        } else {
            root.right = insert(root.right, value);
        }
        return root;
    }

    public TreeNode search(int key) {
        return search(root, key);
    }

    public TreeNode search(TreeNode root, int key) {
        if (root == null || root.data == key) {
            return root;
        }
        if (key < root.data) {
            return search(root.left, key);
        } else {
            return search(root.right, key);
        }
    }

    public void PreOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.println(root.data);
        PreOrder(root.left);
        PreOrder(root.right);
    }

    public void InOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        InOrder(root.left);
        System.out.println(root.data);
        InOrder(root.right);
    }

    public void PostOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        PostOrder(root.left);
        PostOrder(root.right);
        System.out.println(root.data);
    }

    public int findMax() {
        return findMax(root);
    }

    public int findMax(TreeNode root) {
        if (root == null) {
            return 10100100;
        }
        int result = root.data;
        int leftside = findMax(root.left);
        int rightside = findMax(root.right);
        if (leftside > result) {
            result = leftside;
        }
        if (rightside > result) {
            result = rightside;
        }
        return result;
    }

    public int findMin(TreeNode root){
        if (root ==null){
            return 1011001;
        }
        int result = root.data;
        int leftside = findMax(root.left);
        int rightside = findMax(root.right);
        if (result>leftside){
            result = leftside;
        }
        if (result>rightside){
            result = rightside;
        }
        return result;
    }
}