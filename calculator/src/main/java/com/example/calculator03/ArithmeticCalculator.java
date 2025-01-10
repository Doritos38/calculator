package com.example.calculator03;

import java.util.ArrayList;
import java.util.List;

public class ArithmeticCalculator {

    private List<Double> resultRecord = new ArrayList<>();

    public <T extends Number> double caculate(T firstNum, T secondNum, String operator){    // 계산 메서드
        double result = 0;
        switch (operator){
            case "+" :
                result = OperatorType.ADD.operator(firstNum, secondNum);
                resultRecord.add(result);   // 결과값을 저장
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

    public <T extends Number> List<Double> getSearchRecord(T searchNum){    // 검색한 값 이상의 결과값을 출력
        List<Double> searchRecord = new ArrayList<>();
        searchRecord = this.resultRecord.stream()
                                        .filter(n -> n > searchNum.doubleValue())
                                        .toList();
        return searchRecord;
    }

    public void removeResult(){ // 가장 오래된 결과기록 삭제
        resultRecord.remove(0);
    }
}
