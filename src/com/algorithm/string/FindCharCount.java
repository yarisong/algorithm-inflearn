package com.algorithm.string;

import java.util.Scanner;

/**
 * 설명
 * 1. 한개의 문자열을 입력받음
 * 2. 특정 문자 한개를 입력받은 후 특정 문자가  입력받은 문자열에
 *    몇개 존재하는지 알아내시오
 * 3. 대소문자를 구분하지 않고 문자열의 길이는 100을 넘지 않는다.
 * 
 * 입력
 * 첫 줄에 문자열이 주어지고, 두번째 줄에 문자가 주어진다.
 * 문자열은 영어 알파벳으로만 구성된다.
 * 
 * 출력
 * 첫 줄에 해당 문자의 개수를 출력
 */
public class FindCharCount {
    
    public static void main(String [] args){
        FindCharCount T = new FindCharCount();        
        
        Scanner in=new Scanner(System.in);
        
        String str = in.next();
        char c = in.next().charAt(0);
        
        System.out.println(T.solution(str, c));        
        
        return ;
        
    }
    
    public int solution(String str, char t){
        int answer = 0;
        
        str = str.toUpperCase();
        t = Character.toUpperCase(t);
        
        for(char x : str.toCharArray()){
            if(x == t) answer ++;
        }
        
        return answer;
    }
}
