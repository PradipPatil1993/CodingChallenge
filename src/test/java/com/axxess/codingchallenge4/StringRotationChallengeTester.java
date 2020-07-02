package com.axxess.codingchallenge4;

import com.axxess.codingchallenge4.challenge.AxxessArrayRotationChallenge;
import com.axxess.codingchallenge4.challenge.AxxessStringRotationChallenge;

import org.junit.Assert;
import org.junit.Test;

public class StringRotationChallengeTester {

    @Test
    public void testSolution() {
        Assert.assertEquals(0, AxxessStringRotationChallenge.solution("leetcode"));
        Assert.assertEquals(2, AxxessStringRotationChallenge.solution("loveleetcode"));
        Assert.assertEquals(5, AxxessStringRotationChallenge.solution("geeksforgeeks"));
        Assert.assertEquals(0, AxxessStringRotationChallenge.solution("axxess"));
        Assert.assertEquals(-1, AxxessStringRotationChallenge.solution(""));
        Assert.assertEquals(3, AxxessStringRotationChallenge.solution("aabcdb"));
    }
}
