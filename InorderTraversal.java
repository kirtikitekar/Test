package com.home;

import java.util.Stack;

public class InorderTraversal {

    public static void traverseAndPrintTree(Node rootNode){
        Stack<Node> nodeStack = new Stack<Node>();
        if(rootNode == null)
            return;

        while(rootNode != null || !nodeStack.isEmpty()){
            if(rootNode!= null) {
                nodeStack.push(rootNode);
                rootNode = rootNode.left;
            } else {
                rootNode = nodeStack.pop();
                System.out.println(rootNode.data);
                rootNode = rootNode.right;
            }

        }
    }
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node (40);
        root.left.right = new Node (50);
        root.right.left = new Node(60);
        root.right.right = new Node(70);

        traverseAndPrintTree(root);
    }
}
