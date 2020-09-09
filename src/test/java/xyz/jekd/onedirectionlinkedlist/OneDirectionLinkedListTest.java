package xyz.jekd.onedirectionlinkedlist;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class OneDirectionLinkedListTest {

    @Test
    public void testTraverseOneDirectionLinkedList() {

        OneDirectionNode head = OneDirectionLinkedList.generateLinkedList();

        List<String> linkedList = OneDirectionLinkedList.traverseOneDirectionLinkedList(head);

        Assert.assertEquals(Arrays.asList("aa", "bb", "cc"), linkedList);
    }
}
