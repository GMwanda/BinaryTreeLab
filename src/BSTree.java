import java.util.Stack;

class BSTree {
    TreeNode root;

    private static class TreeNode {
        private TreeNode left;
        private TreeNode right;
        private int data;

        public TreeNode(int mydata) {
            this.data = mydata;
        }
    }
    public TreeNode getLeft() {
        return root.left;
    }

    /* Function to get right node */
    public TreeNode getRight() {
        return root.right;
    }

    /* Function to set data to node */
    public void setData(int d) {
        root.data = d;
    }

    /* Function to get data from node */
    public int getData() {
        return root.data;
    }

    /*Putting in values*/
    public void insert(int value) {
        root = insert(root, value);
    }

    /*Insert in Binary search tree*/
    public TreeNode insert(TreeNode root, int value) {
        if (root == null) {
            root = new TreeNode(value);
            return root;
        }
        if (value <= root.data) {
            root.left = insert(root.left, value);
        } else {
            root.right = insert(root.right, value);
        }
        return root;
    }


    /*Recursive PreOrder Traversal*/
    public void reursivePreOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.println(root.data);
        reursivePreOrder(root.left);
        reursivePreOrder(root.right);
    }

    /*Iterative PreOrder Traversal*/
    public void iterativePreOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode temp = stack.pop();
            System.out.println(temp.data);
            if (temp.right != null) {
                stack.push(temp.right);
            }
            if (temp.left != null) {
                stack.push(temp.left);
            }
        }
    }

    /*InOrder Traversal*/
    public void inOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.println(root.data);
        inOrder(root.right);
    }

    /*PostOrder Traversal*/
    public void postOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.data);
    }

    /*Finding maximum value*/
    public int findMax() {
        return findMax(root);
    }

    public int findMax(TreeNode root) {
        if (root == null) {
            return Integer.MIN_VALUE;
        }
        int result = root.data;
        int left = findMax(root.left);
        int right = findMax(root.right);
        if (left > result) {
            result = left;
        }
        if (right > result) {
            result = right;
        }
        return result;
    }

    public int findMin(){
        return findMin(root);
    }

    public int findMin(TreeNode root){
        if (root==null){
            return 101001010;
        }
        int result = root.data;
        int leftData = findMin(root.left);
        int rightData = findMin(root.right);
        if (result>leftData){
            result = leftData;
        }
        if (result>rightData){
            result = rightData;
        }
        return result;
    }

    /*Searching a particular key*/
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
    /*Deleting a node*/

}