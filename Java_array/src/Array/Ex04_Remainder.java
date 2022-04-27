package Array;

import java.util.Scanner;

public class Ex04_Remainder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				// 입력
				Scanner sc = new Scanner(System.in);

				int[] arr = new int[10];
				int[] total = new int[1000]; // 전체배열
				int cnt = 0;

				// 10개입력
				for (int i = 0; i < 10; i++) {
					arr[i] = sc.nextInt();
					arr[i] = arr[i] % 42; // 42로 나눈 나머지를 배열에 저장
				}

				for (int i = 0; i < 10; i++) {
					total[arr[i]]++; // arr값을 total의 arr값 배열에 넣어줘서 1씩 증가시킴, 값이 있으면 1씩 증가
					// System.out.printf("i: %d, arr[%d]: %d, total[%d]: %d%n", i, i, arr[i], i,
					// total[i]);
				}

				for (int i = 0; i < total.length; i++) {
					if (total[i] != 0) { // 전체 배열에서 값이 있으면 카운팅
						cnt++;
					}
				}

				System.out.println(cnt);

			}

		}