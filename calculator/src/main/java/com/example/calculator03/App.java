
package com.example.calculator03;

import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArithmeticCalculator cal = new ArithmeticCalculator();

        Loop : while(true) {
            System.out.println(" 계산 | 기록 | 기록삭제 | 종료(exit)");
            String choice = sc.nextLine();
            switch (choice){
                case "계산" :
                    System.out.println("첫번째 숫자를 입력하세요");
                    Double firstNum = sc.nextDouble();
                    sc.nextLine();
                    System.out.println("사칙연산 부호를 입력하세요");
                    String operator = sc.nextLine();
                    System.out.println("두번째 숫자를 입력하세요");
                    Double secondNum = sc.nextDouble();
                    sc.nextLine();

                    double result = cal.caculate(firstNum,secondNum,operator);

                    if (Math.abs(result % 1) < 0.0001) {
                        System.out.println(firstNum+" "+operator+" "+secondNum+" = "+(int)result);
                    } else {
                        System.out.println(firstNum+" "+operator+" "+secondNum+" = "+result);
                    }
                    break;

                case "기록" :
                    System.out.println("검색을 원하시는 값을 출력해주세요. (입력한 값보다 큰 결과값들이 출력됩니다.)");
                    int searchNum = sc.nextInt();
                    sc.nextLine();
                    List<Double> record = cal.getSearchRecord(searchNum);
                    int count = 0;
                    for(double rec : record){
                        count++;
                        System.out.println("계산기록 : "+count+". "+rec);
                    }
                    break;

                case "기록삭제" :
                    System.out.println("가장 오래된 기록 하나를 삭제하시겠습니까");
                    System.out.println("    예 / 아니요    ");
                    String answer = sc.nextLine();
                    if(answer.equals("예")){
                        cal.removeResult();
                    }
                    break;

                case "exit" :
                    break Loop;

                default :
                    System.out.println("잘못 입력하셨습니다. 보기 중 하나를 골라주세요");
                    break;
            }
        }
    }
}