package com.algorithm.recursive.v2;

import java.util.Scanner;

public class Permutation {
    
    static int n, m;
    static int [] pm, ch, arr;
    
    public void DFS(int L, int s){
        
        if(L == m){
            for(int x:pm){
                System.out.print(x+" ");
                System.out.println();
            }
        }else{
            for(int i=s;i<n;i++){
                pm[L] = i;
                DFS(L+1, i+1);
            }
        }
        
    }
    
    public static void main(String [] args){

        Permutation T = new Permutation();
        
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        
        pm = new int[m];
        
        T.DFS(0, 1);
    }
}
