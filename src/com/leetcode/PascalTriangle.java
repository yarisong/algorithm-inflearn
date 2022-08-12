package com.leetcode;

import java.util.ArrayList;
import java.util.List;


public class PascalTriangle {
    
    public static void main(String[] args) {

        PascalTriangle T = new PascalTriangle();
        
        T.generate(5);
        
    }
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> arr= new ArrayList<>();
        arr.add(new ArrayList<>());
        arr.get(0).add(1);
        
        int idx=1;
        while(idx < numRows){
            List<Integer> inner = new ArrayList<>();
            
            for(int i=0;i< arr.size()+1;i++){

                if(i == 0 || i == arr.size()){
                    inner.add(1);
                }else{
                    inner.add( arr.get(idx-1).get(i-1) + arr.get(idx-1).get(i));
                }
            }
            arr.add(inner);
            idx++;
        }
        

        return null;
    }
    
    
}
