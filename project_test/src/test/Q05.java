// [문항5]  배열을 이용해서 1~10까지 합을 출력 하시오. 

package test;

public class Q05 {
	public static void main(String[] args) {
		int[] scores = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		int sum = 0;

		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		System.out.println(sum);
	}
}