package Array;

import java.util.Scanner;

public class Ex06_Mean2 {

	public static void main(String[] args) {
//		����
//		���л� ��������� 90%�� �ڽ��� �ݿ��� ����� �Ѵ´ٰ� �����Ѵ�. ����� �׵鿡�� ���� ������ �˷���� �Ѵ�.
//
//		�Է�
//		ù° �ٿ��� �׽�Ʈ ���̽��� ���� C�� �־�����.
//
//		��° �ٺ��� �� �׽�Ʈ ���̽����� �л��� �� N(1 �� N �� 1000, N�� ����)�� ù ���� �־�����, 
//		�̾ N���� ������ �־�����. ������ 0���� ũ�ų� ����, 100���� �۰ų� ���� �����̴�.
//
//		���
//		�� ���̽����� �� �پ� ����� �Ѵ� �л����� ������ �ݿø��Ͽ� �Ҽ��� ��° �ڸ����� ����Ѵ�.

		// �Է�
		Scanner sc = new Scanner(System.in);

		// �׽�Ʈ���̽��� ����
		System.out.print("�׽�Ʈ���̽��� ����: ");
		int testCase_cnt = sc.nextInt();

		// �л��� �� �� ����, ����

		int sum = 0;

		System.out.print("�л��� �� : ");
		int sdt_cnt = sc.nextInt();
		System.out.print("�� �л��� ����: ");
		int[] sdt_score = new int[sdt_cnt];

		for (int i = 0; i < sdt_cnt; i++) {
			sdt_score[i] = sc.nextInt();
			sum += sdt_score[i]; // ���� 
		}

		// ��� ���ϱ�
		double avg = sum / sdt_cnt;
		System.out.print("���: " + avg + "\n");
		
		// �л� �� ���� ���ϱ� 
		double cnt = 0;
		
		for (int i = 0; i < sdt_cnt; i++) {
			if (avg < sdt_score[i]) {
				cnt++;
			}
		}
		System.out.printf("%.3f%%\n", cnt / sdt_cnt * 100);

	}

}

