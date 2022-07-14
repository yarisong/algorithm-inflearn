package com.algorithm.twopoint;

import java.util.Scanner;

/**
 * 설명
 *
 * N입력으로 양의 정수 N이 입력되면 2개 이상의 연속된 자연수의 합으로 정수 N을 표현하는 방법의 가짓수를 출력하는 프로그램을 작성하세요.
 *
 * 만약 N=15이면
 *
 * 7+8=15
 *
 * 4+5+6=15
 *
 * 1+2+3+4+5=15
 *
 * 와 같이 총 3가지의 경우가 존재한다.
 *
 *
 * 입력
 * 첫 번째 줄에 양의 정수 N(7<=N<1000)이 주어집니다.
 *
 *
 * 출력
 */
public class SeqNumSum {

    public static void main(String [] args){
        SeqNumSum T = new SeqNumSum();

        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();

        T.solution(m);

    }

    private void solution(int n){

        int sum = 1;
        int answer = 0;
        int lt =1;
        
        for(int rt=2; rt<=n/2+1 ;rt++){
            
            sum += rt;
            if(sum == n){
                answer ++;
            }
            while(sum >= n){
                sum = sum - lt;
                
                if(sum == n){
                    answer ++;
                }
                lt ++; 
            }
            
        }
        
        System.out.println(answer);
        
    }

    private void solution2(int n){
        
        
    }
}
