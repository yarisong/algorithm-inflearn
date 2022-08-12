package com.algorithm;

import java.util.Scanner;

public class UnionFindFriend {
    
    static int [] unf;
    
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        unf = new int[n+1];
        for( int i=1;i<=n;i++){
            unf[i] = i;
        }
        
        for(int i=1; i<=m; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            Union(a,b);
        }
        
    }
    
    public static void  Union(int a, int b){
        int fa = find(a);
        int fb = find(b);
        if(fa != fb){
            unf[fa]=fb;
        }
    }

    private static int find(int v) {
        if (v == unf[v]){
            return v;
        }else{ 
            return unf[v] =  find(unf[v]);
        }
    }
}
