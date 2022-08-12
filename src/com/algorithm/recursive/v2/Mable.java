package com.algorithm.recursive.v2;

import java.util.Scanner;

public class Mable {


    static int n, m;
    static int [] pm, ch, arr;
    int [][] dy = new int[35][35];
    
    public static void main(String[] args){
        Mable T = new Mable();
    
        Scanner sc = new Scanner(System.in);
        n =sc.nextInt();
        m =sc.nextInt();
            
//        for(int i = 0; i<n;i++) {
//            arr[i] = sc.nextInt();
//        }

        T.DFS(n, m);
    }

    private int DFS(int n, int m) {

        if(dy[n][m] >0 ){
            return dy[n][m];
        }
        if(n == m || m ==0){
            return 1;
        }else{
            return dy[n][m] =  DFS(n-1, m-1) + DFS(n-1, m);
        }
    }
}
