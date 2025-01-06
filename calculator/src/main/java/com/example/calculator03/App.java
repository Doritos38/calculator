
package com.example.calculator03;

import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator cal = new Calculator();

        Loop : while(true) {
            System.out.println(" 계산 | 기록 | 기록삭제 | 종료(exit)");
            String choice = sc.nextLine();
            switch (choice){
                case "계산" :
                    System.out.println("첫번째 숫자를 입력하세요");
                    int firstNum = sc.nextInt();
                    sc.nextLine();
                    System.out.println("사칙연산 부호를 입력하세요");
                    String operator = sc.nextLine();
                    System.out.println("두번째 숫자를 입력하세요");
                    int secondNum = sc.nextInt();
                    sc.nextLine();

                    double result = cal.caculate(firstNum,secondNum,operator);

                    if (result%1==0.0) {
                        cal.addResult(result);
                        result = (int) result;
                        System.out.println(firstNum+" "+operator+" "+secondNum+" = "+result);
                    } else {
                        cal.addResult(result);
                        System.out.println(firstNum+" "+operator+" "+secondNum+" = "+result);
                    }
                    break;
                case "기록" :
                    List<Double> record = cal.getResultRecord();
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
            }
        }
    }
}