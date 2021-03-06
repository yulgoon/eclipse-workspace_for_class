package test;

import java.util.Scanner;

public class Q16 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("과목명을 입력하세요.");

		String course[] = { "Java", "C++", "HTML5", "컴퓨터구조", "안드로이드" };
		int score[] = { 95, 88, 76, 62, 55 };

		for (int i = 0; i < course.length; i++) {
			String subject = scanner.next();
			switch (subject) {
			case "Java":
				System.out.println("과목이름 >> " + course[0]);
				System.out.println(course[0] + "의 점수는 " + score[0]);
				break;
			case "C++":
				System.out.println("과목이름 >> " + course[1]);
				System.out.println(course[1] + "의 점수는 " + score[1]);
				break;
			case "HTML5":
				System.out.println("과목이름 >> " + course[2]);
				System.out.println(course[2] + "의 점수는 " + score[2]);
				break;
			case "컴퓨터구조":
				System.out.println("과목이름 >> " + course[3]);
				System.out.println(course[3] + "의 점수는 " + score[3]);
				break;
			case "안드로이드":
				System.out.println("과목이름 >> " + course[4]);
				System.out.println(course[4] + "의 점수는 " + score[4]);
				break;
			case "그만":
				break;
			default:
				System.out.println("과목 이름 >> " + subject);
				System.out.println("없는 과목입니다.");
			}
		}
		scanner.close();
	}
}
