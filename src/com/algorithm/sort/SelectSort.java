package com.algorithm.sort;

import java.util.Scanner;

public class SelectSort {
    
    public static void main(String [] args){
        SelectSort T = new SelectSort();
        
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
            int idx = i;
            for(int j=i;j<arr.length;j++){
               if(arr[j] < arr[idx] ){
                   idx =j;
               }
            }
            int tmp = arr[i];
            arr[i] =arr[idx];
            arr[idx]= tmp;
        }
        
        for(int x : arr){
            System.out.print(x +" ");
        }
    }
}
