package javaSortingPractice;

import java.util.Arrays;

public class Selectionsort {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    // This is unsorted array
    Integer[] array = new Integer[] {12, 13, 24, 10, 3, 6, 90, 70};
    
    //Let's sort using Selection Sort
    selectioonSort(array, 0, array.length);
    
    // Verify sorted array
    System.out.println(Arrays.toString(array));
  }
  @SuppressWarnings({"rawtypes", "unchecked"})
  public static void selectionSort(Object[] array, int fromIndex, int toIndex) {
    Object dataOne;
    for(int currentIndex = fromIndex; currentIndex < toIndex; currentIndex++) {
      
      int indexToMove = currentIndex;
      
      for(int tempIndexInLoop = currentIndex + 1; tempIndexInLoop < toIndex; tempIndexInLoop++) {
        
        if(((Comparable) array[indexToMove]).compareTo(array[tempIndexInLoop]) > 0) {
          //Swapping
          indexToMove = tempIndexInLoop;
        }
      }
      dataOne = array[currentIndex];
      array[currentIndex] = array[indexToMove];
      array[indexToMove] = dataOne;
    }
  }

}
