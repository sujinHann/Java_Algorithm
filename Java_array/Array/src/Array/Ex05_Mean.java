package Array;

import java.util.Scanner;

public class Ex05_Mean {

	public static void main(String[] args) {
		// �Է�
				Scanner sc = new Scanner(System.in);

				// �����
				System.out.print("������ ������ �Է��ϼ���: ");
				int sub_cnt = sc.nextInt();

				// ����
				int[] score = new int[sub_cnt];

				// �ִ밪 M
				int max = score[0];

				// �հ�
				int sum = 0;

				System.out.print("�� ������ ������ �Է��� �ּ���: ");
				for (int i = 0; i < sub_cnt; i++) {
					// �����Է�
					score[i] = sc.nextInt();

					if (max <= score[i]) {
						max = score[i];
					} 

					sum += score[i]; // ���� ���� 
				}

				double avg = (double) sum / (double) max * 100 / sub_cnt;

				System.out.println("������ ������ ��� ��: " + avg);

	}

}
