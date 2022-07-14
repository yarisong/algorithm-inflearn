package com.algorithm.hash;

import com.algorithm.twopoint.PartProgression;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class KthBigNum {

    public static void main(String[] args) {
        KthBigNum T = new KthBigNum();

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        
        int[] arr1 = new int[n];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }
        
        T.solution(n, k, arr1);
    }

    private void solution(int n, int k, int[] arr){
        TreeSet<Integer> tSet = new TreeSet<>(Collections.reverseOrder());
        int answer =0;
        
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n;j++){
                for(int l=j+1; l<n; l++){
                    tSet.add(arr[i]+arr[j]+arr[l]);
                }
            }
        }
        int cnt  = 0;
        for(int x: tSet){
            cnt++;
            if(cnt == k){
                answer = x;
            }
        }
        
        System.out.println(answer);
    }
}
