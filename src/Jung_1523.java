import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//별삼각형1
public class Jung_1523 {
	public static void makeStar(int n, int m) {
		switch(m) {
		case 1:
			for(int i=0;i<n;i++) {
				for(int j=0;j<i+1;j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			break;
		case 2:
			for(int i=n-1;i>=0;i--) {
				for(int j=i;j>=0;j--) {
					System.out.print("*");
				}
				System.out.println();
			}
			break;
		case 3:
			for(int i=1;i<n+1;i++) {
				for(int k=n-i;k>0;k--) {
					System.out.print(" ");
				}
				for(int j=1;j<i*2;j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			
		
			break;
		}
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		if(N>100 || 1>M || 3<M ) {
			System.out.println("INPUT ERROR!");
		}
		else {
			makeStar(N,M);
		}
	}

}
