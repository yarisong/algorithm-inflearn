package com.algorithm;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class WonderLand {
    
    static  int[] unf;
    
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        unf = new int[n+1];
        ArrayList<Edge> arr =new ArrayList<>();
        for(int i=1; i<n;i++){
            unf[i] = i;
        }
        
        for(int i=0;i<m;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            arr.add(new Edge(a,b,c));
        }
        
        int answer =0;
        Collections.sort(arr);
        
    }
    
    public static int find(int v){
        if(v==unf[v]){
            return v;
        }else{
            return unf[v] =find(unf[v]);
        }
    }
    
    public static void Union(int a, int b){
        int fa =find(a);
        int fb =find(b);
        if(fa!=fb){
            unf[fa] = fb;
        }
    }
}

class Edge implements Comparable<Edge>{
    
    public int v1;
    public int v2;
    public int cost;

    public Edge(int v1, int v2, int cost) {
        this.v1 = v1;
        this.v2 = v2;
        this.cost = cost;
    }
    @Override
    public int compareTo(Edge o) {
        return this.cost - o.cost;
    }
}