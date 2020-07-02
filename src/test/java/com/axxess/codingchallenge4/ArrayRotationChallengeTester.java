package com.axxess.codingchallenge4;

import com.axxess.codingchallenge4.challenge.AxxessArrayRotationChallenge;

import org.junit.Assert;
import org.junit.Test;

public class ArrayRotationChallengeTester {

    @Test
    public void testSolution() {
        Assert.assertArrayEquals(new int[]{7, 1, 2, 3, 4, 5, 6}, AxxessArrayRotationChallenge.solution(new int[]{1, 2, 3, 4, 5, 6, 7}, 1));
        Assert.assertArrayEquals(new int[]{6, 7, 1, 2, 3, 4, 5}, AxxessArrayRotationChallenge.solution(new int[]{1, 2, 3, 4, 5, 6, 7}, 2));
        Assert.assertArrayEquals(new int[]{5, 6, 7, 1, 2, 3, 4}, AxxessArrayRotationChallenge.solution(new int[]{1, 2, 3, 4, 5, 6, 7}, 3));
        Assert.assertArrayEquals(new int[]{4, 5, 6, 7, 1, 2, 3}, AxxessArrayRotationChallenge.solution(new int[]{1, 2, 3, 4, 5, 6, 7}, 4));
        Assert.assertArrayEquals(new int[]{3, 4, 5, 6, 7, 1, 2}, AxxessArrayRotationChallenge.solution(new int[]{1, 2, 3, 4, 5, 6, 7}, 5));
        Assert.assertArrayEquals(new int[]{2, 3, 4, 5, 6, 7, 1}, AxxessArrayRotationChallenge.solution(new int[]{1, 2, 3, 4, 5, 6, 7}, 6));
        Assert.assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7}, AxxessArrayRotationChallenge.solution(new int[]{1, 2, 3, 4, 5, 6, 7}, 7));
    }
}
