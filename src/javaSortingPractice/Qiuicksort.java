package javaSortingPractice;

import java.util.Arrays;

public class Qiuicksort {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
      Integer[] array = new Integer[] {12, 13, 24, 10, 3, 6, 90, 70, 7};
      quickSort(array, 0, array.length-1);
      System.out.println(Arrays.deepToString(array));
    }

    public static void quickSort(Integer[] arr, int low, int high) {
        // TODO Auto-generated method stub
      if(arr == null || arr.length == 0)  return;// return out of the Method when met
      if(low >= high) return;// return out of the Method when met
      int middle = low + (high - low)/2;
      int pivot = arr[middle];
      System.out.println(pivot);
      int i = low;
      int j = high;
      while(i <= j) {
        while(arr[i] < pivot) {
          i++;
        }
        while(arr[j] > pivot) {
          j--;
        }
        if(i <= j) {
            swap(arr, i, j);
            i++;
            j--;
        }
      }
      if (low < j) quickSort(arr, low, j);
      if (high > i) quickSort(arr, i, high);
    }

    public static void swap(Integer array[], int x, int y) {
      int temp = array[x];
      array[x] = array[y];
      array[y] = temp;
    }
}
