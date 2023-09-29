package org.example.binarytreeserializer;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * Given the root to a binary tree, implement serialize(root), which serializes the tree into a string, and deserialize(s), which deserializes the string back into the tree.
 *
 * For example, given the following Node class
 *
 * class Node:
 *     def __init__(self, val, left=None, right=None):
 *         self.val = val
 *         self.left = left
 *         self.right = right
 *
 * The following test should pass:
 *
 * node = Node('root', Node('left', Node('left.left')), Node('right'))
 * assert deserialize(serialize(node)).left.left.val == 'left.left'
 */
public class BinaryTreeSerializer {

    public String serialize(Node root) {
        List<NodeIdPair> nodesToList = new LinkedList<>();

        int id = 0;

        NodeIdPair currentElement = new NodeIdPair(root, id);
        nodesToList.add(currentElement);

        StringBuilder outputString = new StringBuilder("");

        while(nodesToList.isEmpty() == false) {
            currentElement = nodesToList.get(0);
            id = currentElement.id;
            outputString.append(currentElement.id +"."+ currentElement.node.getVal()+ " ");
            if (currentElement.node.left != null) {
                nodesToList.add(new NodeIdPair(currentElement.node.left, 2*id + 1));
            }
            if (currentElement.node.right != null) {
                nodesToList.add(new NodeIdPair(currentElement.node.right, 2*id+2));
            }
            nodesToList.remove(0);
        }

        if (outputString.charAt(outputString.length()-1) == ' ') {
            outputString = new StringBuilder(outputString.substring(0, outputString.length() - 1));
        }
        return outputString.toString();
    }

    public Node deserialization(String input) {
        String[] nodesStringArray = input.split(" ");

        Map<Integer, Node> nodesMap = new HashMap<>();

        List<Integer> stack = new LinkedList<>();

        for (String element : nodesStringArray
        ) {
            NodeIdPair tempNodeIdPair = extractNumberFromString(element);
            nodesMap.put(tempNodeIdPair.id, tempNodeIdPair.node);
            stack.add(tempNodeIdPair.id);
        }
        Node currentNode;
        int id;
        Node root  = nodesMap.get(0);

        while (stack.isEmpty() == false) {
            id = stack.get(0);
            currentNode = nodesMap.get(stack.get(0));
            stack.remove(0);
            if (nodesMap.containsKey(2*id+1)) {
                currentNode.left = nodesMap.get(2*id+1);
            }
            if (nodesMap.containsKey(2*id+2)) {
                currentNode.right = nodesMap.get(2*id+2);
            }
        }

        return root;
    }




    public NodeIdPair extractNumberFromString(String input) {

        int leftIndex = 0;
        int rightIndex = 0;
        for (int i = 0 ; i < input.length() ; i++) {
            if (input.charAt(i) >= 48 && input.charAt(i) <= 57) {
                if (leftIndex == 0) {
                    leftIndex = i;
                }
                else {
                    rightIndex = i;
                }
            }
        }
        return new NodeIdPair(new Node(input.substring(rightIndex+2, input.length())), Integer.parseInt(input.substring(leftIndex, rightIndex + 1)) );
    }
}
