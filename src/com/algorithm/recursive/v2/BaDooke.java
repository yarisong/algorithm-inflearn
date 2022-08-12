package com.algorithm.recursive.v2;

import java.util.Scanner;

public class BaDooke {
    static int c;
    static int n;
    static int total;
    static int temp = 0;
    static int sum;
    static int[] ch;
    
    public static void main(String [] args){
        BaDooke T = new BaDooke();
        
        Scanner sc = new Scanner(System.in);
        
        c = sc.nextInt();
        n = sc.nextInt();
        
        int [] arr = new int[n];
        ch = new int[n+1];
        
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
            total += arr[i];
        }
                    
        T.DFS(0,0, arr);
    }
    
    public void DFS(int L, int sum, int [] arr){
        
        if( L == n){
            if(temp <sum){
                temp = sum;
            }
        }else{
            DFS(L+1, sum +arr[L], arr);
            DFS(L+1, sum, arr);
        }
    }
}
