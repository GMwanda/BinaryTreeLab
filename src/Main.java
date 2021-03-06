import javax.swing.tree.TreeNode;

public class Main {

    public static void main(String[] args) {
        BSTree example = new BSTree();
        /*Creating the binary tree*/
        example.insert(48);
        example.insert(31);
        example.insert(78);
        example.insert(20);
        example.insert(34);
        example.insert(78);
        example.insert(54);
        example.insert(92);
        /*PreOrder Traversal root-->left-->right*/
        System.out.println("PreOrder Traversal = ");
        example.reursivePreOrder(example.root);
        /*Inorder traversal left --> root-->right*/
        System.out.println("Inorder Traversal = ");
        example.inOrder(example.root);
        /*Postorder traversal left subtree--> right subtree-->node*/
        System.out.println("PostOrder Traversal = ");
        example.postOrder(example.root);
        /*Inserting values*/
        System.out.println("Insert = ");
        example.insert(example.root, 50);
        System.out.println("New PreOrder Traversal = ");
        example.reursivePreOrder(example.root);
        /*Finding maximum value*/
        System.out.println("Maximum value in the tree is " + example.findMax(example.root));
        System.out.println("Minimum value in the tree is " + example.findMin(example.root));
        /*Searching values*/
        int number = 50;
        if (example.search(number) != null) {
            System.out.println(number+" found.");
        } else {
            System.out.println(number+" not found.");
        }
    }
}