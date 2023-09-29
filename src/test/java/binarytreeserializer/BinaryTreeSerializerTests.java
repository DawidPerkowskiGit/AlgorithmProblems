package binarytreeserializer;

import org.example.binarytreeserializer.BinaryTreeSerializer;
import org.example.binarytreeserializer.Node;
import org.junit.Test;

import static org.junit.Assert.*;
public class BinaryTreeSerializerTests {

    BinaryTreeSerializer binaryTreeSerializer = new BinaryTreeSerializer();

    @Test
    public void shouldReturnValidSerializedText() {
        Node node = new Node("root",new Node("left",new Node("left.left", new Node("left.left.left"), ""), ""),new Node("right"));

        String serialized = "0.root 1.left 2.right 3.left.left 7.left.left.left";

        assertEquals(true, binaryTreeSerializer.serialize(node).equals(serialized));
    }

    @Test
    public void shouldReturnDeserializedNodes() {
        String serialized = "0.root 1.left 2.right 3.left.left 7.left.left.left";

        Node deserializedNode = binaryTreeSerializer.deserialization(serialized);

        assertEquals(true, deserializedNode.left.left.left.val.equals("left.left.left"));
    }

    @Test
    public void shouldReturnTrueSerializationDeserialization() {
        Node node = new Node("root",new Node("left",new Node("left.left"), ""),new Node("right"));

        assertEquals(true, binaryTreeSerializer.deserialization(binaryTreeSerializer.serialize(node)).left.left.val.equals("left.left"));

    }
}
