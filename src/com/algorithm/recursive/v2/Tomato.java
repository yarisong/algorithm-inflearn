package com.algorithm.recursive.v2;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Tomato {
    static int [][] arr;
    static int [][] day;
    static Queue<Point1> q ;
    static int [] dx ={-1, 0, 1, 0};
    static int [] dy = {0, 1, 0, -1};
    static int m, n;
    static int answer;
//    static int [][] gd;
    
    public static void main(String [] args){
        
        Tomato T = new Tomato();
        
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m =sc.nextInt();
        
        arr = new int[m][n];
        day = new int[m][n];
//        gd = new int[m][n];
        
        q =new LinkedList<>();
        for(int i=0; i<m; i++){
            for(int j=0; j<n;j++){
                arr[i][j] = sc.nextInt();
                
                if(arr[i][j] == 1){
                    q.offer(new Point1(i,j));
                }
            }
        }
        T.BFS(q);
        System.out.println(   answer ) ;
    }

    private void BFS(Queue<Point1> q) {
        
        while(!q.isEmpty()){
            Point1 tmp = q.poll(); // 초기 1,1 나옴
            for(int i=0; i<4;i++){
                int nx = tmp.x +dx[i];
                int ny = tmp.y +dy[i];

                if(nx >=0 && nx < m && ny>=0 && ny< n && arr[nx][ny] ==0){
                    //지나간 영역 1 처리
                    arr[nx][ny] = 1;
                    q.offer(new Point1(nx, ny));
                    day[nx][ny] = day[tmp.x][tmp.y] +1;
                    answer = Math.max(answer, day[nx][ny]);
                }
            }
        }
    }
}

class Point1{
    int x, y;

    public Point1(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
