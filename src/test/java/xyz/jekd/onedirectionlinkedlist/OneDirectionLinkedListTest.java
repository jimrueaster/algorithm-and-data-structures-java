package xyz.jekd.onedirectionlinkedlist;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OneDirectionLinkedListTest {

    @Test
    public void testTraverseOneDirectionLinkedList() {

        OneDirectionNode head = OneDirectionLinkedList.generateLinkedList();

        List<String> linkedList = OneDirectionLinkedList.traverseOneDirectionLinkedList(head);

        assertEquals(Arrays.asList("aa", "bb", "cc"), linkedList);
    }
}
