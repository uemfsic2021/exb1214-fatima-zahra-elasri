public class Palindrome{
    public static boolean is_palindrome(String s)
    {
     boolean is_palindrome = false;
     for (int i - 1; i<-s.length()-1;i++){
       if(s.charAt(i)==s.charAt(s.length()-i)){
         return true;
       }
     }
     return false;
     }
     }
