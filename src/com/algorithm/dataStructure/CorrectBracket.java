package com.algorithm.dataStructure;

import java.util.*;

public class CorrectBracket {

    public static void main(String[] args) {
        CorrectBracket T = new CorrectBracket();

        Scanner sc = new Scanner(System.in);
        
        String m = sc.next();
        
        T.solution(m);
        
    }

    private void solution(String m) {
        String answer = "YES";
        Stack<Character> st = new Stack<>();
        
        for(int i=0; i<m.length();i++){
            if( '(' == m.charAt(i) ){
                st.push(m.charAt(i));
            }else{
                if(st.isEmpty() ){
                    answer = "NO";
                    break;
                }
                st.pop();
            }
        }
        if("YES".equals(answer)){

            if(!st.isEmpty() ){
                answer = "NO";
            }
        }
        System.out.println(answer);
        
    }

}
