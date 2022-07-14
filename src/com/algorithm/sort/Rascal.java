package com.algorithm.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Rascal {

    public static void main(String[] args){
        Rascal T = new Rascal();
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr =new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        T.solution(n, arr);
    }

    private void solution(int n, int[] arr) {

        int [] cp = arr.clone();
        Arrays.sort(cp);
        
        for(int i=0; i<n-1;i++){
            if( arr[i] != cp[i]){
                System.out.print(i+1 +" ");
            }
        }
    }
}
