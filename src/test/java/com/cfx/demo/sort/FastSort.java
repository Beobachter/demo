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
        int q = p;
        for (int i = p; i < r; i++) {
            if (arr[i] < arr[r]) {
                int tem = arr[i];
                arr[i] = arr[q];
                arr[q] = tem;
                q++;
            }
        }
        int tem = arr[q];
        arr[q] = arr[r];
        arr[r] = tem;
        fastSort(arr,p,q - 1);
        fastSort(arr,q + 1,r);
    }
}
