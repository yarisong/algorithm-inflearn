package com.algorithm.recursive;

import java.util.ArrayList;
import java.util.Scanner;

public class FindPathList {
    static int n, m, answser =0;
    static ArrayList<ArrayList<Integer>> graph;
    static int [] ch;

    public static void main(String [] args) {
        FindPathList t = new FindPathList();

        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();
        
        graph = new ArrayList<ArrayList<Integer>>();
        for(int i=-0;i<=n;i++){
            graph.add(new ArrayList<Integer>());
        }
        ch = new int[n+1];
        for(int i=0; i<m; i++){
            int a= sc.nextInt();
            int b = sc.nextInt();
            graph.get(a).add(b);
        }
        ch[1] = 1;
        t.DFS(1);
        System.out.println(answser);
    }
    
    public void DFS(int v){
         if(v == n) {
             answser++;
         }else{
             for(int nv : graph.get(v)){
                 if(ch[nv] == 0){
                     ch[nv] =1;
                     DFS(nv)   ;
                     ch[nv] =0;
                 }
             }
         }
    }
}
