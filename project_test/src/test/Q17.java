package test;

import java.util.Scanner;

public class Q17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str[] = { "����", "����", "��" };
		int n;
		String userSelect, comSelect;

		System.out.println("��ǻ�Ϳ� ������������ �մϴ�.");

		do {
			System.out.println("���� ���� ��! >>");
			userSelect = sc.next();
			if (userSelect.equals("�׸�"))
				break;

			n = (int) (Math.random() * 3);
			/*
			 * 0.0xxx~0.9xxx������ �������� �߻���Ų �� x3�� ���� �� ������ ���� �����κи� ����Ͽ� "����", "����", "��" �Ҵ� (0, 1, 2)
			 */
			comSelect = str[n];
			if (userSelect.equals("����")) {
				if (str[n].equals("����")) {
					System.out.println("���=" + userSelect + ", ��ǻ��=" + comSelect + " �����ϴ�.");
					continue;
				} else if (str[n].equals("����")) {
					System.out.println("���=" + userSelect + ", ��ǻ��=" + comSelect + " ����� �����ϴ�.");
					continue;
				} else if (str[n].equals("��")) {
					System.out.println("���=" + userSelect + ", ��ǻ��=" + comSelect + " ����� �̰���ϴ�.");
					continue;
				}
			}

			if (userSelect.equals("����")) {
				if (str[n].equals("����")) {
					System.out.println("���=" + userSelect + ", ��ǻ��=" + comSelect + " ����� �̰���ϴ�.");
					continue;
				} else if (str[n].equals("����")) {
					System.out.println("���=" + userSelect + ", ��ǻ��=" + comSelect + " �����ϴ�.");
					continue;
				} else if (str[n].equals("��")) {
					System.out.println("���=" + userSelect + ", ��ǻ��=" + comSelect + " ����� �����ϴ�.");
					continue;
				}
			}

			if (userSelect.equals("��")) {
				if (str[n].equals("����")) {
					System.out.println("���=" + userSelect + ", ��ǻ��=" + comSelect + " ����� �����ϴ�.");
					continue;
				} else if (str[n].equals("����")) {
					System.out.println("���=" + userSelect + ", ��ǻ��=" + comSelect + " ����� �̰���ϴ�.");
					continue;
				} else if (str[n].equals("��")) {
					System.out.println("���=" + userSelect + ", ��ǻ��=" + comSelect + " �����ϴ�.");
					continue;
				}
			}
			System.out.println("�����=" + userSelect + ", ��ǻ��=" + comSelect + " ");

		} while (true);
		System.out.println("������ �����մϴ�.");
		sc.close();
	}
}