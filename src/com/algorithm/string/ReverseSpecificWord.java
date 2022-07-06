package com.algorithm.string;

import java.util.Scanner;

/**
 * 설명
 * 영어 알파벳과 특정문자로 구성된 문자열이 주어진다.
 * 주어진 문자열 중 영어 알파벳에 대해서만 뒤집고 특수문자는 그대로 둔 프로그램을 작성해라
 * 
 * 입력 
 * 첫줄에 100을 넘지 않는 문자열이 주어진다.
 * 
 * 출력
 * 첫 줄에 알파벳만 뒤집힌 문자열을 출력한다.
 */
public class ReverseSpecificWord {
    
    public static void main(String[] args) {
        ReverseSpecificWord T = new ReverseSpecificWord();
        
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        
        T.solution(str);
    }

    public void solution(String str) {
    
        int lt = 0;
        int rt = str.length()-1;
        char [] c = str.toCharArray();
        
        while(lt < rt){
            
            if( !Character.isAlphabetic( c[lt]) ) {
                lt ++;                
            }else if (!Character.isAlphabetic( c[rt])) {
                rt --;
            }else {
                char tmp = c[lt];
                
                c[lt] = c[rt];
                c[rt] = tmp;
                
                lt ++;
                rt --;
            }
        }
        System.out.println( String.valueOf(c));
    }
}
