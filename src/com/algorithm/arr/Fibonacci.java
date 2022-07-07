package com.algorithm.arr;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 설명
 1) 피보나키 수열을 출력한다. 피보나치 수열이란 앞의 2개의 수를 합하여 다음 숫자가 되는 수열이다.
 2) 입력은 피보나치 수열의 총 항의 수 이다. 만약 7이 입력되면 1 1 2 3 5 8 13을 출력하면 된다.


 입력
 첫 줄에 총 항수 N(3<=N<=45)이 입력된다.

 출력
 첫 줄에 피보나치 수열을 출력합니다.
 */
public class Fibonacci {

    public static void main(String[] args){
        Fibonacci T = new Fibonacci();

        Scanner sc = new Scanner(System.in);

        int cnt = sc.nextInt();

        T.solution(cnt);
    }

    private void solution(int cnt) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(1);

        for (int i=2; i<cnt; i++){
            arrayList.add(arrayList.get(i-1) + arrayList.get(i-2) );
        }
        for(Integer i : arrayList){
            System.out.print(i) ;
            System.out.print(" ");
        }
    }
}
