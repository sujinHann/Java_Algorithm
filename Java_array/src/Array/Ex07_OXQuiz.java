package Array;

import java.util.Scanner;

public class Ex07_OXQuiz {

	public static void main(String[] args) {
		// �Է�
		Scanner sc = new Scanner(System.in);

		// �л���
		System.out.print("�л� �� : ");
		int sdt_cnt = sc.nextInt();

		for (int i = 0; i < sdt_cnt; i++) {

			int num = 0; // ������ ����� ����
			int sum = 0; // �� ���� ���� ���� ����

			// ������ �Է� �ް� char �迭�� ��ȯ
			char[] ox = sc.next().toCharArray();

			for (char c : ox) { // ���� for�� for(����:�迭����)
				if (c == 'o') { // ���ڿ��� o�� ���� ��� num�� 1�� ����
					num++;
					sum += num;
				} else {
					num = 0; // ���ڿ��� x�� ���� ��� num 0���� �ʱ�ȭ
				}
			}
			System.out.println(sum);
		}

	}

}
