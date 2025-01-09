package com.example.calculator03;

public enum OperatorType {

    ADD {
        @Override
        public <T extends Number> double operator(T firstNum, T secondNum) {
            return firstNum.doubleValue() + secondNum.doubleValue();
        }
    },
    SUBTRACTION {
        @Override
        public <T extends Number> double operator(T firstNum, T secondNum) {
            return firstNum.doubleValue() - secondNum.doubleValue();
        }
    },
    MULTIPLICATION  {
        @Override
        public <T extends Number> double operator(T firstNum, T secondNum) {
            return firstNum.doubleValue() * secondNum.doubleValue();
        }
    },
    DIVISION {
        @Override
        public <T extends Number> double operator(T firstNum, T secondNum) {
            return firstNum.doubleValue() / secondNum.doubleValue();
        }
    };

    public abstract <T extends Number> double operator (T firstNum, T secondNum);
}

