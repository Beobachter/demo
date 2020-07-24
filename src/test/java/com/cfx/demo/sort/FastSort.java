package com.cfx.demo.sort;

import org.junit.Test;

public class FastSort {

    @Test
    public void fastSort() {
        int[] arr = {45,3,2,15,36,3,43,1,44,26};
        fastSort(arr,0,arr.length - 1);
        System.out.println(arr);
    }

    private void fastSort(int[] arr,int p,int r) {
        if (p >= r) {
            return;
        }
        int povit = r- (r - p)/2;
        int i = p;
        int j = r;
        while (i < povit || j > povit) {
            if (i >= povit) {
                if (arr[povit] < arr[j]) {
                    j--;
                } else {
                    int tmp = arr[povit];
                    arr[povit] = arr[j];
                    arr[j] = tmp;
                    povit =  j;
                }
            } else if (j < povit) {
                if (arr[povit] > arr[i]) {
                    i++;
                } else {
                    int tmp = arr[povit];
                    arr[povit] = arr[i];
                    arr[i] = tmp;
                    povit = i;
                }
            } else if (arr[i] > arr[povit] && arr[j] < arr[povit]) {
                int tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
            } else if (arr[i] <= arr[povit]) {
                i++;
            } else if (arr[j] >= arr[povit]) {
                j--;
            }
        }
        fastSort(arr,p,povit - 1);
        fastSort(arr,povit + 1,r);
    }
}
