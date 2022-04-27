package Array;

import java.util.Scanner;

public class Ex03_CntNum {

		public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			
			System.out.print("첫번째 숫자를 입력 해주세요: ");
			int num1 = sc.nextInt();
			System.out.print("두번째 숫자를 입력 해주세요: ");
			int num2 = sc.nextInt();
			System.out.print("세번째 숫자를 입력 해주세요: ");
			int num3 = sc.nextInt();
			
			int[] arr = new int[10];
				
			String result = String.valueOf(num1*num2*num3); // 문자열 형 변환
			
			for(int i = 0; i<result.length(); i++) { //문자열 길이 세기, length()메소드 사용 
				arr[result.charAt(i)-'0']++; // '0'은 48
	            // 0~9에 해당하는 문자열의 문자 값을 추출해 해당 배열의 index 값을 1증가	
	            // charAt(i) : String 타입의 데이터(문자열)에서 특정 문자를 char 타입으로 변환할 때 사용하는 함수		
			} 
	        
			for(int i = 0; i<arr.length; i++) {
				System.out.println(arr[i]);
			}		
		}
	}