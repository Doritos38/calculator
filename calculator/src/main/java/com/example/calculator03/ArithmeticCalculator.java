package com.example.calculator03;

import java.util.ArrayList;
import java.util.List;

public class ArithmeticCalculator {

    private List<Double> resultRecord = new ArrayList<>();

    public <T extends Number> double caculate(T firstNum, T secondNum, String operator){
        double result = 0;
        switch (operator){
            case "+" :
                result = OperatorType.ADD.operator(firstNum, secondNum);
                resultRecord.add(result);
                break;
            case "-" :
                result = OperatorType.SUBTRACTION.operator(firstNum,secondNum);
                resultRecord.add(result);
                break;
            case "/" :
                if(secondNum.doubleValue()==0.0){
                    System.out.println("0으로는 나눌 수 없습니다.");
                    break;
                }
                result = OperatorType.DIVISION.operator(firstNum,secondNum);
                resultRecord.add(result);
                break;
            case "*" :
                result = OperatorType.MULTIPLICATION.operator(firstNum,secondNum);
                resultRecord.add(result);
                break;
            default:
                break;
        }
        return result;
    }

    public <T extends Number> List<Double> getSearchRecord(T searchNum){
        List<Double> searchRecord = new ArrayList<>();
        searchRecord = this.resultRecord.stream()
                                        .filter(n -> n > searchNum.doubleValue())
                                        .toList();
        return searchRecord;
    }

    public void removeResult(){
        resultRecord.remove(0);
    }
}
