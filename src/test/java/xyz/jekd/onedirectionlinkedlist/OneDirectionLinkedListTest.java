package xyz.jekd.onedirectionlinkedlist;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

public class OneDirectionLinkedListTest {

    OneDirectionLinkedList emptyList;
    OneDirectionLinkedList notEmptyList;

    private OneDirectionLinkedList generateEmptyList() {
        return new OneDirectionLinkedList();
    }

    private OneDirectionLinkedList generateNotEmptyList() {
        OneDirectionNode node1 = new OneDirectionNode("aa", null);
        OneDirectionNode node2 = new OneDirectionNode("bb", null);
        OneDirectionLinkedList result = new OneDirectionLinkedList();
        result.add(node1);
        result.add(node2);

        return result;
    }

    @BeforeEach
    public void generateLists() {

        emptyList = generateEmptyList();
        notEmptyList = generateNotEmptyList();
    }

    @Test
    public void testIsEmpty() {
        assertTrue(emptyList.isEmpty());
    }

    @Test
    void testIsNotEmpty() {
        assertFalse(notEmptyList.isEmpty());
    }

    @Test
    public void testAdd() {

        assertEquals(Arrays.asList("aa", "bb"), notEmptyList.toList());
        assertEquals(2, notEmptyList.getSize());
    }

    // ------------------------------------
    //          removeLast
    // ------------------------------------
    @Test
    public void test_removeLast__not_empty() {
        notEmptyList.removeLast();

        assertEquals(Collections.singletonList("aa"), notEmptyList.toList());
        assertEquals(1, notEmptyList.getSize());
    }

    @Test
    public void test_removeLast__empty() {

        assertThrows(RuntimeException.class, () -> emptyList.removeLast());
    }

    // ------------------------------------
    //          insertToIndex
    // ------------------------------------
    @Test
    public void test_insertToIndex__not_empty__middle() {
        int originalSize = notEmptyList.getSize();
        OneDirectionNode oneDirectionNode = new OneDirectionNode("cc", null);
        notEmptyList.insertToIndex(oneDirectionNode, 1);
        assertEquals(Arrays.asList("aa", "cc", "bb"), notEmptyList.toList());
        assertEquals(originalSize + 1, notEmptyList.getSize());
    }

    @Test
    public void test_insertToIndex__not_empty__last() {
        int originalSize = notEmptyList.getSize();
        OneDirectionNode oneDirectionNode = new OneDirectionNode("cc", null);
        notEmptyList.insertToIndex(oneDirectionNode, 2);
        assertEquals(Arrays.asList("aa", "bb", "cc"), notEmptyList.toList());
        assertEquals(originalSize + 1, notEmptyList.getSize());
    }

    @Test
    public void test_insertToIndex__empty() {

        OneDirectionNode oneDirectionNode = new OneDirectionNode("cc", null);
        assertThrows(RuntimeException.class, () -> notEmptyList.insertToIndex(oneDirectionNode, 100));
    }

    // ------------------------------------
    //          removeByIndex
    // ------------------------------------
    @Test
    public void test_removeByIndex__not_empty_list__remove_first() {
        int originalSize = notEmptyList.getSize();
        notEmptyList.removeByIndex(0);
        assertEquals(Collections.singletonList("bb"), notEmptyList.toList());
        assertEquals(originalSize - 1, notEmptyList.getSize());
    }

    @Test
    public void test_removeByIndex__not_empty_list__not_remove_first() {
        int originalSize = notEmptyList.getSize();
        notEmptyList.removeByIndex(1);
        assertEquals(Collections.singletonList("aa"), notEmptyList.toList());
        assertEquals(originalSize - 1, notEmptyList.getSize());
    }

    @Test
    public void test_removeByIndex__empty_list__index_too_large (){
        assertThrows(RuntimeException.class, () -> emptyList.removeByIndex(100));
    }

    @Test
    public void test_removeByIndex__empty_list__index_too_little (){
        assertThrows(RuntimeException.class, () -> emptyList.removeByIndex(-1));
    }
}
