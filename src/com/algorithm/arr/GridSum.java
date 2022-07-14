package com.algorithm.arr;


import java.util.Scanner;

/**
 *   설명
 *
 * 5*5 격자판에 숫자가 적혀있습니다.
 *
 * N*N의 격자판이 주어지면 각 행의 합, 각 열의 합, 두 대각선의 합 중 가 장 큰 합을 출력합니다.
 *
 *
 * 입력
 * 첫 줄에 자연수 N이 주어진다.(2<=N<=50)
 *
 * 두 번째 줄부터 N줄에 걸쳐 각 줄에 N개의 자연수가 주어진다. 각 자연수는 100을 넘지 않는다.
 *
 *
 * 출력
 * 최대합을 출력합니다.
 */
public class GridSum {
    public static void main(String [] args){
        GridSum T = new GridSum();

        Scanner sc = new Scanner(System.in);

        int cnt = sc.nextInt();

        int [][] pt = new int[cnt][cnt];
        for(int i = 0;i <cnt; i++){
            for(int j=0;j <cnt;j++) {
                pt[i][j] = sc.nextInt();
            }
        }

        for(int i = 0;i <cnt; i++){
            for(int j=0;j <cnt;j++) {
                System.out.print(pt[i][j]+ " ");
            }
        }

        T.solution(pt, cnt);
        T.solution2(pt, cnt);
    }

    private void solution(int[][] pt, int n) {


        int sum1, sum2 ;
        int answer = Integer.MIN_VALUE;
        
        for(int i=0; i<n; i++){
            
            sum1 = 0;
            sum2 = 0;
            
            for(int j=0; j<n; j++){
                sum1 = sum1 + pt[i][j];
                sum2 = sum2 + pt[j][i];
            }
            
            answer = Math.max(answer, sum1);
            answer = Math.max(answer, sum2);
        }
        
        sum1 = 0;
        sum2 = 0;
        for(int i=0;i<n;i++){
            sum1 += pt[i][i];
            sum2 += pt[i][n-i-1];
        }
        answer = Math.max(answer, sum1);
        answer = Math.max(answer, sum2);
        
        System.out.println(answer);
        
    }

    private void solution2(int[][] pt, int n) {
     
        
        int sum3=0;
        int sum4=0;
        
        int answer = 0;
        
        for(int i=0; i<n;i++){
            int sum1=0;
            int sum2=0;
            
            for(int j=0;j<n;j++){
                sum1 += pt[i][j];
                sum2 += pt[j][i];
            }
            answer =Math.max(sum1, sum2);
        }
        
        
        // 00 11 22 33 44 
        // 04 13 22 31 40
        for(int i=0; i<n ; i++){
            sum3 += pt[i][i];   //   0     1 2   3  4
            sum4 += pt[i][n - i-1]; // 4-0 4-1 4-2 4-3 4-4
        }
        
        answer = Math.max(answer, sum3);
        answer = Math.max(answer, sum4);
        
        System.out.println(sum3);
    }
}
