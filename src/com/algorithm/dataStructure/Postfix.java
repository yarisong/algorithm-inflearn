package com.algorithm.dataStructure;

import java.util.*;

public class Postfix {
    public static void main(String[] args){

        Postfix T = new Postfix();
        Scanner sc  = new Scanner(System.in);
        
        String m = sc.next();
        
        T.solution(m);
        T.solution2(m);
    }

    private void solution(String m) {
        
        Stack<Integer> st =new Stack<>();
        
        ArrayList<Character> c = new ArrayList<>();
        c.add('+');
        c.add('-');
        c.add('*');
        c.add('/');
        
        int answer = 0;
        for(int i=0; i<m.length();i++){
            if(  c.contains(m.charAt(i))){
                if( answer == 0){
                    int a = st.peek();
                    st.pop();
                    int b =st.peek();
                    st.pop();
                    
                    answer = calc(a, b, m.charAt(i));
                }else{
                    int a = st.peek();
                    st.pop();
                    answer = calc(answer, a, m.charAt(i));   
                }
                
            }else{
                int a = m.charAt(i) - '0';
                st.push( a );
            }
        }
        
        System.out.println(answer);
        
    }
    private void solution2(String str) {
        int answer = 0;
        
        Stack<Integer> stack = new Stack<>();
        
        for(char x: str.toCharArray()){
            if(Character.isDigit(x)){
                stack.push(x-'0');
            }else{
                int rt = stack.pop();
                int lt = stack.pop();
                stack.push( calc(lt, rt, x));
            }
        }
        System.out.println(stack.get(0));
    }
    public int calc(int a, int b, char c){
        if(c == '+'){
            return  a+b;
        } else if(c == '-'){
            return a-b;
        } else if(c == '*'){
            return a*b;
        } else{
            return a/b;
        }
    }
}
