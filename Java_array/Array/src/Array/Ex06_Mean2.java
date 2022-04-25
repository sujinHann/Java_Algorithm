package Array;

import java.util.Scanner;

public class Ex06_Mean2 {

	public static void main(String[] args) {
//		문제
//		대학생 새내기들의 90%는 자신이 반에서 평균은 넘는다고 생각한다. 당신은 그들에게 슬픈 진실을 알려줘야 한다.
//
//		입력
//		첫째 줄에는 테스트 케이스의 개수 C가 주어진다.
//
//		둘째 줄부터 각 테스트 케이스마다 학생의 수 N(1 ≤ N ≤ 1000, N은 정수)이 첫 수로 주어지고, 
//		이어서 N명의 점수가 주어진다. 점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.
//
//		출력
//		각 케이스마다 한 줄씩 평균을 넘는 학생들의 비율을 반올림하여 소수점 셋째 자리까지 출력한다.

		// 입력
		Scanner sc = new Scanner(System.in);

		// 테스트케이스의 개수
		System.out.print("테스트케이스의 개수: ");
		int testCase_cnt = sc.nextInt();

		// 학생의 수 및 점수, 총합

		int sum = 0;

		System.out.print("학생의 수 : ");
		int sdt_cnt = sc.nextInt();
		System.out.print("각 학생의 점수: ");
		int[] sdt_score = new int[sdt_cnt];

		for (int i = 0; i < sdt_cnt; i++) {
			sdt_score[i] = sc.nextInt();
			sum += sdt_score[i]; // 총합 
		}

		// 평균 구하기
		double avg = sum / sdt_cnt;
		System.out.print("평균: " + avg + "\n");
		
		// 학생 수 비율 구하기 
		double cnt = 0;
		
		for (int i = 0; i < sdt_cnt; i++) {
			if (avg < sdt_score[i]) {
				cnt++;
			}
		}
		System.out.printf("%.3f%%\n", cnt / sdt_cnt * 100);

	}

}

