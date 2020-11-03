package xyz.jekd.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UtilTest {

    @Test
    public void test_max__normal() {

        Integer[] srcArr = {1, 4, 3, 11, 8, 10};

        assertEquals(11, Util.max(srcArr));
    }

    @Test
    public void test_max__empty_array() {

        Integer[] srcArr = {};

        assertThrows(AssertionError.class, () -> {
            Util.max(srcArr);
        });
    }

    @Test
    public void test_min__normal() {

        Integer[] srcArr = {1, -100,  4, 3, 11, 8, 10};

        assertEquals(-100, Util.min(srcArr));
    }

    @Test
    public void test_min__empty_array() {

        Integer[] srcArr = {};

        assertThrows(AssertionError.class, () -> {
            Util.min(srcArr);
        });
    }

    @Test
    public void test_accumulateArr__normal() {

        Integer[] srcArr = {1, 2, 3, 4, 5, 6};

        assertEquals(1, Util.accumulateArr(srcArr, 0, 0));
        assertEquals(3, Util.accumulateArr(srcArr, 0, 1));
        assertEquals(5, Util.accumulateArr(srcArr, 1, 2));
    }

    @Test
    public void test_accumulateCntArr__normal() {

        Integer[] srcArr = {1, 2, 3, 4, 5, 6};

        assertArrayEquals(new Integer[]{1, 3, 6, 10, 15, 21}, Util.accumulateCntArr(srcArr));
    }
}
