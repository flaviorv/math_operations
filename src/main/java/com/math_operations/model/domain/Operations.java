package com.math_operations.model.domain;

public class Operations {
    private int result;

    public int sum(int num1, int num2) {
        result = num1 + num2;
        return result;
    }

    public int subtract(int num1, int num2){
        result = num1 - num2;
        return result;
    }

    public int multiply(int num1, int num2) {
        result = num1 * num2;
        return result;
    }

    public int divide(int num1, int num2) {
        result = num1 / num2;
        return result;
    }

    public int exponentiation(int num1, int num2) {
        result = (int) Math.pow(num1, num2);
        return result;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }
}
