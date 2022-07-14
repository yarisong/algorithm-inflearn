package com.algorithm.dataStructure;

import java.util.*;

public class SavePrincess {
    
    public static void main(String [] args){
        SavePrincess T = new SavePrincess();
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        T.solution(n,k);
                
        
    }

    private void solution(int n, int k) {

        Queue<Integer> que = new LinkedList<>();
        
        for(int i=1;i<=n;i++){
            que.offer(i);
        }
        
        int  idx =0;
        while(que.size() != 1){
            idx++;            
            if(idx == 3){
                que.poll();
                idx = 0 ;
            }else{
                que.offer( que.poll() );    
            }
        }
        System.out.println(que.peek());
    }
}
