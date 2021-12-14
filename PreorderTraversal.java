package com.home;

import java.util.Stack;

public class PreorderTraversal
{

    public static void preorderTraverseAndPrintTree(Node root)
    {
        Node current = root;
        Stack<Node> stack = new Stack<Node>();
        if(current == null)
        {
            return;
        }
        stack.push(current);

        while(stack.isEmpty() == false)
        {
            current = stack.pop();
            System.out.println(current.data);

            if(current.right != null)
            {
                stack.push(current.right);
            }
            if(current.left != null)
            {
                stack.push(current.left);
            }
        }
    }
    public static void main(String[] args)
    {
        Node root = new Node(25);
        root.left = new Node(15);
        root.right = new Node(50);
        root.left.left = new Node (10);
        root.left.right = new Node (22);
        root.right.left = new Node(35);
        root.right.right = new Node(70);
        root.left.left.left = new Node (4);
        root.left.left.right = new Node (12);
        root.left.right.left = new Node (18);
        root.left.right.right = new Node (24);
        root.right.left.left = new Node(31);
        root.right.left.right = new Node(44);
        root.right.right.left = new Node(66);
        root.right.right.right = new Node(90);


        preorderTraverseAndPrintTree(root);
    }
}
