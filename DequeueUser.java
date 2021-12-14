package com.home;

import java.util.Deque;
import java.util.LinkedList;

public class DequeueUser {
    public static void traverseLevelOrderAndPrintTree(Node root)
    {
        Deque<Node> dq = new LinkedList<Node>();
        Node current = root;
        if(current != null)
        {
            System.out.println(current.data);
            dq.add(current);
        }
        else
            return;

        //Toggle to front and last whenever NULL is received from Deque.
        while(dq.size() != 0)
        {
            //if(current != NULL)
            {
                current = dq.getFirst();
            }
            //if(current == NULL)
            {
                current = dq.getLast();
            }
            System.out.println(current.data);
            if(current.left != null)
            {
                dq.add(current.left);
            }
            if(current.right != null)
            {
                dq.add(current.right);
            }
           // dq.add(NULL);
        }
    }
    public static void main(String[] args)
    {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node (40);
        root.left.right = new Node (50);
        root.right.left = new Node(60);
        root.right.right = new Node(70);

        traverseLevelOrderAndPrintTree(root);
    }
}
