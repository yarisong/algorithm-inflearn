package com.algorithm.sort;

import java.util.*;

public class Coordinate {
    public static void main(String[] args){
        Coordinate T = new Coordinate();

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ArrayList<Point> arr= new  ArrayList<>();
        for(int i=0; i<n;i++){
            int x= sc.nextInt();
            int y= sc.nextInt();
            
            arr.add(new Point(x, y));
        }

        Collections.sort(arr);
        
        for(  Point o: arr) {
            System.out.println(o.x +" " + o.y);
        }
    }

    private void solution(int n, Object [] arr) {
//        Arrays.sort(arr);
        
        for(int i=0; i<n-1; i++){
          for(int j=i+1; j<n; j++){
              Corr c1 = (Corr) arr[i];
              Corr c2 = (Corr) arr[j];
              
              if(c1.getX() > c2.getX()){
                  Corr tmp = (Corr) arr[i];
                  
                  arr[i] = arr[j];
                  arr[j] = tmp;
              }else if( c1.getX() == c2.getX() && c1.getY() > c2.getY()){
                  Corr tmp = (Corr) arr[i];

                  arr[i] = arr[j];
                  arr[j] = tmp;
              }
          }
        }

        for(int i=0; i<n; i++){
            Corr c1 = (Corr) arr[i];
            System.out.println(c1.getX() + " " + c1.getY());
        }
    }
}

class Corr{
    int x;
    int y;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Corr(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Point implements Comparable<Point>{

    public int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point o) {
        if(this.x ==o.x){
            return this.y-o.y;
        }else{
            return this.x-o.x;
        }
    }
}