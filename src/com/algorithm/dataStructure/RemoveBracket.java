package com.algorithm.dataStructure;

import java.util.Scanner;
import java.util.Stack;

public class RemoveBracket {
    
    public static void main(String [] args){
        RemoveBracket T = new RemoveBracket();
        
        Scanner sc = new Scanner(System.in);

        String m = sc.next();

        T.solution(m);

    }

    private void solution(String m) {
        
        Stack<Character> st = new Stack<>();
        String answer = "";
        
        for( char x : m.toCharArray()){
            if( x == '('){
                st.push(x);
            }else {
                if( st.isEmpty()){
                    answer += String.valueOf(x);
                }else if(x == ')'){
                    st.pop();
                }
            }
            
        }
        
        System.out.println(answer);
    }
    
    private  void solution2(String str){
        String answer ="";
        Stack<Character>  stack = new Stack<>();
        
    }
}
