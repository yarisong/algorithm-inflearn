package com.algorithm.string;

import java.util.Scanner;

/**
 * 설명
 *
 * 소문자로 구성된 문자열이 입력되면 중복된 문자를 제거하고 출력하는 프로그램을 작성.
 * 순서는 그대로 유지한다.
 *
 * 입력
 * 첫 줄에 문자열이 입력됩니다. 문자열의 길이는 100을 넘지 않는다.
 *
 *
 * 출력
 * 첫 줄에 중복문자가 제거된 문자열을 출력합니다.
 */
public class RmDuplWord {
    
    public static void main(String [] args){
        RmDuplWord T = new RmDuplWord();
        Scanner sc = new Scanner(System.in);
        
        String str = sc.next();
        
        T.solution(str);
    }
    
    public void solution(String str){
        
        String answer = "";
        
        for(int i=0; i< str.length(); i++){
            
            if( str.indexOf(str.charAt(i)) == i) 
                answer += str.charAt(i);
        }
        
        System.out.println(answer);
    } 
}
