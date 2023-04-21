import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
    int[] input2 = {1, 2, 3};
    ArrayExamples.reverseInPlace(input2);
    assertArrayEquals(new int[]{3, 2, 1}, input2);
    int[] input3 = { };
    ArrayExamples.reverseInPlace(input3);
    assertArrayEquals(new int[]{ }, input3);
	}


  @Test
  public void testReversed() {
    int[] input1 = {2, 1};
    assertArrayEquals(new int[]{1, 2}, ArrayExamples.reversed(input1));
    int[] input2 = {1, 2, 3};
    assertArrayEquals(new int[]{3, 2, 1}, ArrayExamples.reversed(input2));
    int[] input3 = { 3 };
    assertArrayEquals(new int[]{ 3 }, ArrayExamples.reversed(input3));
    
  }

  @Test
  public void testaverageWithoutLowest(){
    double[] input1 = {1};
    double output = ArrayExamples.averageWithoutLowest(input1);
    assertEquals(0.0, output, .0000001);
  }
}


