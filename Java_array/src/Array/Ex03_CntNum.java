package Array;

import java.util.Scanner;

public class Ex03_CntNum {

		public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			
			System.out.print("ù��° ���ڸ� �Է� ���ּ���: ");
			int num1 = sc.nextInt();
			System.out.print("�ι�° ���ڸ� �Է� ���ּ���: ");
			int num2 = sc.nextInt();
			System.out.print("����° ���ڸ� �Է� ���ּ���: ");
			int num3 = sc.nextInt();
			
			int[] arr = new int[10];
				
			String result = String.valueOf(num1*num2*num3); // ���ڿ� �� ��ȯ
			
			for(int i = 0; i<result.length(); i++) { //���ڿ� ���� ����, length()�޼ҵ� ��� 
				arr[result.charAt(i)-'0']++; // '0'�� 48
	            // 0~9�� �ش��ϴ� ���ڿ��� ���� ���� ������ �ش� �迭�� index ���� 1����	
	            // charAt(i) : String Ÿ���� ������(���ڿ�)���� Ư�� ���ڸ� char Ÿ������ ��ȯ�� �� ����ϴ� �Լ�		
			} 
	        
			for(int i = 0; i<arr.length; i++) {
				System.out.println(arr[i]);
			}		
		}
	}