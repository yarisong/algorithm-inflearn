package com.algorithm.sort;

import java.util.Scanner;

public class DecisionAlgo2 {

    public static void main(String[] args){
        DecisionAlgo2 T = new DecisionAlgo2();

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
        int answer = 0;
        int lt = 1;
        int rt = arr.length-1;
        
        while(lt<=rt){
            int mid = (lt+rt)/2;
            
            if(count(arr, mid) >= m ){
                answer = mid;
                lt = lt +mid;
            }else{
                rt = mid -1;
            }
        }
        System.out.println(answer);

    }

    private int count(int[] arr, int mid) {
        int cnt = 1;
        int ep = arr[0];
        
        for(int i=0; i< arr.length;i++){
            if(arr[i] -ep >= mid){
                cnt ++;
                ep = arr[i];
            }
        }
        return cnt;
    }

}