package javaAssignment;
public class topic3_As4 {
    public static void main(String args[]){
        String toCheckPalindrome = "malayalam";
        StringBuilder toCheckPalindrome1 = new StringBuilder();
        toCheckPalindrome1 = toCheckPalindrome1.append(toCheckPalindrome);
        StringBuilder palindromeString = new StringBuilder();
        palindromeString = toCheckPalindrome1.reverse();
        String palindromeString1 = palindromeString.toString();

        if(toCheckPalindrome.equals(palindromeString1)){
            System.out.println("The given string: " +palindromeString+ " is a palindrome");
        }
        else{
            System.out.println("The given string: " +palindromeString+ " is not a palindrome");
        }
    }
}
