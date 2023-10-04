package org.example.univaltreecounter;

import org.example.binarytreeserializer.Node;

public class UnivalTreeCounter {
    public int count(Node root) {
        int count = 0;

        if (root == null) {
            return 0;
        }

        if (root.val == null) {
            return 1;
        }

        if (root.left == null && root.right == null) {
            return 1;
        }

        if (root.left == null) {
            if (root.val.equals(root.right.val)) {
                count++;
            }
        }

        if (root.right == null) {
            if (root.val.equals(root.left.val)) {
                count++;
            }
        }

        if (root.left != null && root.right != null) {
            if (root.val.equals(root.left.val) && root.val.equals(root.right.val)) {
                count++;
            }
        }

        if (root.left != null) {
            count+=count(root.left);
        }

        if (root.right != null) {
            count+=count(root.right);
        }

        return count;
    }


}
