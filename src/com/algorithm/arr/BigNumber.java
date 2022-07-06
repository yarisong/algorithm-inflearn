package com.algorithm.arr;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 설명
 *
 * N개의 정수를 입력받아, 자신의 바로 앞 수보다 큰 수만 출력하는 프로그램을 작성하세요.
 * (첫 번째 수는 무조건 출력한다)
 *
 *
 * 입력
 * 첫 줄에 자연수 N(1<=N<=100)이 주어지고, 그 다음 줄에 N개의 정수가 입력된다.
 *
 *
 * 출력
 * 자신의 바로 앞 수보다 큰 수만 한 줄로 출력한다.
 */
public class BigNumber {
    
    public static void main(String[] args){

        BigNumber T = new BigNumber();
        
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        
        Integer[] arr = new Integer[num];
        
        for(int i=0;i<num;i++){
            arr[i] = sc.nextInt();     
        }
        
        T.solution(num, arr);
    }

    private void solution(int num, Integer[] arr) {
        
   
        String answer = "";
        
        for(int i=0; i< arr.length; i++){

            if(i==0) {
                answer = arr[i] + " ";
            }else if( arr[i] > arr[i-1]){
                answer += arr[i] + " ";
            }
            
        }
        System.out.println(answer);
    }
}
