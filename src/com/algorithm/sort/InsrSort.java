package com.algorithm.sort;

import java.util.Scanner;

public class InsrSort {
    public static void main (String [] args){
        InsrSort T = new InsrSort();

        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int [] arr = new int[m];
        for(int i=0;i<m;i++){
            arr[i] = sc.nextInt();
        }

        T.solution(arr);
    }

    private void solution(int[] arr) {
        
        for(int i=1; i< arr.length;i++) {
            int tmp = arr[i];
            int j;
            for(j=i-1; j>=0;j--){
                if(arr[j] > tmp){
                    //11 5
                    arr[j+1] = arr[j];
                }else{  
                    break;
                }
            }
            arr[j+1] = tmp;
        }
    }
}
