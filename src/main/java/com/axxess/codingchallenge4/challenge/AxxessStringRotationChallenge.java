package com.axxess.codingchallenge4.challenge;

import java.util.ArrayList;

public class AxxessStringRotationChallenge {
    /**
     * Please code your solution in this method. You can verify
     * your solution in the StringRotationChallengeTester
     */
    public static int solution(String str) {
        /*
        TODO
           Given a string, find the first non-repeating character in it and return its index.
           If it doesn't exist, return -1.

            Examples:
            str = "leetcode" // return 0
            str = "loveleetcode" // return 2
         */

        ArrayList<Character> charList = convertStringToList(str);

        for (int i = 0; i <charList.size() ; i++) {
            int count = 0;
            for (int j = 0; j <charList.size() ; j++) {
                if(charList.get(i)==charList.get(j)){
                    count++;
                }
                if(count>1){
                    break;
                }
            }
            if(count==1){
                return i;
            }


        }
        return -1;
    }

    private static ArrayList<Character> convertStringToList(String str) {
        ArrayList<Character> chars = new ArrayList<Character>();
        for (char c : str.toCharArray()) {
            chars.add(c);
        }
        return chars;
    }


}
