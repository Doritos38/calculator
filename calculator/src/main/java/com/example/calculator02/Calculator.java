package com.example.calculator02;

import java.util.ArrayList;
import java.util.List;

public class Calculator {

    private List<Double> resultRecord = new ArrayList<>();

    public double caculate(int firstNum, int secondNum, String operator){
        double result = 0;
        switch (operator){
            case "+" :
                result = firstNum+secondNum;
                break;
            case "-" :
                result = firstNum-secondNum;
                break;
            case "/" :
                if(secondNum==0){
                    System.out.println("0으로는 나눌 수 없습니다.");
                    break;
                }
                result = (double)firstNum/secondNum;
                break;
            case "*" :
                result = firstNum*secondNum;
                break;
            default:
                break;
        }
        return result;
    }

    public List<Double> getResultRecord(){
        return new ArrayList<>(this.resultRecord);
    }

    public void addResult(double result){
        this.resultRecord.add(result);
    }

    public void delResult(){
        resultRecord.remove(0);
    }
}
