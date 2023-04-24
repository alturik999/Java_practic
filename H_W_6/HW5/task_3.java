package H_W_6.HW5;

import java.util.Arrays;
import java.util.Random;

public class task_3 {

     public static void main(String[] args) {
         int[] ints = randomArr(10,99,10);
         System.out.println("Задан массив: " + Arrays.toString(ints));
         heapSort(ints);
         System.out.println("HeapSort:     " + Arrays.toString(ints));
     }
     static int[] randomArr(int start, int end, int size){
         Random random = new Random();
         int[] ints = new int[size];
         for (int i = 0; i <size; i++) ints[i] = random.ints(start, (end)).findFirst().getAsInt();
         return ints;
     }
     static void heapSort(int[] arr){
         int n = arr.length;
         for (int i = n / 2 - 1; i >= 0; i--) {
             sink(arr, n, i);
         }
         for (int i=n-1; i>=0; i--) {
             // Переместить текущий корень в конец
             int temp = arr[0];
             arr[0] = arr[i];
             arr[i] = temp;
             sink(arr, i, 0);
         }
     }
     static void sink(int[] arr, int n, int i)
     {
         int largest = i;
         int left = 2*i + 1;
         int right = 2*i + 2;

         if (left < n && arr[left] > arr[largest])
             largest = left;

         if (right < n && arr[right] > arr[largest])
             largest = right;

         if (largest != i) {
             int temp = arr[i];
             arr[i] = arr[largest];
             arr[largest] = temp;

             sink(arr, n, largest);
         }
     }


 }