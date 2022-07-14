package com.algorithm.twopoint;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * 설명
 *
 * 오름차순으로 정렬이 된 두 배열이 주어지면 두 배열을 오름차순으로 합쳐 출력하는 프로그램을 작성하세요.
 *
 *
 * 입력
 * 첫 번째 줄에 첫 번째 배열의 크기 N(1<=N<=100)이 주어집니다. *
 * 두 번째 줄에 N개의 배열 원소가 오름차순으로 주어집니다. *
 * 세 번째 줄에 두 번째 배열의 크기 M(1<=M<=100)이 주어집니다. *
 * 네 번째 줄에 M개의 배열 원소가 오름차순으로 주어집니다. *
 * 각 리스트의 원소는 int형 변수의 크기를 넘지 않습니다. *
 *
 * 출력
 * 오름차순으로 정렬된 배열을 출력합니다.
 */
public class CombineArray {
    
    public static void main(String [] args){
        CombineArray T = new CombineArray();
        
        Scanner sc = new Scanner(System.in);
        
        int m = sc.nextInt();
        int [] arr1 = new int[m];
        for(int i=0;i< arr1.length;i++){
            arr1[i]  = sc.nextInt();
        }
        
        int n = sc.nextInt();
        int [] arr2 = new int[n];
        for(int i=0;i< arr2.length;i++){
            arr2[i]  = sc.nextInt();
        }
        
//        T.solution(m, n, arr1, arr2);
        T.solution2(m, n, arr1, arr2);
        
    }

    private void solution(int n, int m, int[] arr1, int[] arr2) {
        ArrayList<Integer> answer = new ArrayList<>();
        
        int p1 = 0;
        int p2 = 0;
        
        while(p1<n && p2<m){
            
            if(arr1[p1] < arr2[p2]){
                answer.add(arr1[p1]);
                p1++;
            }else {
                answer.add(arr2[p2]);
                p2++;
            }
        }
        
        while (p1 < n){
            answer.add(arr1[p1]);
            p1++;
        }
        
        while(p2 < m){
            answer.add(arr2[p2]);
            p2++;
        }
        
        for(int i=0; i<answer.size();i++){
            System.out.print(answer.get(i) + " ")    ;
        }
        
    }

    private void solution2(int n, int m, int[] arr1, int[] arr2) {
        int f1 = 0;
        int f2 = 0;
        ArrayList<Integer> arr =new ArrayList<>();
        
        while(f1 <n && f2<m ){
                
            if(arr1[f1] > arr2[f2]){
                arr.add( arr2[f2]) ;
                f2++;
            }else{
                arr.add( arr1[f1]) ;
                f1++;
            }
        }
        
        while(f1<n){
            arr.add(arr1[f1]);
            f1++;
        }

        while(f2<m){
            arr.add(arr2[f2]);
            f2++;
        }
        
        for(int i=0; i<arr.size();i++){
            System.out.print(arr.get(i) + " ")    ;
        }
    }
}
