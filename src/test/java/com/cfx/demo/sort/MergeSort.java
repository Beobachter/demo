package com.cfx.demo.sort;

import org.junit.Test;


public class MergeSort {

    @Test
    public void mergeSort() {
        int[] arr = {45,3,2,15,36,3,43,1,44,26};
        mergeSort(arr,0,arr.length - 1);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    private void mergeSort(int[] arr,int l,int r) {
        if (l >= r) {
            return;
        }

        int mid = l - (l - r)/2;
        mergeSort(arr,l,mid);
        mergeSort(arr,mid + 1,r);
        merge(arr,l,mid,r);
    }

    private void merge(int[] arr, int l, int mid, int r) {
        int[] temp = new int[r - l + 1];
        for (int i = l; i <= r; i ++) {
            temp[i-l] = arr[i];
        }

        int i = l;
        int j = mid + 1;
        for (int k = l;k <= r; k++) {
            if (i > mid) {
                arr[k] = temp[j - l];
                j++;
            } else if (j > r) {
                arr[k] = temp[i - l];
                i++;
            } else if (temp[i - l] > temp[j - l]) {
                arr[k] = temp[j - l];
                j++;
            } else {
                arr[k] = temp[i - l];
                i++;
            }
        }
    }
}
