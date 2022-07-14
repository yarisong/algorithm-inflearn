package com.algorithm.dataStructure;

import java.util.Scanner;
import java.util.Stack;

public class IronBar {
    
    public static void main(String [] args){

        IronBar T = new IronBar();
        
        Scanner sc = new Scanner(System.in);
        
        String str = sc.next();
        
        T.solution(str);
    }

    private void solution(String str) {
        
        Stack<Character> stack = new Stack<>();
        int answer =0;
        
        for(char x: str.toCharArray()){
            
            if( x== ')'){
                if(stack.peek() == '(') {
                    stack.pop();
                    answer += stack.size();
                }else{
                    answer += 1;
                    stack.pop();
                }
            }else{
                stack.push(x);
            }
        }
        System.out.println(answer);
    }
// () (((() () ) ( () )()))(())


}
