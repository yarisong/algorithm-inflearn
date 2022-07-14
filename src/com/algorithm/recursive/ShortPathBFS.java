package com.algorithm.recursive;

import java.util.LinkedList;
import java.util.Queue;

public class ShortPathBFS {
    Node2 root;

    public static void main(String [] args){

        ShortPathBFS tree = new ShortPathBFS();
        tree.root = new Node2(1);
        tree.root.lt = new Node2(2);
        tree.root.rt = new Node2(3);
        tree.root.lt.lt = new Node2(4);
        tree.root.lt.rt = new Node2(5);
        System.out.println(tree.BFS(tree.root));
    }
    
    public int BFS(Node2 root){
        int L = 0;
        Queue<Node2> q = new LinkedList<>();
        q.offer(root);
        
        while(!q.isEmpty()){
            int len = q.size();            
            for(int i=0;i<len; i++){
                Node2 cur = q.poll();
                
                if(cur.lt == null && cur.rt == null){
                    return L;
                }
                if(cur.lt !=null){
                    q.offer(root.lt);
                }
                if(cur.rt !=null){
                    q.offer(root.rt);
                }
            }
            L++;
        }
        return 0;
    } 
}


class Node2{
    int data;
    Node2 lt, rt;
    public Node2(int val){
        data = val;
        lt =rt=null;
    }
}