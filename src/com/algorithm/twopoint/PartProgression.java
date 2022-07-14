package com.algorithm.twopoint;

import java.util.Scanner;

/**
 * 설명
 *
 * N개의 수로 이루어진 수열이 주어집니다. *
 * 이 수열에서 연속부분수열의 합이 특정숫자 M이 되는 경우가 몇 번 있는지 구하는 프로그램을 작성하세요. *
 * 만약 N=8, M=6이고 수열이 다음과 같다면
 *
 * 1 2 1 3 1 1 1 2
 *
 * 합이 6이 되는 연속부분수열은 {2, 1, 3}, {1, 3, 1, 1}, {3, 1, 1, 1}로 총 3가지입니다.
 *
 *
 * 입력
 * 첫째 줄에 N(1≤N≤100,000), M(1≤M≤100,000,000)이 주어진다. *
 * 수열의 원소값은 1,000을 넘지 않는 자연수이다.
 *
 *
 * 출력
 * 첫째 줄에 경우의 수를 출력한다.
 */
public class PartProgression {

    public static void main(String [] args){
        PartProgression T = new PartProgression();

        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();
        int [] arr1 = new int[m];
        for(int i=0;i< arr1.length;i++){
            arr1[i]  = sc.nextInt();
        }

//        T.solution(m, n, arr1);
//        T.solution2(m, n, arr1);
//        T.solution3(m, n, arr1);
        T.solution4(m, n, arr1);
    }
    
    private void solution(int n, int k, int[] arr) {
        int sum = 0;
        int answer = 0;
        
        for(int i=0; i<n ;i ++){
            for(int j=i; j<n; j++) {
                sum += arr[j];
                if (sum == k) {
                    answer++;
                    break;
                }else if (sum >k ){
                    break;
                }
            }
            sum = 0;
        }
        
        System.out.println(answer);
    }

    private void solution2(int n, int k, int[] arr) {
        
        int lt =0;
        int rt =0;
        int sum =0;
        int answer = 0;
        
        while(rt<n){ 
            sum = sum + arr[rt];
            if( sum == k){
                answer ++;
                sum = sum - arr[lt];
                lt++;
                rt++;
            }else if(sum < k){
                rt++;
            }else if(sum >k){
                sum = sum - arr[lt];
                
                if(sum ==k){
                    answer++;
                }
                lt++;
                rt++;
            }
        }
        System.out.println(answer);
    }
    
    private void solution3(int n, int k, int[] arr){
        int lt =0;
        int sum =0;
        int answer = 0;
        
        for(int rt=0; rt<n; rt++){
            sum+= arr[rt];
            
            if(sum == k){
                answer ++;
            }
            while(sum >= k){
                sum -= arr[lt++];
                if(sum == k){
                    answer++;
                }
            }
        }
        System.out.println(answer);
    }


    private void solution4(int n, int k, int[] arr){
        
        int lt=0;
        int rt=0;
        int sum = 0;
        int cnt =0;
        
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
            
            if(sum >= k) {
                while(sum >=  k){
                    if(sum == k) {
                        cnt++;
                    }
                    sum -=arr[lt++];
                }
            }
        }
        
        System.out.println(cnt);
    }
}
