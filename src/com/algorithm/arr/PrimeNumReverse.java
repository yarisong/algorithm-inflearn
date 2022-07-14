package com.algorithm.arr;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 설명
 *
 * N개의 자연수가 입력되면 각 자연수를 뒤집은 후 그 뒤집은 수가 소수이면 그 소수를 출력하는 프로그램을 작성하세요.
 * 예를 들어 32를 뒤집으면 23이고, 23은 소수이다. 그러면 23을 출력한다. 단 910를 뒤집으면 19로 숫자화 해야 한다.
 * 첫 자리부터의 연속된 0은 무시한다.
 *
 *
 * 입력
 * 첫 줄에 자연수의 개수 N(3<=N<=100)이 주어지고, 그 다음 줄에 N개의 자연수가 주어진다.
 *
 * 각 자연수의 크기는 100,000를 넘지 않는다.
 *
 *
 * 출력
 * 첫 줄에 뒤집은 소수를 출력합니다. 출력순서는 입력된 순서대로 출력합니다.
 * 
 */
public class PrimeNumReverse {
    
    public static void main(String [] args){
        PrimeNumReverse T = new PrimeNumReverse();
        
        Scanner sc = new Scanner(System.in);
        
        int cnt = sc.nextInt();
        
        String [] arr = new String[cnt];
        
        for(int i=0 ; i< cnt;i ++){
            arr[i] = sc.next();
        }

        T.solution(arr);
        T.solution2(cnt, arr);
        T.solution3(arr);
    }

    private void solution(String[] arr) {

        StringBuilder answer = new StringBuilder();
        
        for(int i=0; i<arr.length; i++){
            StringBuilder sb = new StringBuilder();
            int tgtNum = Integer.parseInt(sb.append(arr[i]).reverse().toString());
            
            if(tgtNum == 1 ){
                continue;
            }
            
            boolean isPrime = true;
            for(int j=2; j< tgtNum/2; j++){
                if(tgtNum % j == 0){
                    isPrime = false;
                    break;
                }
            }
            
            if(isPrime){
                answer.append(tgtNum +" ");
            }
            
        }
        
        System.out.println(answer.toString());
    }

    private void solution2(int n, String [] arr){
        ArrayList<Integer> answer = new ArrayList<>();
        
        for(int i=0; i<n; i++){
            int tmp = Integer.parseInt(arr[i]);
            int res =0;
            while(tmp > 0){
                int t = tmp%10;
                res = res*10+ t;
                tmp = tmp/10;
            }
            
            if(isPrime(res)) {
                answer.add(res);
            }
        }
        
        for(int i=0; i<answer.size();i++){
            System.out.print(answer.get(i) + " ");
        }
    }

    private boolean isPrime(int num) {
        if(num == 1){
            return false;
        }
        for(int i=2; i<num; i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }

    public void solution3(String [] arr){

        int target = 0;
        for(int i=0; i< arr.length; i++){
            StringBuilder sb = new StringBuilder();
            target = Integer.parseInt(sb.append(arr[i]).reverse().toString());
            
            if(target == 1){
                continue;
            }
            boolean isPrime = true;
            for(int j=2; j< target/2 ; j++){
                if(target%j == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.print(target + " ");
            }
        }
    }
    
    public void solution4(String [] arr){
        
    }
}
