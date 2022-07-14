package com.algorithm.hash;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SalesKind {

    public static void main(String [] args){
        SalesKind T = new SalesKind();

        Scanner sc = new Scanner(System.in);
        
        int m = sc.nextInt();
        int k = sc.nextInt();

        String [] arr = new String[m];
        for(int i=0; i<m;i++){
            arr[i] = sc.next();
        }

        T.solution(arr, k );
        T.solution2(arr, k );
    }

    private void solution(String [] arr, int k) {
                
        for(int i=0; i<= arr.length-k; i++){
            
            Map<String, Boolean> map = new HashMap<>();    
            for(int j=i; j<k+i;j++){
                
                if( !map.containsKey(arr[j])){
                    map.put( arr[j], true);
                }
            }
            
            System.out.print(map.size() + " ");
            
        }
    
    }
    
    private void solution2(String[] arr, int k){
        int lt =0;
        int rt = k-1;

        Map<String, Integer> map = new HashMap<>();
        for(int i=0; i< k; i++){
            map.put( arr[i], map.getOrDefault(arr[i], 0) +1 );
        }
        System.out.print(map.size() + " ");
        
        while(lt <  arr.length-k){

            if(map.get(arr[lt]) -1 == 0){
                map.remove(arr[lt]);
            }else {
                map.put(arr[lt], map.get(arr[lt]) - 1);
            }
            rt++;
            lt++;
            map.put( arr[rt], map.getOrDefault(arr[rt],0) +1);
            
            System.out.print(map.size() + " ");
        }
    }
}

//20 12 20 10           20 12 10 
//    12 20 10 23      
//       20 10 23 17