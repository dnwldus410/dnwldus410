import java.util.Scanner;

//직사각형 만드는 방법
public class Back_8320 { 

	public static int primeNum(int num) {
		int result = 0;
		int prime = (int) Math.sqrt(num);

		for (int i = 1; i <= prime; i++) {
			if (num % i == 0) {

				result++;
			}

		}
		return result;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int result = 0;
	
		
		  for (int i = 1; i < N + 1; i++) 
		  {
			 
				  result+=primeNum(i);
			 
			
		  
		  }
		 
		
		System.out.println(result);
		sc.close();

	}

}
