package dkatalias;

public class Palindrome {
	
public static void main(String[] args){
        
        String s= "aabaa";
        isPalindrome(s);
        
    }
    public static void isPalindrome(String s){
        int i =0, j =s.length()-1;
        while(i<j){
            if(s.charAt(i)!= s.charAt(j))
            System.out.println("not palindrome");
            i++;
            j--;
           
        }
        System.out.println("palindrome");
        
    }

}
