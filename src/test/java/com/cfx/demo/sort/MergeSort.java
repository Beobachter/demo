package com.cfx.demo.sort;

import org.junit.Test;


public class MergeSort {

    @Test
    public void mergeSort() {
        int[] arr = {1,2,11,3,12,11,0};
        mergeSort(arr,0,arr.length-1);
        System.out.println("");
    }

    private void mergeSort(int[] arr,int l,int r) {
        if (l >= r) {
            return;
        }

        int mid = l - (l - r)/2;
        mergeSort(arr,l,mid);
        mergeSort(arr,mid+1,r);
        merge(arr,l,mid,r);
    }

    private void merge(int[] arr, int l, int mid, int r) {
        int[] tmp = new int[arr.length];
        int index = 0;
        int i = l;
        int j = mid + 1;
        while (i <= mid || j <= r) {
            if (i > mid) {
                tmp[index++] = arr[j];
                j ++;
            } else if (j > r) {
                tmp[index++] = arr[i];
                i++;
            } else if (arr[i] < arr[j]) {
                tmp[index++] = arr[i];
                i++;
            } else {
                tmp[index++] = arr[j];
                j++;
            }
        }
        for (int d = 0; d < index;d++) {
            arr[l + d] = tmp[d];
        }
    }
}
