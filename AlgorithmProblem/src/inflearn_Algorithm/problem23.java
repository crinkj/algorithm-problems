package inflearn_Algorithm;

import java.util.Scanner;

public class problem23 {
	public static void main(String[] args) {
	/*   문제: 김갑동 선생님은 올해 6학년 1반 담임을 맡게 되었다.
			김갑동 선생님은 우선 임시로 반장을 정하고 학생들이 서로 친숙해진 후에 정식으로 선거를 통해 반장을 선출하려고 한다.
			그는 자기반 학생 중에서 1학년부터 5학년까지 지내오면서 한번이라도 같은 반이었던 사람이 가장 많은 학생을 임시 반장으로 정하려 한다.
			그래서 김갑동 선생님은 각 학생들이 1학년부터 5학년까지 몇 반에 속했었는지를 나타내는 표를 만들었다.
			예를 들어 학생 수가 5명일 때의 표를 살펴보자.
			위 경우에 4번 학생을 보면 3번 학생과 2학년 때 같은 반이었고, 3번 학생 및 5번 학생과 3학년 때 같은 반이었으며,
			2번 학생과는 4학년 때 같은 반이었음을 알 수 있다. 그러므로 이 학급에서 4번 학생과 한번이라도
			같은 반이었던 사람은 2번 학생, 3번 학생과 5번 학생으로 모두 3명이다.
			이 예에서 4번 학생이 전체 학생 중에서 같은 반이었던 학생 수가 제일 많으므로 임시 반장이 된다.
			각 학생들이 1학년부터 5학년까지 속했던 반이 주어질 때, 임시 반장을 정하는 프로그램을 작성하시오.
	*/
		problem23 prob = new problem23();

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int[][] arr = new int[num][num];

		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<5;j++) {
				arr[i][j] = sc.nextInt();
			}
		}


		System.out.println(prob.solution(arr));
	}

	public int solution(int[][] arr) {

		int answer = 0;
		int ans = 0;
		for(int i=0;i<arr.length;i++) {
			int count = 0;
			for(int j=0;j<arr.length;j++) {
				for(int k=0; k<5;k++) {
					if(arr[i][k] == arr[j][k]) { // 하나하나 비교를 해줘야하기때문에 for문을 한번더 돌려줘야된다. 그래야 arr[i][j] 고정하면서 하나하나 다 비교한다
						count++;
						break;
					}
				}
			}
			if(count > answer) { // 비교하면서 큰 숫자를 찾아간다
				answer = count;
				ans = i;
			}

		}
		ans+=1;
		return ans;
	}
}
