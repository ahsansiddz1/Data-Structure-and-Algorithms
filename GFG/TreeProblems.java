import java.util.LinkedList;
import java.util.Queue;
//1. Simple Tree Formation
//2. Pre Order
//3. InOrder
//4. Post Order
//5. LevelOrder
//6. Total No of Nodes
//7. Sum of nodes
//8. Height Of a tree
//9. Diameter Of tree by  O(n)^2 and O(n) time Complexity..
//10. SubTree Of another tree.
public class TreeProblems {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {
        static int idx = -1;

        public static Node buildTree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }

        static void preOrder(Node root) {
            if (root == null)
                return;
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }

        static void inOrder(Node root) {
            if (root == null)
                return;
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }

        static void postOrder(Node root) {
            if (root == null)
                return;
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");
        }

        public static void levelOrder(Node root) {
            //===============================================
//     |      Working of LevelOrder                          ||
//     |       Queue -- > 1 null 2 3 null 4 5                ||
//     |                                                     ||
//     |     Printing                                        ||
//     |           -- 1                                      ||
//     |           --2 3                                     ||
//     |           --4 5                                     ||
            //===============================================
            if (root == null)
                return;

            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);

            while (!q.isEmpty()) {
                Node currNode = q.remove();
                if (currNode == null) {
                    System.out.println();
                    if (q.isEmpty()) {
                        break;
                    } else {
                        q.add(null);
                    }
                } else {
                    System.out.print(currNode.data + " ");
                    if (currNode.left != null)
                        q.add(currNode.left);
                    if (currNode.right != null)
                        q.add(currNode.right);

                }
            }//while Loop
        }//LevelOrder Function

        //Counting Of Nodes
        public static int countNodes(Node root) {
            if (root == null)
                return 0;
            int leftNodes = countNodes(root.left);
            int rightNodes = countNodes(root.right);
            return leftNodes + rightNodes + 1;

        }

        //Sum Of Nodes
        public static int sumOfNodes(Node root) {
            if (root == null)
                return 0;
            int leftSum = sumOfNodes(root.left);
            int rightSum = sumOfNodes(root.right);
            return leftSum + rightSum + root.data;

        }

        //Height of tree
        public static int height(Node root) {
            if (root == null)
                return 0;
            int leftHeight = height(root.left);
            int rightHeight = height(root.right);

            int myHeight = Math.max(leftHeight, rightHeight) + 1;

            return myHeight;
        }

        //Diameter of a tree
        //Time Complexity = O(n)^2

        public static int diameter(Node root) {
            if (root == null)
                return 0;
            int diam1 = diameter(root.left);
            int diam2 = diameter(root.right);
            int diam3 = height(root.left) + height(root.right) + 1;

            return Math.max(diam3, Math.max(diam1, diam2));

        }

        //Diameter of a tree
        //Time Complexity = O(n)

        public static class TreeInfo {
            int ht;
            int diam;

            TreeInfo(int ht, int diam) {
                this.ht = ht;
                this.diam = diam;
            }
        }

        public static TreeInfo diameter2(Node root) {
            if (root == null)
                return new TreeInfo(0, 0);

            TreeInfo left = diameter2(root.left);
            TreeInfo right = diameter2(root.right);

            int myHeight = Math.max(left.ht, right.ht) + 1;

            int diam1 = left.diam;
            int diam2 = right.diam;
            int diam3 = left.ht + right.ht + 1;

            int mydiam = Math.max(diam3, Math.max(diam1, diam2));

            TreeInfo myInfo = new TreeInfo(myHeight, mydiam);
            return myInfo;
        }

        // Sum of All Nodes at Kth level.

        public static int sumOfKthLevelNodes(Node root, int k) {
            //===============================================
//     |      Working of LevelOrder                          ||
//     |       Queue -- > 1 null 2 3 null 4 5                ||
//     |                                                     ||
//     |     Printing                                        ||
//     |           -- 1                                      ||
//     |           --2 3                                     ||
//     |           --4 5                                     ||
            //===============================================
            if (root == null)
                return -1;

            Queue<Node> q = new LinkedList<>();
            int currLevel = 1;
            int sum = 0;
            boolean levelFound = false;
            q.add(root);
            q.add(null);

            while (!q.isEmpty()) {
                Node currNode = q.remove();
                if (currNode == null) {
                    currLevel++;
                    if (levelFound)
                    {
                        return sum;
                    }
                    if (q.isEmpty()) {
                        break;
                    } else {
                        q.add(null);
                    }



                } else {
                    if (currLevel == k) {
                         levelFound = true;
                        sum += currNode.data;

                    }
                    if (currNode.left != null)
                        q.add(currNode.left);
                    if (currNode.right != null)
                        q.add(currNode.right);


                }

            }//while Loop
            return -1;
        }//LevelOrder Function

       
    }


    public static void main(String args[]) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();
//Formation of simple Tree
        Node root = tree.buildTree(nodes);
        System.out.println(root.data);
//PreOrder
        System.out.print("Pre order : ");
        tree.preOrder(root);
        System.out.println();
//In order
        System.out.print("In order : ");
        tree.inOrder(root);
        System.out.println();
//Post order
        System.out.print("Post order : ");
        tree.postOrder(root);
        System.out.println();
//Level order
        System.out.println("Level order : ");
        tree.levelOrder(root);

     //Counting of Nodes
        System.out.println("Total Nodes : "    + tree.countNodes(root));
     //Sum of Nodes
        System.out.println("Sum of Nodes : "   + tree.sumOfNodes(root));
     //Height Of tree
        System.out.println("Height of tree : " + tree.height(root));
     //Diameter of tree -- O(n)^2
        System.out.println("Diameter  (Time Complexity: O(n)^2) : " + tree.diameter(root));
     //Diameter of tree -- O(n)
        System.out.println("Diameter (Time Complexity: O(n)) : "    + tree.diameter2(root).diam);
     //Sum of Kth Level of Nodes
        System.out.println("Sum of Nodes at kth level : " + tree.sumOfKthLevelNodes(root,3));

    }
}

//10. SubTree Of another tree.
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
//class Solution {
//
//    public boolean isIdentical(TreeNode root, TreeNode subRoot)
//    {
//        if(root==null && subRoot==null)
//            return true;
//        if(root==null || subRoot==null)
//            return false;
//
//        if(root.val==subRoot.val)
//        {
//            return isIdentical(root.left,subRoot.left) && isIdentical(root.right,subRoot.right);
//        }
//
//        return false;
//
//    }
//    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
//        if(subRoot==null)
//            return true;
//        if(root==null)
//            return false;
//
//        if(root.val==subRoot.val)
//        {
//            if(isIdentical(root,subRoot))
//                return true;
//
//        }
//        return isSubtree(root.left,subRoot) || isSubtree(root.right,subRoot);
//
//    }
//}