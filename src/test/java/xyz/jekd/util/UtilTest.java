package xyz.jekd.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

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
}
