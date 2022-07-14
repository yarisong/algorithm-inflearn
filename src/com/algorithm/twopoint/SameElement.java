package com.algorithm.twopoint;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 설명
 *
 * A, B 두 개의 집합이 주어지면 두 집합의 공통 원소를 추출하여 오름차순으로 출력하는 프로그램을 작성하세요.
 *
 *
 * 입력
 * 첫 번째 줄에 집합 A의 크기 N(1<=N<=30,000)이 주어집니다.
 *
 * 두 번째 줄에 N개의 원소가 주어집니다. 원소가 중복되어 주어지지 않습니다.
 *
 * 세 번째 줄에 집합 B의 크기 M(1<=M<=30,000)이 주어집니다.
 *
 * 네 번째 줄에 M개의 원소가 주어집니다. 원소가 중복되어 주어지지 않습니다.
 *
 * 각 집합의 원소는 1,000,000,000이하의 자연수입니다.
 *
 *
 * 출력
 */
public class SameElement {
    public static void main(String [] args){
        SameElement T = new SameElement();

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int [] arr1 = new int[n];
        for(int i=0;i< arr1.length;i++){
            arr1[i]  = sc.nextInt();
        }

        int m = sc.nextInt();
        int [] arr2 = new int[m];
        for(int i=0;i< arr2.length;i++){
            arr2[i]  = sc.nextInt();
        }

//        T.solution(m, n, arr1, arr2);
//        T.solution2(m, n, arr1, arr2);
        T.solution3(m, n, arr1, arr2);

    }

    private void solution2(int n, int m, int[] arr1, int[] arr2) {
        ArrayList<Integer> answer = new ArrayList<>();

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        int p1=0;
        int p2=0;
        
        while(p1<n && p2<m){
            if(arr1[p1] ==arr2[p2]){
                answer.add(arr1[p1]);
                p1++;
                p2++;
            }else if(arr1[p1] < arr2[p2] ){
                p1++;
            }else{
                p2++;
            }
        }
        for(int x:answer) {
            System.out.print(x + " ");
        }
    }

    private void solution3(int n, int m, int[] arr1, int[] arr2) {
        
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        int f1= 0;
        int f2 = 0;
        ArrayList<Integer> arr =new ArrayList<>();
        
        while(f1 <n && f2<m){
            
            if(arr1[f1] > arr2[f2] ){
                f2++;
            }else if(arr1[f1] == arr2[f2]){
                
                arr.add(arr1[f1]);
                f1++;
                f2++;
            }else{
                f1++;
            }
        }
        for(int x: arr) {
            System.out.print(x + " ");
        }
    }
}
