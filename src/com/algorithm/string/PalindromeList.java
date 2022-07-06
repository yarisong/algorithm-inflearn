package com.algorithm.string;

import java.util.Scanner;

/**
 * 설명
 *
 * 팰린드롬 : 앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열
 * 입력된 문자열이 팰린드롬이면 "YES", 아니면 “NO"를 출력
 *
 * 대소문자를 구분하지 않습니다.
 *알파벳 이외의 문자들의 무시합니다.
 *
 *
 * 입력
 * 첫 줄에 길이 100을 넘지 않는 공백이 없는 문자열 입력
 *
 *
 * 출력
 * 첫 번째 줄에 팰린드롬인지의 결과를 YES 또는 NO로 출력.
 */
public class PalindromeList {

    public static void main(String[] args){
        PalindromeList T = new PalindromeList();
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        T.solution(str);
    }

    private void solution(String str) {
        String answer = "NO";
        
        str = str.toUpperCase().replaceAll("[^A-Z]","");
        
        String tmp = new StringBuilder(str).reverse().toString();
        
        if(str.equalsIgnoreCase(tmp)){
           answer = "YES"; 
        }
        
        System.out.println(answer);
    }
}
