/* [문항4]  for 문을 이용해서 실행 결과와 같은 삼각형을 출력하는 코드를 작성해 보세요. 

* 
** 
*** 
****
*/

package test;

public class Q04 {

	public static void main(String[] args) {
		int lineCount = 4;
		int starCount = 1;

		for (int i = 0; i < lineCount; i++) {
			for (int j = 0; j < starCount; j++) {
				System.out.print("*");
			}

			System.out.println();
			starCount += 1;
		}
	}
}
