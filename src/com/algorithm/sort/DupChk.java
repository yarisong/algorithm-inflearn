package com.algorithm.sort;

import java.util.HashMap;
import java.util.Scanner;

public class DupChk {
    
    public static void main(String[] args){
        DupChk dupChk = new DupChk();
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int[] arr =new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        
        dupChk.solution(n, arr);
        dupChk.solution2(n, arr);
    }

    private void solution(int n, int[] arr) {
     
        HashMap<Integer, Boolean> hm =new HashMap<>();
        
        for(int x : arr){
            if(hm.containsKey(x)){
                System.out.println("D");
                return;
            }else{
                hm.put(x,true);
            }
        }
        
        System.out.println("U");
    }
    
    private void solution2(int n, int[] arr){
        
        for(int i=0; i<n;i++){
            for(int j=i+1; j<n;j++){
                if(arr[i] > arr[j] ){
                    int tmp = arr[j];
                    arr[i] = arr[j];
                    arr[j]  =tmp;
                }else if (arr[i] == arr[j]){
                    System.out.println("D");
                    return;
                }
            }
        }
        System.out.println("U");
    }
}
