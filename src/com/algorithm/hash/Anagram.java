package com.algorithm.hash;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Anagram {

    public static void main(String [] args){
        Anagram T = new Anagram();

        Scanner sc = new Scanner(System.in);

        //String[] arr = new String[m];
        String f1 = sc.next();
        String f2 = sc.next();


        T.solution(f1, f2);
        T.solution2(f1, f2);
        T.solution3(f1, f2);
    }

    private void solution(String f1, String f2) {

        char [] c1 = f1.toCharArray();
        char [] c2 = f2.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        for(int i=0; i<c1.length; i++){

            if(c1[i] != c2[i]) {
                System.out.println("NO");
                return;
            }
        }

        System.out.println("YES");

    }

    private void solution2(String f1, String f2) {

        char [] c1 = f1.toCharArray();
        char [] c2 = f2.toCharArray();

        Map<Character, Integer> map= new HashMap<>();
        for(int i=0; i<c1.length; i++){
            map.put( c1[i], map.getOrDefault(c1[i], 0 ) +1 );
        }

        Map<Character, Integer> map2= new HashMap<>();
        for(int i=0; i<c2.length; i++){
            map2.put( c2[i], map2.getOrDefault(c2[i], 0 ) +1 );
        }
        for(char c : map.keySet()){
            if(map.get(c) != map2.get(c)){
                System.out.println("NO");
                return;
            }
        }

        System.out.println("YES");

    }

    private void solution3(String f1, String f2) {

        char [] c1 = f1.toCharArray();
        char [] c2 = f2.toCharArray();

        Map<Character, Integer> map= new HashMap<>();
        for(int i=0; i<c1.length; i++){
            map.put( c1[i], map.getOrDefault(c1[i], 0 ) +1 );
        }

        for(int i=0; i<c2.length; i++){
            if(map.containsKey (c2[i]) ){

                int cnt = map.get(c2[i]) -1;
                if(cnt<0){

                    System.out.println("NO");
                    return;
                }
                map.put( c2[i], cnt);

            }else{
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}
