import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class SILab2Test {
    private ArrayList<String> createList(String[] elems) {
        return new ArrayList<>(Arrays.asList(elems));
    }

    @Test
    void everyStatementTest() {
        IllegalArgumentException ex;
        ex = assertThrows(IllegalArgumentException.class, () -> SILab2.function(new ArrayList<>()));
        assertTrue(ex.getMessage().contains("List length should be greater than 0"));

        String[] list = {"0", "#", "0", "#", "0"};
        ArrayList<String> List = new ArrayList<>(Arrays.asList(list));
        ArrayList<String> arrayList = List;
        ex = assertThrows(IllegalArgumentException.class, () -> SILab2.function(arrayList));
        assertTrue(ex.getMessage().contains("List length should be a perfect square"));

        String[] list1 = {"0", "#", "0", "0", "#", "0", "#", "0", "0", "#", "0", "#", "0", "0", "0", "0"};
        ArrayList<String> List1 = new ArrayList<>(Arrays.asList(list1));
        String[] result1 = new String[]{"2", "#", "2", "0", "#", "4", "#", "2", "2", "#", "3", "#", "0", "1", "0", "1"};
        List = createList(result1);
        assertEquals(List, SILab2.function(List1));
    }

    @Test
    void everyBranchTest() {
        IllegalArgumentException ex;
        ex = assertThrows(IllegalArgumentException.class, () -> SILab2.function(new ArrayList<>()));
        assertTrue(ex.getMessage().contains("List length should be greater than 0"));

        String[] list = {"0", "#", "0", "#", "0"};
        ArrayList<String> List = new ArrayList<>(Arrays.asList(list));
        ArrayList<String> arrayList = List;
        ex = assertThrows(IllegalArgumentException.class, () -> SILab2.function(arrayList));
        assertTrue(ex.getMessage().contains("List length should be a perfect square"));

        String[] list1 = {"0", "#", "0", "0", "#", "0", "#", "0", "0", "#", "0", "#", "0", "0", "0", "0"};
        ArrayList<String> List1 = new ArrayList<>(Arrays.asList(list1));
        String[] result1 = new String[]{"2", "#", "2", "0", "#", "4", "#", "2", "2", "#", "3", "#", "0", "1", "0", "1"};
        List = createList(result1);
        assertEquals(List, SILab2.function(List1));
    }
}
