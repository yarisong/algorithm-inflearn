package com.algorithm.sort;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args){
        BinarySearch T = new BinarySearch();

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr =new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        T.solution(n, m, arr);
    }

    private void solution(int n, int m, int[] arr) {
        Arrays.sort(arr);
        int lt =0;
        int rt =n-1;
        
        
        while(lt <= rt) {
            int mid = (lt + rt) / 2;

            if (arr[mid] == m) {
                System.out.println(mid + 1);
                return;
            }
            
            if (arr[mid] > m) {
                rt = mid - 1;

            } else if (arr[mid] < m) {
                lt = mid + 1;
            }
            
        }
    }
}
