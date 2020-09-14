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
}
