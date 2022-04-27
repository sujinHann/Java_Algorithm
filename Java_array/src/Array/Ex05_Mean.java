package Array;

import java.util.Scanner;

public class Ex05_Mean {

	public static void main(String[] args) {
		// 입력
				Scanner sc = new Scanner(System.in);

				// 몇과목
				System.out.print("과목의 개수를 입력하세요: ");
				int sub_cnt = sc.nextInt();

				// 점수
				int[] score = new int[sub_cnt];

				// 최대값 M
				int max = score[0];

				// 합계
				int sum = 0;

				System.out.print("각 과목의 점수를 입력해 주세요: ");
				for (int i = 0; i < sub_cnt; i++) {
					// 점수입력
					score[i] = sc.nextInt();

					if (max <= score[i]) {
						max = score[i];
					} 

					sum += score[i]; // 점수 누적 
				}

				double avg = (double) sum / (double) max * 100 / sub_cnt;

				System.out.println("조작한 점수의 평균 값: " + avg);

	}

}
