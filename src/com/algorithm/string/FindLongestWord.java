package com.algorithm.string;

import java.util.Scanner;

/**
 * 한개의 문장에서 가장 긴 단어를 출력하는 프로그램 작성
 * 문장속의 각 단어는 공백으로 구분
 * 
 * 입력
 * - 첫줄에 길이가  100이하의 문장이 주어짐
 * - 영어 알파벳으로 구성됨
 * 
 * 출력
 * 가장 긴 단어를 출력한다.
 */
public class FindLongestWord {

    public static void main(String[] args){

        FindLongestWord T = new FindLongestWord();
        
        Scanner in = new Scanner(System.in);
        
        String str = in.nextLine();
        
        System.out.println(T.solution(str));
        System.out.println(T.solution2(str));

    }

    public String solution(String str){
        
        String tmpStr ="";
        
        for( String targetStr: str.split(" ")){
            
            if("".equals(tmpStr)) tmpStr = targetStr;
            
            if(tmpStr.length() < targetStr.length()){
                tmpStr = targetStr;
            }
        }
        return tmpStr;
    }

    public String solution2(String str){

        String tmpStr ="";

        int m=Integer.MAX_VALUE, pos;

        while((pos=str.indexOf(' ')) !=-1){
            String tmp = str.substring(0, pos);

            int len = tmp.length();
            if(len > m){
                m = len;
                tmpStr = tmp;
            }
            str = str.substring(pos+1);
        }
        if(str.length() > m) tmpStr = str;

        return tmpStr;
    }
}
