package com.algorithm.hash;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PeerLeader {

    public static void main(String [] args){
        PeerLeader T = new PeerLeader();
        
        Scanner sc = new Scanner(System.in);
        
        int m = sc.nextInt();
        //String[] arr = new String[m];
         String ls = sc.next();
         
         T.solution(ls);
        
    }

    private void solution(String ls) {
        
        char [] c = ls.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        
        
        for(int i=0; i<c.length ; i++){
            
            
            map.put( c[i], map.getOrDefault(c[i], 0) +1) ;
        }
        String answer ="";
        int tmp = 0;
        for(char x: map.keySet()){            
            if(tmp < map.get(x)){
                tmp = map.get(x);
                answer = String.valueOf(x);
            }
        }
        
        System.out.println(answer);
        
    }
}
