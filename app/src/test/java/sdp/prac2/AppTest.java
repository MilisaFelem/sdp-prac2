/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package sdp.prac2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    public void Task1Test() {
        // Arrange
        List<Integer> emptyList = Arrays.asList();
        List<Integer> a3 = Arrays.asList(1, 2, 3);
        List<Integer> a1 = Arrays.asList(7);

        List<Integer> negative = Arrays.asList(-1);
        List<Integer> b1 = Arrays.asList(0);
        List<Integer> b2 = Arrays.asList(0, 1);
        List<Integer> b3 = Arrays.asList(0, 1, 2, 3);
        List<Integer> bOutOfBounds1 = Arrays.asList(2_000_000);
        List<Integer> bOutOfBounds2 = Arrays.asList(2_000_000, 2_000_001);
        List<Integer> bMix = Arrays.asList(0, 2_000_001);

        // Act
        int result1 = SimpleFunctions.Task1(emptyList, emptyList);
        int result2 = SimpleFunctions.Task1(emptyList, b1);
        int result3 = SimpleFunctions.Task1(emptyList, b2);
        int result4 = SimpleFunctions.Task1(a1, emptyList);
        int result5 = SimpleFunctions.Task1(a3, emptyList);
        int result6 = SimpleFunctions.Task1(a1, negative);
        int result7 = SimpleFunctions.Task1(a3, negative);
        int result8 = SimpleFunctions.Task1(a3, bOutOfBounds1);
        int result9 = SimpleFunctions.Task1(a3, bOutOfBounds2);
        int result10 = SimpleFunctions.Task1(a3, bMix);
        int result11 = SimpleFunctions.Task1(a3, b3);

        // Assert
        assertEquals(result1, 0, "Should select nothing");
        assertEquals(result2, 0, "Should select nothing");
        assertEquals(result3, 0, "Should select nothing");
        assertEquals(result4, 0, "Should select nothing");
        assertEquals(result5, 0, "Should select nothing");
        assertEquals(result6, 0, "Should select nothing");
        assertEquals(result7, 0, "Should select nothing");
        assertEquals(result8, 0, "Should select nothing");
        assertEquals(result9, 0, "Should select nothing");
        assertEquals(result10, 1, "Should select the first element and ignor out of bounds index");
        assertEquals(result11, 6, "Should select all elements in bounds");

    }

    @Test
    void task2Test() {
        // Arrange
        List<String> input = Arrays.asList("apple", "banana", "cherry");
        List<String> expected = Arrays.asList("pple", "anana", "herry");
        // Act
        List<String> result = SimpleFunctions.Task2(input);
        // Assert
        assertEquals(expected, result);
    }

    @Test
    void task2Test() {
        // Arrange
        List<String> input = Arrays.asList("a", "", "cat", "d");
        List<String> expected = Arrays.asList("", "at");
        // Act
        List<String> result = SimpleFunctions.Task2(input);
        // Assert
        assertEquals(expected, result);
    }

    @Test
    public void testTask3() {
        // arrange
        String testBasic = "()";
        String testWrong = "(";
        String testNested = "((()))";

        // act and assert as it returns boolean
        assertTrue(Task3(testBasic));
        assertFalse(Task3(testWrong));
        assertTrue(Task3(testNested));
    }

    @Test
    public void task4Test() {
        // Arrange

        // normal case
        List<Integer> a = Arrays.asList(1, 2, 3);
        List<Integer> b = Arrays.asList(4, 5, 6);
        // Diff sizes case
        List<Integer> c = Arrays.asList(1, 2);
        List<Integer> d = Arrays.asList(3, 4, 5);
        // empty list case
        List<Integer> e = new ArrayList<>();
        List<Integer> f = new ArrayList<>();
        // one element case
        List<Integer> g = Arrays.asList(7);
        List<Integer> h = Arrays.asList(8);

        // Act
        List<Integer> result = SimpleFunctions.Task4(a, b);
        List<Integer> result2 = SimpleFunctions.Task4(c, d);
        List<Integer> result3 = SimpleFunctions.Task4(e, f);
        List<Integer> result4 = SimpleFunctions.Task4(g, h);

        // Assert
        List<Integer> expected = Arrays.asList(1 * 6, 2 * 5, 3 * 4); // [6, 10, 12]
        assertEquals(expected, result);
        assertNull(result2);
        assertEquals(new ArrayList<Integer>(), result3);
        assertEquals(Arrays.asList(56), result4);

    }

    @Test
    public void Task5Test1() {
        // Arrange
        List<Integer> input = Arrays.asList(1, 2, 3, 4, 5);

        // Act
        boolean result = SimpleFunctions.Task5(input);

        // Assert
        assertTrue(result, "Expected true for a sorted list");
    }

    @Test
    public void Task5Test2() {
        // Arrange
        List<Integer> input = Arrays.asList(1, 3, 2, 4, 5);

        // Act
        boolean result = SimpleFunctions.Task5(input);

        // Assert
        assertFalse(result, "Expected false for an unsorted list");
    }
    @Test
    public void Task6Test1() {
        List<Integer> input = Arrays.asList(90, 150, 300, 101);
        List<Integer> expected = Arrays.asList(100, 200, 300, 200);

        List<Integer> result = SimpleFunctions.Task6(input);

        assertEquals(expected, result);
    }

    @Test
    public void Task6Test2() {
        List<Integer> input = Arrays.asList(100, 200, 0, 500);
        List<Integer> expected = Arrays.asList(100, 200, 0, 500);

        List<Integer> result = SimpleFunctions.Task6(input);

        assertEquals(expected, result);
    }

}
