import java.util.*;
import java.util.Scanner;
	
public class quick_coding3 {
		public static void main(String[] args) {
			
	   Scanner sc = new Scanner(System.in);
	   int number1 ,number2;
	   String str1;
	   String str2;
	   System.out.println("첫번째 string을 입력해 주세요");
	   str1 = sc.nextLine(); 
	   System.out.println("두번째 string을 입력해 주세요");
	   str2 = sc.nextLine();
	   
	   number1 = Integer.parseInt(str1);
	   number2 = Integer.parseInt(str2);
	   System.out.println("나눌 숫자를 입력해 주세요"); 
	   int num = Integer.parseInt(sc.nextLine());
	   int result1;
	   int result2;
	   result1 = (number1 / num);
	   result2 = (number2 / num);
	   
	   
	   try{
		   int num = Integer.parseInt(sc.nextLine());
	   }
	   catch(NumberFormatException e){
		   System.err.println("0으로 나눈 오류입니다.");  
	   }
	   catch(Exception e){
		   System.err.println("1000보다 작은 수 입니다.");
	   }
	}
	

}
