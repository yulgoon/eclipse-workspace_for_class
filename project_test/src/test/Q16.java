package test;

import java.util.Scanner;

public class Q16 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("������� �Է��ϼ���.");

		String course[] = { "Java", "C++", "HTML5", "��ǻ�ͱ���", "�ȵ���̵�" };
		int score[] = { 95, 88, 76, 62, 55 };

		for (int i = 0; i < course.length; i++) {
			String subject = scanner.next();
			switch (subject) {
			case "Java":
				System.out.println("�����̸� >> " + course[0]);
				System.out.println(course[0] + "�� ������ " + score[0]);
				break;
			case "C++":
				System.out.println("�����̸� >> " + course[1]);
				System.out.println(course[1] + "�� ������ " + score[1]);
				break;
			case "HTML5":
				System.out.println("�����̸� >> " + course[2]);
				System.out.println(course[2] + "�� ������ " + score[2]);
				break;
			case "��ǻ�ͱ���":
				System.out.println("�����̸� >> " + course[3]);
				System.out.println(course[3] + "�� ������ " + score[3]);
				break;
			case "�ȵ���̵�":
				System.out.println("�����̸� >> " + course[4]);
				System.out.println(course[4] + "�� ������ " + score[4]);
				break;
			case "�׸�":
				break;
			default:
				System.out.println("���� �̸� >> " + subject);
				System.out.println("���� �����Դϴ�.");
			}
		}
		scanner.close();
	}
}