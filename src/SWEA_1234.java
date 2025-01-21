import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//비밀번호
public class SWEA_1234 {
	
	public static List passCheck(List<Integer> password) {
		boolean check=false;
		for(int x=0;x<password.size()-1;x++) {
			if(password.get(x)==password.get(x+1)) {
				password.remove(x);
				password.remove(x);
				check=true;
			}
			else {}
		}
		
		if(!check) {
			return password;
		}
		else
			return passCheck(password);
		
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int testCase=2;
		for(int test=1;test<testCase+1;test++) {			
			int N =sc.nextInt();			
			String[] array = sc.next().split("");
			List<Integer> password = new ArrayList();
			
			for(int i=0;i<N;i++) {
				
				password.add(Integer.parseInt(array[i]));
			}
			password = passCheck(password);
			System.out.printf("#%d ",test);
			for(int a : password) {
				System.out.printf("%d",a);
			}
			System.out.println();
		}
		

	}

}
