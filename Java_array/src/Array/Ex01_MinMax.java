package Array;

import java.util.Scanner;

public class Ex01_MinMax {

	public static void main(String[] args) {


				Scanner sc = new Scanner(System.in);
				int cnt = sc.nextInt();
				int[] arr = new int[cnt];

				int max, min;

				// 숫자 입력 
				for (int i = 0; i < arr.length; i++) {
					arr[i] = sc.nextInt();
				}
				
				max = arr[0]; 
				min = arr[0]; 
				
				for (int i = 1; i < arr.length; i++) {
					if (max <= arr[i])
						max = arr[i];
					if (min >= arr[i])
						min = arr[i];
				}
				System.out.println(min + " " + max);

			

	}
}
