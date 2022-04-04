import com.geekbrains.Lesson36;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class Lesson36Test {
    private static Lesson36 lesson36;

    @BeforeAll
    public static void init() {
        lesson36 = new Lesson36();
    }

    @Test
    public void testTask1_1() {
        int[] array = {1, 2, 4, 4, 2, 3, 4, 1, 7};
        int[] expected = {1, 7};
        Assertions.assertArrayEquals(expected, lesson36.getArraySliceBy4(array));
    }

    @Test
    public void testTask1_2() {
        int[] array = {4};
        int[] expected = {};
        Assertions.assertArrayEquals(expected, lesson36.getArraySliceBy4(array));
    }

    @Test
    public void testTask1_3() {
        int[] array = {1, 3, 565, 6};
        Assertions.assertThrows(RuntimeException.class, () -> lesson36.getArraySliceBy4(array));
    }

    @Test
    public void testTask1_4() {
        int[] array = {};
        Assertions.assertThrows(RuntimeException.class, () -> lesson36.getArraySliceBy4(array));
    }


    @Test
    public void testTask2_1() {
        int[] array = {};
        lesson36.testDigits(array);
        Assertions.assertEquals(false, lesson36.testDigits(array));
    }

    @Test
    public void testTask2_2() {
        int[] array = {1, 1, 1, 4, 4, 1, 4, 4};
        lesson36.testDigits(array);
        Assertions.assertEquals(true, lesson36.testDigits(array));
    }

    @Test
    public void testTask2_3() {
        int[] array = {1, 1, 1, 1, 1, 1};
        lesson36.testDigits(array);
        Assertions.assertEquals(false, lesson36.testDigits(array));
    }

    @Test
    public void testTask2_4() {
        int[] array = {4, 4, 4, 4};
        lesson36.testDigits(array);
        Assertions.assertEquals(false, lesson36.testDigits(array));
    }

    @Test
    public void testTask2_5() {
        int[] array = {1, 4, 4, 1, 1, 4, 3};
        lesson36.testDigits(array);
        Assertions.assertEquals(false, lesson36.testDigits(array));
    }

    @Test
    public void testTask2_6() {
        int[] array = {1, 4};
        lesson36.testDigits(array);
        Assertions.assertEquals(true, lesson36.testDigits(array));
    }

    @Test
    public void testTask2_7() {
        int[] array = {4, 1};
        lesson36.testDigits(array);
        Assertions.assertEquals(true, lesson36.testDigits(array));
    }

    @Test
    public void testTask2_8() {
        int[] array = {4};
        lesson36.testDigits(array);
        Assertions.assertEquals(false, lesson36.testDigits(array));
    }

    @Test
    public void testTask2_9() {
        int[] array = {1};
        lesson36.testDigits(array);
        Assertions.assertEquals(false, lesson36.testDigits(array));
    }
}
