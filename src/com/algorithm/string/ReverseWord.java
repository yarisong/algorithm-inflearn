package com.algorithm.string;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 설명
 * N개의 단어가 주어지고 그 단어를 뒤집어 출력하는 프로그램 작성
 * 
 * 입력
 * 자연수 N이 주어지고 3<= N <= 20
 * 두번째부터는 N개의 단어가 각각 주어짐
 * 영어 알파벳으로 구성
 * 
 * 출력
 * N개의 단어를 입력된 순서대로 하나씩 뒤집어 출력한다.
 * 
 */
public class ReverseWord {

    public static void main(String[] args){
        
        ReverseWord T = new ReverseWord();
        Scanner sc = new Scanner(System.in);
        
        int cnt = sc.nextInt();
        
        String [] arr = new String[cnt];
        
        for(int i=0;i <cnt; i++){
            arr[i] = sc.next();
        }

        T.solution(arr);
        T.solution2(arr);
        T.solution3(arr);
        //System.out.println(T.solution(arr));
    }

    public void solution(String [] arr){
        for( String str : arr){
            
            String answer = "";
            
            for(char c : str.toCharArray()){
                answer = c + answer;
            }
            
            System.out.println(answer);
        }
    }
    
    public void solution2(String [] str){
        ArrayList<String> answer = new ArrayList<>();
        
        for(String x : str){
            String tmp = new StringBuilder(x).reverse().toString() ;
            
            System.out.println(tmp);
        }
    }
    
    public void solution3(String [] str){
        ArrayList<String> answer = new ArrayList<>();

        for(String x : str) {
            char[] s = x.toCharArray();

            int lt = 0;
            int rt = x.length() - 1;

            while (lt < rt) {

                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;

                lt++;
                rt--;
            }
            System.out.println(String.valueOf(s));

        }
    }
    
}
