package com.algorithm.recursive.v2;

import java.util.Scanner;

public class GuessPermutation {
    
    static int [] b, p, ch; // b : 조합n , p : 순열 
    static int n, f;
    boolean flag = false;
    int[][] dy = new int[35][35];
    
    public int combi(int n, int r){
        if(dy[n][r]>0) {
            return dy[n][r];
        }
        if(n ==r || r ==0) {
            return 1;
        }
        else {
            return dy[n][r] = combi(n - 1, r - 1) + combi(n - 1, r);
        }
    }
    
    public void DFS(int L, int sum){
        if(flag){
            return;
        }
        if(L == n){
            if(sum == f){
                flag = true;
                for(int x : p){
                    System.out.print(x + " ");
                    System.out.println();
                }
                
            }
        }else{
            //i는 순열을 실제로 만드는 숫자임
            for(int i=1; i<=n;i++){
                // 순열을 구성하는 숫자 i가 사용되었는지 체크 
                if(ch[i] == 0){
                    ch[i] = 1;
                    p[L] = i;
                    DFS(L+1, sum+(p[L] * b[L]));
                    ch[i] = 0; 
                }
            }
        }
        
    }

    public static void main(String [] args){

        GuessPermutation T = new GuessPermutation();

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        f = sc.nextInt();
        b = new int[n];
        p = new int[n];
        ch = new int[n+1];
        for(int i=0; i<n;i++){
            b[i] = T.combi(n-1, i);
        }
        T.DFS(0,0);
        
    }
    
}
