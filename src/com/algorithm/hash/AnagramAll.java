package com.algorithm.hash;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AnagramAll {


    public static void main(String [] args){
        AnagramAll T = new AnagramAll();

        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String t = sc.next();

        T.solution2(s, t);
    }

    private void solution(String s, String t) {
        
        int lt =0;
        
        char [] sArr = s.toCharArray();
        char [] tArr = t.toCharArray();
        
        
        Map<Character, Integer> hm = new HashMap<>();
        Map<Character, Integer> tempHm = new HashMap<>();
        
        for(int i=0; i< tArr.length-1; i++) {
            hm.put(sArr[i] , hm.getOrDefault ( sArr[i], 0) +1 );
        }
        int answer = 0;
        for(int rt =hm.size(); rt<sArr.length; rt++){

            hm.put(sArr[rt], hm.getOrDefault(sArr[rt],0) + 1);
            boolean isTrue = true;
            
            
            tempHm.putAll(hm);
            for(int i=0; i< tArr.length; i ++){
               if(!tempHm.containsKey(  tArr[i] )){
                   isTrue = false;
                   break;
                }else {
                   tempHm.put(tArr[i], tempHm.get(tArr[i])-1 );
                   
                   if(tempHm.get(tArr[i])  < 0 ){
                       isTrue = false;
                       break;
                   }
                }
            }
            if(isTrue){
                answer++;
            }
            
            hm.put(sArr[lt], hm.get(sArr[lt])-1 );
            if(hm.get(sArr[lt]) == 0){
                hm.remove(sArr[lt]);
            }
            lt++;
        }
        System.out.println(answer);
    }

    public void solution2(String a, String b){
        int answer = 0;
        HashMap<Character, Integer> am = new HashMap<>();
        HashMap<Character, Integer> bm = new HashMap<>();
        
        for(char x : b.toCharArray()){
            bm.put(x, bm.getOrDefault(x, 0)+1);
        }
        
        int L=b.length()-1;
        
        for(int i=0; i<L; i++){
            am.put(a.charAt(i), am.getOrDefault(a.charAt(i), 0)+1);
        }
        
        int lt=0;
        for(int rt=L; rt<a.length();rt++){
            am.put(a.charAt(rt), am.getOrDefault(a.charAt(rt),0) +1);
            
            if(am.equals(bm)){
                answer++;
            }
            am.put(a.charAt(lt), am.get(a.charAt(lt))-1);
            if(am.get(a.charAt(lt))==0){
                am.remove(a.charAt(lt));
            }
            lt++;
        }
        System.out.println(answer);
    }

    public void solution3(String a, String b){
        int answer=0;
        HashMap<Character, Integer> am=new HashMap<>();
        HashMap<Character, Integer> bm=new HashMap<>();
        for(char x : b.toCharArray()) bm.put(x, bm.getOrDefault(x, 0)+1);
        int L=b.length()-1;
        for(int i=0; i<L; i++) am.put(a.charAt(i), am.getOrDefault(a.charAt(i), 0)+1);
        int lt=0;
        for(int rt=L; rt<a.length(); rt++){
            am.put(a.charAt(rt), am.getOrDefault(a.charAt(rt), 0)+1);
            if(am.equals(bm)){
                answer++;
            }
            am.put(a.charAt(lt), am.get(a.charAt(lt))-1);
            if(am.get(a.charAt(lt))==0) am.remove(a.charAt(lt));
            lt++;
        }
        System.out.println(answer);
    }
}
