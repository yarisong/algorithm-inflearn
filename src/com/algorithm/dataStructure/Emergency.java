package com.algorithm.dataStructure;

import java.util.*;

public class Emergency {
    
    public static void main(String [] args){
        Emergency T = new Emergency();
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int[] arr =new int[n];
        
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        T.solution(n,m,arr);
    }

    private void solution(int n, int m, int[] arr) {
        
        int answer = 0;
        Queue<Person> que = new LinkedList<>();
        
        for(int i=0;i< n;i ++){
            que.offer(new Person(i, arr[i]));
        }
        while(!que.isEmpty()){
            Person tmp = que.poll();
            
            for(Person x : que){
                if(tmp.getPriority() < x.getPriority()){
                    que.offer(tmp);
                    tmp = null;
                    break;
                }
            }
            if(tmp != null){
                if(tmp.id == m){
                    System.out.println(answer);
                    return;
                }else {
                    answer++;
                }
            }
        }
        System.out.println(answer);
    }
} 

class Person{
    int id;
    int priority;
    public Person(int id, int priority) {
        this.id = id;
        this.priority = priority;
    }

    public int getId() {
        return id;
    }

    public int getPriority() {
        return priority;
    }
}