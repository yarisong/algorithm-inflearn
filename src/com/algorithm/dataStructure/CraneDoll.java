package com.algorithm.dataStructure;

import java.util.Scanner;
import java.util.Stack;

public class CraneDoll {
    
    public static void main(String [] args){
        CraneDoll T = new CraneDoll();
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [][] board= new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j] = sc.nextInt();
            }
        }
        
        int m = sc.nextInt();
        int [] mov = new int[m];
        for(int i=0; i<m;i++){
            mov[i] = sc.nextInt();
        }
        
        T.solution(n, m, board, mov);
    }

    private void solution(int n, int m, int[][] board, int[] mov) {
        
        int answer = 0;
        
        Stack<Integer> stack = new Stack<>();
        for(int k=0; k<m;k++){

            int dy = mov[k] -1 ;
                
            for (int j = 0; j < n; j++) {
                if (board[j][dy] == 0) {
                    continue;
                }
                if(! stack.isEmpty()){
                    if (stack.peek() == board[j][dy]) {
                        stack.pop();
                        board[j][dy] =0;
                        answer+= 2;
                        break;
                    }else {
                        stack.push(board[j][dy]);
                        board[j][dy] =0;
                        break;
                    }

                } else {
                    stack.push(board[j][dy]);
                    board[j][dy] =0;
                    break;
                }

            }
        
        }
        System.out.println(answer);
        
    }
}
