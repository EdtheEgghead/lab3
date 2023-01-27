import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

public class ListTests {
    @Test 
	public void filterTest() {
        List<String> list = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        ListExamples ok = new ListExamples();
        list.add("er");
        list.add("ok");
        list.add("hello");
        list.add("world");
        list2.add("er");
        list2.add("ok");
        assertEquals(list2, ListExamples.filter(list, ok)); 
    }
}
