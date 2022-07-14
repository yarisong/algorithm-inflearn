package com.algorithm.recursive.v2;

import java.util.Arrays;
import java.util.Scanner;

public class SubsetSameSum {
    static String answer = "NO";
    static int n;
    static int [] arr;
    static int [] ch ;
    static int totalSum;
    boolean flag = false;
    
    public static void main(String [] args ){
        SubsetSameSum T = new SubsetSameSum();
        
        Scanner sc =new Scanner(System.in);
        n =  sc.nextInt();
        arr = new int[n];
        ch = new int[n+1];
        
        for(int i=0; i<n;i++){
            arr[i] = sc.nextInt();
        }
        totalSum = Arrays.stream(arr).sum();
        
        ch[1] = 1;
        T.DFS(0, 0);
        System.out.println(answer);
    }

    private void DFS(int L, int sum) {
        if(flag) return;
        if(sum>totalSum/2) return;
        if(L == n){
            if((totalSum - sum)==sum){
                answer = "YeS";
                flag=true;
            }
        }else{
            DFS(L+1, sum+arr[L]);
            DFS(L+1, sum);
        }
        
    }
}
