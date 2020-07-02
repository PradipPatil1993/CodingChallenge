package com.axxess.codingchallenge4.challenge;

import java.util.ArrayList;
import java.util.List;

public class AxxessArrayRotationChallenge {

    /**
    Please code your solution in this method. You can verify
    your solution in the ArrayRotationChallengeTester
     * @return
     */
    public static int[] solution(int[] array, int k) {
        /*
        TODO
         Given an array, rotate the array to the right by k steps, where k is non-negative.

        Follow up:
        Try to come up as many solutions as you can, there are at least 3 different ways to solve this problem.
        Could you do it in-place with O(1) extra space?
         */
        List<Integer> originalArray = convertArrayToList(array);
        for (int i = 0; i < k ; i++) {
             Integer last = originalArray.get(originalArray.size()-1);
             originalArray.remove(last);
             originalArray.add(0,last);

        }
        return convertIntegers(originalArray);
    }

    public static int[] convertIntegers(List<Integer> integers)
    {
        int[] ret = new int[integers.size()];
        for (int i=0; i < ret.length; i++)
        {
            ret[i] = integers.get(i).intValue();
        }
        return ret;
    }

    static List<Integer> convertArrayToList(int[] array){
        List<Integer> intList = new ArrayList<Integer>(array.length);
        for (int i : array)
        {
            intList.add(i);
        }

        return intList;
    }


}
