package javaSortingPractice;

import java.util.Arrays;

public class Bubblesort {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    // This is unsorted array
    Integer[] array = new Integer[] {12, 13, 24, 10, 3, 6, 90, 70};
    
    // Let's sort using Bubble Sort
    bubbleSort(array, 0, array.length);
    
    // Verify sorted array
    System.out.println(Arrays.toString(array));
    
    }
  
  @SuppressWarnings({"rawtypes", "unchecked"})
  public static void bubbleSort(Object[] array, int fromIndex, int toIndex) {
    Object dataOne;
    for(int i = toIndex - 1; i > fromIndex; i--) {
      
      boolean isSorted = true;
      for(int j = fromIndex; j < i; j++) {
        // if elements in wrong order then swap them
        if(((Comparable) array[j]).compareTo(array[j + 1]) > 0) {
          
          isSorted = false;
          dataOne = array[j + 1];
          array[j + 1] = array[j];
          array[j] = dataOne;
        }
      }
      // if no swapping then array is already sorted
      if(isSorted)
        break;
    }
  }

}
