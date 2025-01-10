package com.example.calculator02;

import java.util.ArrayList;
import java.util.List;

public class Calculator {

    private List<Double> resultRecord = new ArrayList<>();

    public double caculate(int firstNum, int secondNum, String operator){ // 연산 메서드
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

    public List<Double> getResultRecord(){  // 결과값 가져오기
        return new ArrayList<>(this.resultRecord);
    }

    public void addResult(double result){ // 계산 결과 저장
        this.resultRecord.add(result);
    }

    public void removeResult(){ // 가장 오래된 결과값 삭제
        resultRecord.remove(0);
    }
}
