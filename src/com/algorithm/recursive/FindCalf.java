package com.algorithm.recursive;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class FindCalf {

    public static void main(String [] args){
        FindCalf t = new FindCalf();
        
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int e = sc.nextInt();
        
        t.BFS(s,e);
        
    }

    private void BFS(int s, int e) {
        
        int[] ch = new int[10001];
        ch[s] =1;
        int[] dis = {1, -1, 5};
        int l =0 ;
        Queue<Integer> que = new LinkedList<>();
        que.offer(s);
        
        while(!que.isEmpty()){
            int len = que.size();
            for(int i=0; i<len;i++){
                int x = que.poll();
                
                
                
                for(int j=0;j<3;j++){
                    int nx= x +dis[j];

                    if(nx == e){
                        System.out.println(l+1);
                        return;
                    }

                    if(nx>=1 && nx <= 10000 && ch[nx]== 0){
                        ch[nx] =1;
                        que.offer(nx);
                    }
                }
            }
            l++;
        }
        
        
        
    }

}
