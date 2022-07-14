package com.algorithm.twopoint;

import java.util.Scanner;

/**
 * 설명
 *
 * 0과 1로 구성된 길이가 N인 수열이 주어집니다. 여러분은 이 수열에서 최대 k번을 0을 1로 변경할 수 있습니다. 여러분이 최대 k번의 변경을 통해 이 수열에서 1로만 구성된 최대 길이의 연속부분수열을 찾는 프로그램을 작성하세요.
 *
 * 만약 길이가 길이가 14인 다음과 같은 수열이 주어지고 k=2라면
 *
 * 1 1 0 0 1 1 0 1 1 0 1 1 0 1
 *
 * 여러분이 만들 수 있는 1이 연속된 연속부분수열은
 *
 * Image1.jpg
 *
 * 이며 그 길이는 8입니다.
 *
 *
 * 입력
 * 첫 번째 줄에 수열의 길이인 자연수 N(5<=N<100,000)이 주어집니다.
 *
 * 두 번째 줄에 N길이의 0과 1로 구성된 수열이 주어집니다.
 *
 *
 * 출력
 * 첫 줄에 최대 길이를 출력하세요.
 */
public class MaxPartProgression {

    public static void main(String[] args) {
        MaxPartProgression T = new MaxPartProgression();

        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();
        int[] arr1 = new int[m];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }

//        T.solution(m, n, arr1);
        T.solution3(m, n, arr1);

    }

    private void solution(int n, int k, int[] arr) {

        int answer = 0;
        int lt = 0;
        int cnt = 0;
        int len = 0;

        for (int rt = 0; rt < n; rt++) {


            if (arr[rt] == 0) {
                cnt++;

                if (cnt > k) {
                    answer = Math.max(answer, len);

                    while (arr[lt] != 0) {
                        lt++;
                        len--;
                    }
                    lt++;
                    len--;
                }
            }
            len++;

        }
        answer = Math.max(answer, len);

        System.out.println(answer);
    }


    private void solution2(int n, int k, int[] arr) {

        int answer = 0;
        int cnt = 0;
        int lt = 0;

        for (int rt = 0; rt < n; rt++) {
            if (arr[rt] == 0) {
                cnt++;
                while (cnt > k) {
                    if (arr[lt] == 0) {
                        cnt--;
                    }
                    lt++;
                }
                answer = Math.max(answer, rt - lt + 1);
            }
        }
    }


    private void solution3(int n, int k, int[] arr) {
        int lt = 0;
        int cnt = 0;
        int answer = 0;
        int temp = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == 0) {
                cnt++;
            }
            if (cnt > k) {
                answer = Math.max(answer, temp);
                for (int j = lt; j < n; j++) {

                    temp--;
                    if (arr[j] == 0) {
                        cnt--;
                        lt = j + 1;
                        break;
                    }
                }
            }
            temp++;
        }
        answer = Math.max(answer, temp);
        System.out.println(answer);
    }
}