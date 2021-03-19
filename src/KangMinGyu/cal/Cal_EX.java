package KangMinGyu.cal;

import java.util.Scanner;

public class Cal_EX {

   static Cal calc = new Cal();
   static Scanner sc = new Scanner(System.in);
   static int result=0;
   public static void main(String[] args) {
      

      String str = calc.input();
      String[] str1 = calc.splitString(str);
//      int str2 = calc.calculate(str1);
//      System.out.println(str2);
//      int result = str2;
      
      System.out.println("계속 더하려면은 1번을 입력하세요");
      System.out.println("계산기를 초기화 하려면 2번을 입력하세요");
      System.out.println("계산기를 종료하려면 3번을 입력하세요");
      int var = sc.nextInt();
      while(true) {
      if(var==1) {
    	  	  int str2 = calc.calculate(str1);
    	  	  System.out.println(str2);
    		  System.out.println("추가로 더할 값을 입력하세요");
    		  int result1 = calc.add(str2,sc.nextInt());
    		  System.out.println(result1);
    		  int result2 = calc.add(result1,sc.nextInt());
    		  System.out.println(result2);
    		  int result3 = calc.add(result2,sc.nextInt());
    		  System.out.println(result3);
    		  break;
      }else if(var==2) {
         addd();
         break;
      }else if(var==3) {
         System.out.println("계산기가 종료되었습니다.");
         break;
      }
      
      
      }
      
   }
   
   public static void addd() {
      String str = calc.input();
      String[] str1 = calc.splitString(str);
      int str2 = calc.calculate(str1);
      System.out.println(str2);
      int result = str2;
   }
   
   }

      
