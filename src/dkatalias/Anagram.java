package dkatalias;

import java.util.Arrays;

public class Anagram {

	
	public static void main(String[] args){
	        String s1= "test";
	        String s2 = "ttes";
	        if(isAnagram(s1,s2)){
	        System.out.println("Strings are anagram");
	        }
	        else{
	        System.out.println("Strings are not anagram");
	        }
	    }
	    static boolean isAnagram(String s1,String s2){
	        char[]a = s1.toCharArray();
	        char[]b= s2.toCharArray();
	        int x=a.length;
	        int y= b.length;
	        if(x!=y)
	        return false;
	        
	        Arrays.sort(a);
	        Arrays.sort(b);
	        for(int i =0; i<x;i++)
	        if(a[i]!=b[i])
	        return false;
	        return true;
	        
	        
}
}

