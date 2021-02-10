package javaSortingPractice;

import java.util.Arrays;

public class Insertionsort {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    // This is an unsorted array
    Integer[] array = new Integer[] {12, 13, 24, 10, 3, 6, 90, 70};
    
    // Let's sort using insertion sort
    insertionSortImproved(array, 0, array.length);
    
    //Verify sorted array
    System.out.println(Arrays.toString(array));
  }
  
  @SuppressWarnings({"rawtypes", "unchecked"})
  public static void insertionSortImproved(Object[] array, int fromIndex, int toIndex) {
    Object dataOne;
    
    for(int i = fromIndex + 1; i < toIndex; i++) {
      dataOne = array[i];
      int jLeft = fromIndex;
      int jRight = i - 1;
      
      //Check if its current position is its suitable position
      if(((Comparable) array[jRight]).compareTo(dataOne) > 0) {
        //Perform binary search
        while (jRight - jLeft >= 2) {
          int jMiddle = (jRight - jLeft) / 2 + jLeft - 1;
          
          if(((Comparable) array[jMiddle]).compareTo(dataOne) > 0) {
            jRight = jMiddle;
            
          } else {
            jLeft = jMiddle + 1;
          }
        }
        if(jRight - jLeft == 1) {
          int jMiddle = jLeft;
          
          if(((Comparable) array[jMiddle]).compareTo(dataOne) > 0) {
            jRight = jMiddle;
            
          } else {
            jLeft = jMiddle + 1;
          }
        }
        // Place the element
        int j = i;
        for(j = i; j > jLeft; j--) {
          array[j] = array[j - 1];
        }
        array[j] = dataOne;
      }
    }
  }

}
