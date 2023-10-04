package univaltreecounter;

import org.example.binarytreeserializer.Node;
import org.example.univaltreecounter.UnivalTreeCounter;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UnivalTreeCounterTests {

    private UnivalTreeCounter univalTreeCounter = new UnivalTreeCounter();

    @Test
    public void shouldReturnValidCountOfUnivalTrees() {
        Node root = new Node(
                "0",
                new Node(
                        "1",
                        new Node(
                                "1",
                                new Node("1"),
                                new Node("1")),
                        new Node("0")),
                new Node("0"));

        int univalCount = 5;
        int countedTrees = univalTreeCounter.count(root);
        assertEquals(true, countedTrees == univalCount);
    }

    @Test
    public void shouldReturnValidCountOfUnivalTrees2() {
        Node root = new Node(
                "1",
                new Node(
                        "1",
                        new Node(
                                "1",
                                new Node("1"),
                                new Node("1")),
                        new Node("1")),
                new Node(
                        "1",
                        "null",
                        new Node("1")));

        int univalCount = 8;
        int countedTrees = univalTreeCounter.count(root);
        assertEquals(true, countedTrees == univalCount);
    }
}
