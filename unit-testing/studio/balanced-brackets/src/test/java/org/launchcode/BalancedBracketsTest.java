package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here
    @Test
    public void onlyBracketReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void bracketsSurroundingTextReturnsTrue() { assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]")); }

    @Test
    public void twoBracketsSurroundingTextReturnsTrue() { assertTrue(BalancedBrackets.hasBalancedBrackets("[[LaunchCode]]")); }

    @Test
    public void bracketsOpenAfterTextAndIncludeTextReturnsTrue () { assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]")); }

    @Test
    public void bracketsOpenAndCloseBeforeTextReturnsTrue() { assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode")); }

    @Test
    public void noBracketsAtAllReturnsTrue() { assertTrue(BalancedBrackets.hasBalancedBrackets("")); }

    @Test
    public void closeBeforeOpenBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void onlyOpenAndNoClosedBracketReturnsFalse() { assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode")); }

    @Test
    public void firstBracketEncounteredIsOpenReturnsFalse() { assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code[")); }

    @Test
    public void onlyOpenBracketEncounteredReturnsFalse() { assertFalse(BalancedBrackets.hasBalancedBrackets("[")); }

    @Test
    public void onlyClosedBracketEncounteredReturnsFalse() { assertFalse(BalancedBrackets.hasBalancedBrackets("]")); }

    @Test
    public void hasTwoOpenBracketsReturnsFalse() { assertFalse(BalancedBrackets.hasBalancedBrackets("[[")); }

    @Test
    public void hasUnbalancedBracketsReturnsFalse() { assertFalse(BalancedBrackets.hasBalancedBrackets("[][][][[]")); }

}