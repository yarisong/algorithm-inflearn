package com.algorithm.twopoint;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 설명
 *
 * 현수의 아빠는 제과점을 운영합니다. 현수 아빠는 현수에게 N일 동안의 매출기록을 주고 연속된 K일 동안의 최대 매출액이 얼마인지 구하라고 했습니다.
 *
 * 만약 N=10이고 10일 간의 매출기록이 아래와 같습니다. 이때 K=3이면
 *
 * 12 1511 20 2510 20 19 13 15
 *
 * 연속된 3일간의 최대 매출액은 11+20+25=56만원입니다.
 *
 * 여러분이 현수를 도와주세요.
 *
 *
 * 입력
 * 첫 줄에 N(5<=N<=100,000)과 K(2<=K<=N)가 주어집니다.
 *
 * 두 번째 줄에 N개의 숫자열이 주어집니다. 각 숫자는 500이하의 음이 아닌 정수입니다.
 *
 *
 * 출력
 * 첫 줄에 최대 매출액을 출력합니다.
 */
public class MaxSales {

    public static void main(String [] args){
        MaxSales T = new MaxSales();

        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();
        int [] arr1 = new int[m];
        for(int i=0;i< arr1.length;i++){
            arr1[i]  = sc.nextInt();
        }

//        T.solution(m, n, arr1);
//        T.solution2(m, n, arr1);
        T.solution3(m, n, arr1);

    }
    private void solution(int n, int k, int[] arr) {
        int answer = 0;
        int sum = 0;
        
        for( int i=0; i<k; i++){
            sum += arr[i];
            answer = sum;
        }
        
        for(int i=k; i<n; i++){
            sum+= (arr[i] - arr[i-k]);
            answer = Math.max(answer, sum);
        }
        
        System.out.println(answer);
    }
    private void solution2(int m, int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        
        int tmpMax = Integer.MIN_VALUE;
        for(int i=0 ;i< m; i++){
            
            if(i == m-n-1){
                break;
            }
            int sum = 0;
            for(int j=i ; j<n+i; j++){
                sum += arr[j];
            }
            if(tmpMax < sum){
                tmpMax = sum;    
            }
        }
        
        System.out.println(tmpMax);
    }
    private void solution3(int m, int n, int[] arr) {
//        ArrayList<Integer> answer = new ArrayList<>();

        int lt =0;
        int rt =0;
        int answer = 0;
        
        for (int i=0; i<m;i ++){
            int tmp= 0;
                        
            if(i == m-n-1){
                break;
            }
            
            for(int j=i; j<n+i;j++){
                tmp += arr[j];
            }
            answer = Math.max(answer, tmp);
            
        }
        System.out.println(answer);
    }
}
