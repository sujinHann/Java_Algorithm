package Array;

import java.util.Scanner;

public class Ex07_OXQuiz {

	public static void main(String[] args) {
		// 입력
		Scanner sc = new Scanner(System.in);

		// 학생수
		System.out.print("학생 수 : ");
		int sdt_cnt = sc.nextInt();

		for (int i = 0; i < sdt_cnt; i++) {

			int num = 0; // 점수를 계산할 변수
			int sum = 0; // 총 합을 담을 변수 선언

			// 데이터 입력 받고 char 배열로 변환
			char[] ox = sc.next().toCharArray();

			for (char c : ox) { // 향상된 for문 for(변수:배열변수)
				if (c == 'o') { // 문자열에 o이 있을 경우 num를 1씩 증가
					num++;
					sum += num;
				} else {
					num = 0; // 문자열에 x가 있을 경우 num 0으로 초기화
				}
			}
			System.out.println(sum);
		}

	}

}
