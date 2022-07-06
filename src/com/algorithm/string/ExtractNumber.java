package com.algorithm.string;

import java.util.Scanner;

public class ExtractNumber {
    
    public static void main(String [] args){

        ExtractNumber T = new ExtractNumber();

        Scanner in=new Scanner(System.in);

        String str = in.next();
        
        T.solution(str);
    }

    private void solution(String str) {
        
        str = str.replaceAll("[^0-9]", "");
        
        System.out.println( Integer.parseInt(str));
    }
}
