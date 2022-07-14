package com.algorithm.sort;

import java.util.Scanner;

public class BubbleSort {
    public static void main (String [] args){
        BubbleSort T = new BubbleSort();

        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int [] arr = new int[m];
        for(int i=0;i<m;i++){
            arr[i] = sc.nextInt();
        }

        T.solution(arr);
    }

    private void solution(int[] arr) {

        for(int i=0;i<arr.length-1;i++){
            for(int j=0; j<arr.length-1-i;j++){
                if(arr[j] > arr[j+1]){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
        for(int x : arr){
            System.out.print(x +" ");
        }
    }
}
