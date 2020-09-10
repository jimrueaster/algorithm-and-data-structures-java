package xyz.jekd.onedirectionlinkedlist;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OneDirectionLinkedListTest {

    @Test
    public void testAdd() {
        OneDirectionNode node1 = new OneDirectionNode("aa", null);
        OneDirectionNode node2 = new OneDirectionNode("bb", null);
        OneDirectionLinkedList ll = new OneDirectionLinkedList();
        ll.add(node1);
        ll.add(node2);

        assertEquals(Arrays.asList("aa", "bb"), ll.toList());
        assertEquals(2, ll.getSize());
    }
}
