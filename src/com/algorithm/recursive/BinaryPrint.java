package com.algorithm.recursive;

import java.util.Scanner;

public class BinaryPrint {

    public static void main(String[] args){

        BinaryPrint T = new BinaryPrint();

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        T.DFS(n);
    }

    private void DFS(int n) {
      
        if(n==0){
            return;
        }else{
            DFS(n/2);
            System.out.print(n%2+ " ");
        }
    }
}
