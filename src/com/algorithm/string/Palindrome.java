package com.algorithm.string;

import java.util.Scanner;

public class Palindrome {
    
    public static void main(String[] args){
        Palindrome T = new Palindrome();
        Scanner sc = new Scanner(System.in);
        
        String str = sc.next();
        
        T.solution(str);
        T.solution2(str);
        T.solution3(str);
    }

    private void solution(String str) {
        
        str = str.toUpperCase();
        int lt = 0;
        int rt = str.length()-1;
        String answer = "YES";
        while(lt < rt){
            if(str.charAt(lt) != str.charAt(rt) ){
                answer = "NO";
                break;
            }
            lt ++;
            rt --;
        }
        
        System.out.println(answer);
    }
    
    private void solution2(String str){

        str = str.toUpperCase();

        String answer = "YES";
        
        for(int i=0 ; i<str.length()/2; i++){
            if(str.charAt(i)!= str.charAt(str.length()-i-1)){
                answer = "NO";
                break;
            }
        }

        System.out.println(answer);
    }
    
    private void solution3(String str){
        str = str.toUpperCase();

        String answer = "YES";
        String tmp = new StringBuilder(str).reverse().toString();
        
        if(!str.equals(tmp)){
            answer = "NO";
        }
        
        System.out.println(answer);
    }
}
