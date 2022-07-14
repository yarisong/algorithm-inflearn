package com.algorithm.sort;

import java.util.ArrayList;
import java.util.Scanner;

public class LeastRecentlyUsed {
    
    public static void main(String [] args){
        LeastRecentlyUsed T = new LeastRecentlyUsed();
        
        Scanner sc = new Scanner(System.in);
        
        int s = sc.nextInt();
        int n = sc.nextInt();
        
        int [] work = new int[n];
        for(int i=0; i<n;i++){
            work[i] = sc.nextInt();
        }
        
        T.solution(s, n, work);
    }

    private void solution(int s, int n, int[] work) {
    
        int [] cache = new int[s];
        
        for(int x: work){
            //위치
            int pos = -1;
             
            for(int i=0;i<s;i++){
                if(x == cache[i]){
                    pos =i;
                }
            }
            //중복이 없는 값인 경우
            if(pos == -1 ){
                for(int i=s-1; i>=1; i--){
                    cache[i] = cache[i-1];
                }
                cache[0] = x;
            }else{
                for(int i=pos; i>=1; i--){
                    cache[i] = cache[i-1];
                }
                cache[0] = x;
            }
            
        }
    
    }
}
