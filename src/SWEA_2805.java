import java.io.*;
import java.util.*;

//농작물 수확하기
public class SWEA_2805 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		sc.nextLine();
		for (int test = 1; test < T + 1; test++) {
			int N = sc.nextInt();
			sc.nextLine();
			int[][] arrayN = new int[N][N];
			for (int i = 0; i < N; i++) {
				String[] strArr = sc.next().split(""); // storing numbers as characters using the split().
				for (int j = 0; j < N; j++) {
					arrayN[i][j] = Integer.parseInt(strArr[j]);
				}

			}
	 

			int result = 0;
			for (int x = 0; x < N; x++) {
				if (x <= (N - 1) / 2) {
					for (int y = (N - 1) / 2 - x; y < (N - 1) / 2 + x + 1; y++) {
						result += arrayN[x][y];
					}
				} else {
					for (int y = (N - 1) / 2 - (N - x)+1; y < (N - 1) / 2 + (N - x); y++) {
						result += arrayN[x][y];
					}
				}
			}
			System.out.printf("#%d %d\n", test, result);

			sc.close();

		}

	}

}
