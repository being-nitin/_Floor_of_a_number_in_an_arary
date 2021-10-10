package com.nitincodes;

public class NextGreatestLetter {
    // leetcode  finding the smallest letter greater than the target:
    public static void main(String[] args) {
        char[] arr = {'a','c','e','g'};
        char ans = nextGreatestLetter(arr,'d');
        System.out.println(ans);
    }
static char nextGreatestLetter(char[] letters, char target){
        int start = 0;
        int end = letters.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(target<letters[mid]){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return letters[start%letters.length];
    }
}
