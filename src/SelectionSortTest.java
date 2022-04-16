import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;

public class SelectionSortTest {
@Test
public void test() {
testPositive();
testNegative();
testMixed();
testDuplicates();
}
public SelectionSortTest() {
}

public void testPositive(){
    int[] arr = new int[5];
    arr[0] = 8;
    arr[1] = 9;
    arr[2] = 7;
    arr[3] = 10;
    arr[4] = 2;

    int[] Sortedarr = new int[5];
    Sortedarr[0] = 2;
    Sortedarr[1] = 7;
    Sortedarr[2] = 8;
    Sortedarr[3] = 9;
    Sortedarr[4] = 10;

    /** add tests to check for this unit test **/
    SelectionSort arr1 = new SelectionSort();
    arr = arr1.basicSelectionSort(arr);
    assertArrayEquals(Sortedarr, arr);


}

public void testNegative(){
    int[] arr = new int[5];
    arr[0] = -8;
    arr[1] = -9;
    arr[2] = -7;
    arr[3] = -10;
    arr[4] = -2;

    int[] Sortedarr = new int[5];
    Sortedarr[0] = -10;
    Sortedarr[1] = -9;
    Sortedarr[2] = -8;
    Sortedarr[3] = -7;
    Sortedarr[4] = -2;

/** Test data contains negative values only **/
    SelectionSort arr1 = new SelectionSort();
    arr = arr1.basicSelectionSort(arr);
    assertArrayEquals(Sortedarr, arr);

}

public void testMixed(){
    int[] arr = new int[5];
    arr[0] = -8;
    arr[1] = 9;
    arr[2] = -7;
    arr[3] = 10;
    arr[4] = -2;

    int[] Sortedarr = new int[5];
    Sortedarr[0] = -8;
    Sortedarr[1] = -7;
    Sortedarr[2] = -2;
    Sortedarr[3] = 9;
    Sortedarr[4] = 10;
/** Test data contains with both positive, negative and zeros **/
    SelectionSort arr1 = new SelectionSort();
    arr = arr1.basicSelectionSort(arr);
    assertArrayEquals(Sortedarr, arr);
}

public void testDuplicates(){
    int[] arr = new int[5];
    arr[0] = 8;
    arr[1] = 8;
    arr[2] = 7;
    arr[3] = 10;
    arr[4] = 2;

    int[] Sortedarr = new int[5];
    Sortedarr[0] = 2;
    Sortedarr[1] = 7;
    Sortedarr[2] = 8;
    Sortedarr[3] = 8;
    Sortedarr[4] = 10;
/** Test data contains duplicates **/
    SelectionSort arr1 = new SelectionSort();
    arr = arr1.basicSelectionSort(arr);
    assertArrayEquals(Sortedarr, arr);
}
}