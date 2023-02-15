package com.moonwalker.util;

import com.fasterxml.jackson.annotation.JsonTypeInfo.As;
import java.math.BigDecimal;
import java.util.List;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Simple :              remove trailing parentheses from test method name ReplaceUnderscores :  replace underscores
 * with spaces IndicativeSentences : Generate sentence based on test class name and test method name
 *
 * @DisplayNameGeneration(DisplayNameGenerator.IndicativeSentences.class)
 */
class DemoUtilTest {

    //TODO: search google for : junit display name camel case

    DemoUtil demoUtil;

    /**
     * @BeforeAll and @AfterAll should be declaring static
     */

    @BeforeAll
    static void beforeAll() {

    }

    @AfterAll
    static void afterAll() {

    }

    @BeforeEach
    void setUp() {
        // set up
        demoUtil = new DemoUtil();
    }

    @AfterEach
    void tearDown() {
    }

    @DisplayName("Equals and Not Equals")
    @Test
    void test_Equal_And_Not_Equal() {
        // execute & assert
        Assertions.assertEquals(6, demoUtil.add(2, 4), "2 + 4 should be 6");
        Assertions.assertNotEquals(8, demoUtil.add(2, 4), "2 + 4 should not be 8");
    }

    @DisplayName("Null and Not Null")
    @Test
    void test_Null_And_Not_Null() {
        String str1 = null;
        String str2 = "hello";

        Assertions.assertNull(demoUtil.checkNull(str1));
        Assertions.assertNotNull(str2);
    }

    @DisplayName("Same and Not Same")
    @Test
    void testSameAndNotSame() {

        String str = "Luv2Code";

        Assertions.assertSame(demoUtil.getACADEMY(), demoUtil.getACADEMY_DUPLICATE(),
            "references should refer to same Object");
        Assertions.assertNotSame(str, demoUtil.getACADEMY(), "references should not refer to same Object");
    }

    @DisplayName("True and False")
    @Test
    void testTrueFalse() {
        int grade1 = 18;
        int grade2 = 15;

        Assertions.assertTrue(demoUtil.isGreater(grade1, grade2), "This should return true");
        Assertions.assertFalse(demoUtil.isGreater(grade2, grade1), "This should return false");
    }

    @DisplayName("Array Equals")
    @Test
    void testArrayEquals() {
        String[] arr = {"A", "B", "C"};

        Assertions.assertArrayEquals(arr, demoUtil.getDEMO_ARRAY(), "Arrays should be same");
    }

    @DisplayName("Iterable Equals")
    @Test
    void testIterableEquals() {
        List<String> list = List.of("A", "B", "C");

        Assertions.assertIterableEquals(list, demoUtil.getDEMO_LIST(), "Expected list should be same as actual list");
    }

    @DisplayName("Lines Match")
    @Test
    void testLinesMatch() {
        List<String> list = List.of("A", "B", "C");

        Assertions.assertLinesMatch(list, demoUtil.getDEMO_LIST(), "Lines should match");
    }

    @DisplayName("Throws and Does Not Throw")
    @Test
    void testThrowsAndDoesNotThrow() {
        Assertions.assertThrows(Exception.class, () -> demoUtil.payPrice(BigDecimal.valueOf(400)), "should throw exception");
        Assertions.assertDoesNotThrow(() -> demoUtil.payPrice(BigDecimal.valueOf(250)), "should not throw exception");
    }
}