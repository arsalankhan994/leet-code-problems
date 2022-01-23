package com.company;

public class IntegerPalindrome {

    public static void main(String[] args) {
        IntegerPalindromeSolution solution = new IntegerPalindromeSolution();
        System.out.println(solution.solution(123321));
    }
}

class IntegerPalindromeSolution {

    int output = 0;
    int originalInput;
    public boolean solution(int value) {
        originalInput = value;
        while (value > 0) {
            int remainder = value % 10;
            output = output * 10 + remainder;
            value = value/10;
        }
        return output == originalInput;
    }
}
