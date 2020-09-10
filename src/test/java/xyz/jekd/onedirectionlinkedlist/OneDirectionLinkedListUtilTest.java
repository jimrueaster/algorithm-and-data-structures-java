package xyz.jekd.onedirectionlinkedlist;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OneDirectionLinkedListUtilTest {

    @Test
    public void testTraverseOneDirectionLinkedList() {

        OneDirectionNode head = OneDirectionLinkedListUtils.generateLinkedList();

        List<String> linkedList = OneDirectionLinkedListUtils.traverseOneDirectionLinkedList(head);

        assertEquals(Arrays.asList("aa", "bb", "cc"), linkedList);
    }
}
