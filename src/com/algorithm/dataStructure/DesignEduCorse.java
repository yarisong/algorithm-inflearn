package com.algorithm.dataStructure;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class DesignEduCorse {
    
    public static void main(String [] args){
        DesignEduCorse T = new DesignEduCorse();
        
        Scanner sc = new Scanner(System.in);
        
        String str1 = sc.next();
        String str2 = sc.next();
        
        T.solution(str1, str2);
    }

    private void solution(String str1, String str2) {
        
        Queue<Character> queue = new LinkedList<>();

        for(char c : str1.toCharArray()){
            queue.offer(c);
        }
        for(char c: str2.toCharArray()){
            if (queue.contains(c)) {
                if(c != queue.poll()){
                    System.out.println("NO");
                    return;
                }
            }
        }
        
        if(!queue.isEmpty()){
            System.out.println("NO");
            return;
        }
        System.out.println("YES");
    }
}
