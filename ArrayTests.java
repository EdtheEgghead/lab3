import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}

    @Test 
	public void testReverseInPlace2() {
    int[] input1 = { 3, 2 ,1 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 1, 2, 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }
 
  @Test
  public void testReversed2() {
    int[] input1 = { 1, 2, 3, 4, 5 };
    int[] temp = ArrayExamples.reversed(input1); 
    assertArrayEquals(new int[]{1, 2, 3, 4, 5}, input1);
    assertArrayEquals(new int[]{ 5, 4, 3, 2, 1 }, temp);
  }
  
  @Test
  public void testAverage() {
    double[] input2 = null;
    assertEquals(-1, ArrayExamples.averageWithoutLowest(input2), 0.00000000000000000000000);
  }
}
