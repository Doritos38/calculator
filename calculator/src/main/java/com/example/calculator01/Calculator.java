
package com.example.calculator01;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("첫번째 숫자를 입력하세요");
            int firstNum = sc.nextInt();
            sc.nextLine();
            System.out.println("두번째 숫자를 입력하세요");
            int secondNum = sc.nextInt();
            sc.nextLine();
            System.out.println("사칙연산 부호를 입력하세요");
            String sign = sc.nextLine();
            int result;
            switch (sign){
                case "+" :
                    result = cal.plus(firstNum, secondNum);
                    System.out.println(firstNum+" + "+secondNum+" = "+result);
                    break;
                case "-" :
                    result = cal.minus(firstNum, secondNum);
                    System.out.println(firstNum+" - "+secondNum+" = "+result);
                    break;
                case "/" :
                    if(secondNum==0){
                        System.out.println("0으로는 나눌 수 없습니다.");
                        break;
                    }
                    result = cal.division(firstNum, secondNum);
                    System.out.println(firstNum+" / "+secondNum+" = "+result);
                    break;
                case "*" :
                    result = cal.multiplication(firstNum, secondNum);
                    System.out.println(firstNum+" * "+secondNum+" = "+result);
                    break;
                default:
                    System.out.println("올바르지 않은 입력입니다");
                    break;
            }
            System.out.println("계산기를 종료하시겠습니까?");
            String exit = sc.nextLine();
            if(exit.equals("exit")) {
                break;
            }
        }





        System.out.println("Hello, Calculator!");
    }

    public int plus(int firstNum, int secondNum){
        int result = firstNum+secondNum;
        return result;
    }

    public int minus(int firstNum, int secondNum){
        int result = firstNum-secondNum;
        return result;
    }

    public int division(int firstNum, int secondNum){
        int result = firstNum/secondNum;
        return result;
    }

    public int multiplication(int firstNum, int secondNum){
        int result = firstNum*secondNum;
        return result;
    }
}