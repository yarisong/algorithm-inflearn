package com.algorithm.string;

import java.util.Scanner;

/**
 * 설명
 *
 * 한 개의 문자열 s와 문자 t가 주어지면 문자열 s의 각 문자가 문자 t와 떨어진 최소거리를 출력하는 프로그램을 작성하세요.
 *
 *
 * 입력
 * 첫 번째 줄에 문자열 s와 문자 t가 주어진다. 문자열과 문자는 소문자로만 주어집니다.
 *
 * 문자열의 길이는 100을 넘지 않는다.
 *
 *
 * 출력
 */
public class DistBetweenCharc {
    
        public static void main(String[] args){
            DistBetweenCharc T = new DistBetweenCharc();
            
            Scanner sc = new Scanner(System.in);
            
            String str = sc.next();
            
            char c = sc.next().charAt(0);
            
            T.solution(str, c);
            T.solution2(str, c);
        }

        private void solution(String targetStr, char c) {
                                    
            String answer = "";
            for(int i=0;i<targetStr.length();i++){
                int lt = i-1;
                int rt = i+1;
                int dist = 0;
                
                while(rt <targetStr.length()){
                    
                    if(c == targetStr.charAt(i))
                        break;
                    
                    dist++; 
                    
                    //왼쪽
                    if(lt >= 0){
                        if( targetStr.charAt(lt) == c) 
                            break; 
                    }
                    if(rt >= 0){
                        if( targetStr.charAt(rt) == c)
                            break;
                    }
                    lt --;
                    rt ++;
                }
                answer += dist +" ";
            }
            
            System.out.println(answer.trim());
            
        }
        
        private void solution2(String targetStr, char c) {
            
            int [] answer = new int[targetStr.length()];
            int p = 1000;
            
            for(int i=0; i<targetStr.length(); i++){
                
                if(targetStr.charAt(i) == c ){
                    p = 0;
                }else{
                    p++;
                }
                
                answer[i] = p;
            }
            
            p = 1000;
            for(int i=targetStr.length()-1; i>=0; i--){
                
                if(targetStr.charAt(i) == c){
                    p =0;
                }else{
                    p++;
                    answer[i] = Math.min(answer[i], p);
                }
            }
            for(int x : answer){
                System.out.print(x + " ");
            }
        }
}
