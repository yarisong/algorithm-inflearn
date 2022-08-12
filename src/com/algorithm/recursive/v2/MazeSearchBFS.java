package com.algorithm.recursive.v2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class MazeSearchBFS {
    static int [][] board = new int [8][8];
    static int [][] dis = new int [8][8];
    static int [] dx ={-1, 0, 1, 0};
    static int [] dy = {0, 1, 0, -1};
    static int answer =0;

    public static void main(String [] args){

        MazeSearchBFS T = new MazeSearchBFS();
        Scanner sc = new Scanner(System.in);

        for(int i=1; i<8;i++){
            for(int j=1;j<8;j++){
                board[i][j] = sc.nextInt();
            }
        }

        T.BFS(1, 1);
        if(dis[7][7] ==0){
            System.out.println(-1);
        }
        System.out.println(answer);
    }

    private void BFS(int x, int y) {
        Queue<Point> Q =new LinkedList<>();
        Q.offer(new Point(x, y));
        //출발점 체크
        board[x][y] =1;
        while(!Q.isEmpty()){
            Point tmp = Q.poll(); // 초기 1,1 나옴
            for(int i=0; i<4;i++){
                int nx = tmp.x +dx[i];
                int ny = tmp.y +dy[i];
                
                if(nx >=1 && nx <=7 && ny>=1 && ny<=7 && board[nx][ny] ==0){
                    //지나간 영역 1 처리
                    board[nx][ny] = 1;
                    Q.offer(new Point(nx, ny));
                    dis[nx][ny] = dis[tmp.x][tmp.y] +1;
                }
            }
        }
    }
}

class Point{
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int x,y;
    
}