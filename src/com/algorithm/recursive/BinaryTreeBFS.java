package com.algorithm.recursive;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeBFS {
    
    NodeBFS root;

    public static void main(String [] args){
        BinaryTreeBFS tree = new BinaryTreeBFS();
        tree.root = new NodeBFS(1);
        tree.root.lt = new NodeBFS(2);
        tree.root.rt = new NodeBFS(3);
        tree.root.lt.lt = new NodeBFS(4);
        tree.root.lt.rt = new NodeBFS(5);
        tree.root.rt.lt = new NodeBFS(6);
        tree.root.rt.rt = new NodeBFS(7);
        tree.BFS(tree.root);
    }
    
    private static void BFS(NodeBFS root) {
        Queue<NodeBFS> q = new LinkedList<>();
        q.offer(root);
        int L = 0;
        while(!q.isEmpty()){
            int len =q.size();
            System.out.print(L + " : ");
            for(int i=0; i<len;i++){
                NodeBFS  cur = q.poll();
                System.out.print(cur.data + " ");
                if(cur.lt != null){
                    q.offer(cur.lt);
                }
                if(cur.rt != null){
                    q.offer(cur.rt);
                }
            }
            L++;
            System.out.println();
        }
    }
}

class NodeBFS{
    int data;
    NodeBFS lt, rt;
    public NodeBFS(int val){
        data = val;
        lt =rt=null;
    }
}