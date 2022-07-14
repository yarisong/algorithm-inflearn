package com.algorithm.arr;

import java.util.Scanner;

public class GridFindPeak {

    int [] dx = {-1,0,1,0};
    int [] dy = {0, 1,0,-1};



    int [] mx = {1, 0, -1, 0};
    int [] my = {0, 1, 0, -1};
    
    public static void main(String [] args){
        GridFindPeak T = new GridFindPeak();

        Scanner sc = new Scanner(System.in);

        int cnt = sc.nextInt();

        int [][] pt = new int[cnt][cnt];
        for(int i = 0;i <cnt; i++){
            for(int j=0;j <cnt;j++) {
                pt[i][j] = sc.nextInt();
            }
        }
        T.solution(pt, cnt);
        T.solution2(pt,cnt);
    }

    private void solution(int[][] pt, int n) {
        
        int answer = 0;
        
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                boolean flag = true;
                
                for(int k=0;k<4;k++){
                    int nx = i + dx[k];
                    int ny = j + dy[k];
                    
                    if(nx >= 0 && nx <n 
                            && ny>=0 && ny<n 
                            &&pt[nx][ny] >= pt[i][j] ){
                        flag = false;
                        break;
                    }
                }
                
                if(flag){
                    answer++;
                }
            }
        }
        System.out.println(answer);
//        boolean [][] isPass = new boolean[n][n];
        
    }

    private void solution2(int[][] pt, int n) {
    
        int answer = 0;
        boolean [][] isPass =new boolean[n][n];
        
        for(int i=0; i< n; i++){            
            for(int j=0; j<n;j++){
                
                boolean isPeak = true;
            
                
                for(int k=0;k<4;k++) {
                    int x = i + mx[k];
                    int y = j + my[k];
                    
                   if( x>=0 && y>=0 && x<n && y<n && pt[i][j] < pt[x][y] ){
                       isPeak = false;
                       break;
                   }
                }
                
                if(isPeak){
                    answer++;
                }
            }
        }
                    
        System.out.println(answer);
    }
    
}
