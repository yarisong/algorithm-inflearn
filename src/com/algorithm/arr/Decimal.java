package com.algorithm.arr;

import java.util.Scanner;

/**
 * 설명
 *
 * 자연수 N이 입력되면 1부터 N까지의 소수의 개수를 출력하는 프로그램을 작성하세요.
 * 만약 20이 입력되면 1부터 20까지의 소수는 2, 3, 5, 7, 11, 13, 17, 19로 총 8개입니다.
 *
 *
 * 입력
 * 첫 줄에 자연수의 개수 N(2<=N<=200,000)이 주어집니다.
 *
 *
 * 출력
 */
public class Decimal{

        public static void main(String[] args){

            Decimal T = new Decimal();

            Scanner sc = new Scanner(System.in);

            int cnt = sc.nextInt();

            T.solution(cnt);
        }

        private void solution(int cnt) {
            int answer =0;
            // 0, 1, 2, 3, 4, ......19, 20
            int [] num = new int[cnt+1];

            for(int i=2; i< cnt; i++){
                if(num[i] == 0){
                    answer++;
                    for(int j=i ;j<=cnt; j= i+j){
                        num[j] = 1;
                    }
                }
            }
            System.out.println(answer);
        }
}
