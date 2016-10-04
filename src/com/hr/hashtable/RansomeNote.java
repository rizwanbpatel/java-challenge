package com.hr.hashtable;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class RansomeNote  {
    Map<String, Integer> magazineMap;
    Map<String, Integer> noteMap;
    
    public RansomeNote(String magazine, String note) {
        magazineMap = new Hashtable<String,Integer>();
        noteMap = new Hashtable<String, Integer>();
        int cnt=1;
        String[] magwords = magazine.split(" ");
        for(String word : magwords){
            if(magazineMap.containsKey(word)){
                magazineMap.put(word,magazineMap.get(word) + 1);
            }else{
                magazineMap.put(word,cnt);
            }
        }
        
        String[] notewords = note.split(" ");
        
        for(String word : notewords){ 
            if(noteMap.containsKey(word)){
                noteMap.put(word,noteMap.get(word) + 1);
            }
            else{
                noteMap.put(word,cnt);
            }
        }
       
    }
    
    public boolean solve() {
        for(String nw : noteMap.keySet()){
        	if(noteMap.get(nw) > magazineMap.getOrDefault(nw, -1)){
        		return false;
        	}
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        
        // Eat whitespace to beginning of next line
        scanner.nextLine();
        
        RansomeNote s = new RansomeNote(scanner.nextLine(), scanner.nextLine());
        scanner.close();
        
        boolean answer = s.solve();
        if(answer)
            System.out.println("Yes");
        else System.out.println("No");
      
    }
}
