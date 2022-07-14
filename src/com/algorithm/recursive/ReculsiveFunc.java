package com.algorithm.recursive;

import java.util.Scanner;

public class ReculsiveFunc {

    public static void main(String[] args){

        ReculsiveFunc T = new ReculsiveFunc();

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        
        T.DFS(n);
    }

    private void DFS(int n) {
        if(n == 0){
            return;
        }else {
            DFS(n - 1);
            
            System.out.print(n + " ");
        }
    }


}
