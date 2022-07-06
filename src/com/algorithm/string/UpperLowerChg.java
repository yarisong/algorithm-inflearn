package com.algorithm.string;

import java.util.Scanner;

/**
 * 대소문자 변환
 * 
 * 설명
 * 대문자와 소문자가 같이 존재하는 문자열이 존재한다.
 * 대문자는 소문자로, 소문자는 대문자로 변환하여 출력하는 프로그램 작성
 * 
 * 입력
 * 첫 줄에 문자열이 입력된다. 
 * (문자열의 길이는 100을 넘을 수 없다.)
 * 문자열은 영어 알파벳이다
 * 
 * 출력
 * 첫 줄에 대문자는 소문자로, 소문자는 대문자로 변환된 문자열이 출력된다.
 * 
 */
public class UpperLowerChg {

    public static void main(String [] args){

        UpperLowerChg T = new UpperLowerChg();
        
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        
        System.out.println(T.solution(str));
    }
    
    public String solution(String str){

        String newStr = "";

        for(char c : str.toCharArray()){
            if( Character.isUpperCase(c)){
                newStr += Character.toLowerCase(c);
            }else{
                newStr += Character.toUpperCase(c);
            }
        }
        
        return newStr; 
    }
}
