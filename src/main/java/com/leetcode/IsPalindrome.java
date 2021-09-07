package com.leetcode;

public class IsPalindrome {
    public boolean isPalindrome(String s) {

        s = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();

        for(int i=0, j=s.length(); i<s.length(); i++, j--){

            if(s.charAt(i)!=s.charAt(j-1)){
                return false;
            }

        }
        return true;
    }
}
