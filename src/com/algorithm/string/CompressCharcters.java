package com.algorithm.string;

import java.util.Scanner;

/**
 * 설명
 *
 * 알파벳 대문자로 이루어진 문자열을 입력받아 같은 문자가 연속으로 반복되는 경우 반복되는
 * 문자 바로 오른쪽에 반복 횟수를 표기하는 방법으로 문자열을 압축하는 프로그램을 작성하시오.
 * 단 반복횟수가 1인 경우 생략합니다.
 *
 *
 * 입력
 * 첫 줄에 문자열이 주어진다. 문자열의 길이는 100을 넘지 않는다.
 *
 *
 * 출력
 * 첫 줄에 압축된 문자열을 출력한다.
 */
public class CompressCharcters {
    
    private int compCnt = 1;
    private String answer = "";
    
    public static void main(String [] args){

        CompressCharcters T = new CompressCharcters();
        
        Scanner sc = new Scanner(System.in);
        
        String str = sc.next();

        char[] c = str.toCharArray();
        System.out.println(T.solution(c, 0));

        
        T.solution2(str);
        
    }

    private String  solution(char [] s, int idx) {

        if(idx == s.length-1 ){
            if(compCnt ==1 ){
                answer = answer + s[idx];
            }else {
                answer = answer + s[idx] + compCnt;
            }
            return answer ;
        }else if ( s[idx]== s[idx + 1 ]) {
            compCnt++;
        }else{
            if(compCnt ==1 ){
                answer = answer + s[idx];
            }else {
                answer = answer + s[idx] + compCnt;
            }
            compCnt = 1;
        }
        
        idx ++;
        
        if(s.length > idx){
            this.solution(s, idx);
        }
        return answer;
    }
    
    private void solution2(String s){
        answer = "";
        
        s= s+ " ";
        int cnt = 1;
        for(int i=0 ; i <s.length()-1 ;i ++){
            if(s.charAt(i) == s.charAt(i+1)){
                cnt ++;
            }else{
                answer += s.charAt(i);
                if(cnt>1){
                    answer += String.valueOf(cnt);
                    cnt = 1;
                }
            }
        }
        
        System.out.println(answer);
    }
}
