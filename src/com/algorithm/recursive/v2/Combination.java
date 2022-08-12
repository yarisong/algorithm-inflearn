package com.algorithm.recursive.v2;

import java.util.Scanner;

public class Combination {

    
    int [][] dy = new int[35][35];
    //static int passVal;
    //static int [] pm, ch, arr;

    public int DFS(int n, int r){

        if(dy[n][r] >0 ){
            return dy[n][r];
        }
        if(n == r || r ==0){
            return 1;
        }else{
            return dy[n][r] =  DFS(n-1, r-1) + DFS(n-1, r);
        }


    }

    public static void main(String [] args){

        Combination T = new Combination();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();

        
        
        System.out.println(T.DFS(n, r));
    }
}
