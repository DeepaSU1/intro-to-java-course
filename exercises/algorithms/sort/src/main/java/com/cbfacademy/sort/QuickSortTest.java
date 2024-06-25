
package com.cbfacademy.sort;

public class QuickSort implements ArraySorter {
    
    @Override
    public void sort(int[] array){
        if (array == null || array.length == 0){
            return;
        }
        sort(array, 0, array.length - 1);
    }

    private void sort(int[] arr, int startIndex, int endIndex){
        if (startIndex < endIndex){
            int pivotIndex = partition(arr, startIndex, endIndex);
            sort(arr, startIndex, pivotIndex - 1);
            sort(arr, pivotIndex + 1, endIndex);
        }
    }

    private int partition(int[] arr, int startIndex, int endIndex){
        int pivot = arr[endIndex];
        int boundaryIndex = startIndex -1;
        
        for (int currentIndex = startIndex; currentIndex < endIndex; currentIndex++){
            if (arr[currentIndex] <= pivot){
                boundaryIndex++;
                swap(arr, boundaryIndex, currentIndex);
            }
        }

        swap(arr, boundaryIndex + 1, endIndex);
        return boundaryIndex + 1;
    }

    private void swap(int[], int leftIndex, int rightIndex){
        int temp = arr[leftIndex];
        arr[leftIndex] = arr[rightIndex];
        arr[rightIndex] = temp;
    }
}