package Array;

import java.util.Scanner;

public class Ex04_Remainder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				// �Է�
				Scanner sc = new Scanner(System.in);

				int[] arr = new int[10];
				int[] total = new int[1000]; // ��ü�迭
				int cnt = 0;

				// 10���Է�
				for (int i = 0; i < 10; i++) {
					arr[i] = sc.nextInt();
					arr[i] = arr[i] % 42; // 42�� ���� �������� �迭�� ����
				}

				for (int i = 0; i < 10; i++) {
					total[arr[i]]++; // arr���� total�� arr�� �迭�� �־��༭ 1�� ������Ŵ, ���� ������ 1�� ����
					// System.out.printf("i: %d, arr[%d]: %d, total[%d]: %d%n", i, i, arr[i], i,
					// total[i]);
				}

				for (int i = 0; i < total.length; i++) {
					if (total[i] != 0) { // ��ü �迭���� ���� ������ ī����
						cnt++;
					}
				}

				System.out.println(cnt);

			}

		}