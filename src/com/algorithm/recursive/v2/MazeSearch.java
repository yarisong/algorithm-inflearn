package com.algorithm.recursive.v2;

import java.util.Scanner;

public class MazeSearch {
    
    static int [][] arr = new int [8][8];
    static int [][] isPath = new int [7][7];
    static int [] dx ={-1, 0, 1, 0};
    static int [] dy = {0, 1, 0, -1};
    static int answer =0;
    
    public static void main(String [] args){
    
        MazeSearch T = new MazeSearch();
        Scanner sc = new Scanner(System.in);
        
        for(int i=1; i<8;i++){
            for(int j=1;j<8;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        arr[1][1]= 1;
        
        T.DFS(1, 1);
        System.out.println(answer);
    }

    private void DFS(int m, int n) {
        if(m == 7 && n == 7){
            answer ++;
            
        }else{
            
            for(int i=0; i<4;i++) {
                int nx = m + dx[i];
                int ny = n + dy[i];
                if(nx >= 1 && nx <= 7 && ny >=1 && ny <=7 && arr[nx][ny] == 0){
                    arr[nx][ny] = 1;
                    DFS(nx , ny);
                    arr[nx][ny] = 0;
                }
            }
            
        }
        
    }
}
