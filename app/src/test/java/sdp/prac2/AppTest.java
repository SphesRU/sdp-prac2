/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package sdp.prac2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

class AppTest {
    // test task 4
    @Test void testTask4() {
        // Arrange
        SimpleFunctions funcs = new SimpleFunctions();
        List<Integer> a = new ArrayList<Integer>();
        List<Integer> b = new ArrayList<Integer>();
        List<Integer> expected = new ArrayList<Integer>();
        a.add(1);
        a.add(2);
        a.add(3);
        b.add(4);
        b.add(5);
        b.add(6);
        expected.add(6);
        expected.add(10);
        expected.add(12);
        // Act
        List<Integer> listGot = funcs.task4(a, b);
        // Assert
        assertEquals(expected, listGot);
  
    }

    @Test void EditedTestTask4() {
        // Arrange
        SimpleFunctions funcs = new SimpleFunctions();
        List<Integer> a = Arrays.asList(1, 2, 3, 4);
        List<Integer> b = Arrays.asList(5, 6, 7, 8);
        List<Integer> expected = null;
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        b.add(4);
        b.add(5);
        b.add(6);
        // Act
        List<Integer> listGot = funcs.task4(a, b);
        // Assert
        assertEquals(expected, listGot);
  
    }

    @Test void testTask2 () {
        // Arrange
        SimpleFunctions funcs = new SimpleFunctions();
        List<String> list = new ArrayList<String>();
        List<String> expected = new ArrayList<String>();
        list.add("hello");//h is removed
        list.add("world");// w is removed
        list.add("!");//"!" is removed
        list.add("");// empty string is removed
        expected.add("ello");
        expected.add("orld");
        expected.add("");
        // Act
        List<String> listGot = funcs.task2(list);// expected output is ["ello", "orld", ""]
        // Assert
        assertEquals(expected, listGot);
    }

    @Test void anotherTest2 (){
        // Arrange
        SimpleFunctions funcs = new SimpleFunctions();
        List<String> list = new ArrayList<String>();
        List<String> expected = new ArrayList<String>();
        list.add("123");// 1 is removed
        list.add("456");// 4 is removed
        list.add("789");// 7 is removed
        list.add("0");// 0 is removed
        list.add("");// empty string is removed
        expected.add("23");
        expected.add("56");
        expected.add("89");
        expected.add("");
        // Act
        List<String> listGot = funcs.task2(list);//expected output is ["23", "56", "89", ""]
        // Assert
        assertEquals(expected, listGot);

    }
     @Test
    public void testtask3() {
        String str = "((()))";
        boolean result = Task3(str);
        assertTrue(result);
    }

    @Test
    public void testtask3() {
        String str = "(()()";
        boolean result = Task3(str);
        assertFalse(result);
    }
    
    @Test void task4Test() {
            // Arrange
            SimpleFunctions funcs = new SimpleFunctions();
            List<Integer> a = Arrays.asList(1, 2, 3, 4);
            List<Integer> b = Arrays.asList(5, 6, 7, 8);
            List<Integer> expected = null;
            // Act
            List<Integer> gotResults = funcs.task4(a, b);
            // Assert
            assertEquals(expected, gotResults);
      
        }
}
