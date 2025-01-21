//달팽이사각

import java.util.Scanner;

public class Jung_1707 {

	
	public static int[][] Right(int start_x, int start_y, int N,int limit, int num, int[][] array) {
		int result_x=start_x;
		int result_y=start_y;
        if (num > N * N) 
        	return array; // 종료 조건
        else {
        	for (int i = result_y; i < N; i++) {
                if (array[result_x][i] == 0) {
                    array[result_x][i] = num++;
                    result_y=i;
                } 
                else
                	return Down(result_x+1, result_y, N ,limit, num, array);
            }
           
            return Down(result_x+1, result_y, N,limit, num, array);
        }

        
    }

    public static int[][] Down(int start_x, int start_y, int N,int limit, int num, int[][] array) {
    	int result_x=start_x;
		int result_y=start_y;
        if (num > N * N) return array; // 종료 조건
        else {
        	for (int i = result_x; i < N; i++) {
                if (array[i][result_y] == 0) {
                    array[i][result_y] = num++;
                    result_x=i;
                } 
                else
                	return Left(result_x, result_y-1, N,limit, num, array);
            }
           
            return Left(result_x, result_y-1, N,limit, num, array);
        }
        
    }

    public static int[][] Left(int start_x, int start_y, int N,int limit, int num, int[][] array) {
    	   int result_x=start_x;
   		int result_y=start_y;
        if (num > N * N) return array; // 종료 조건
        else {
        	 for (int i = result_y; i >= 0; i--) {
                 if (array[result_x][i] == 0) {
                     array[result_x][i] = num++;
                     result_y=i;
                 } 
                 else
                 	return Up(result_x-1,result_y, N, limit,num, array);
             }
             return Up(result_x-1,result_y, N, limit,num, array);
        }
       
    }

    public static int[][] Up(int start_x, int start_y, int N,int limit, int num, int[][] array) {
    	 int result_x=start_x;
 		int result_y=start_y;
    	if (num > N * N) return array; // 종료 조건
    	else {
    		 for (int i = result_x; i > result_y; i--) {
    	            if (array[i][result_y] == 0) {
    	                array[i][result_y] = num++;
    	                result_x=i;
    	            }
    	            else
    	            	return array;
    	        }
    	        return Right(result_x, result_y+1, N,limit, num, array);
    	}
		
       
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int[][] arrayN = new int[N][N];
		arrayN=Right(0,0,N,N,1,arrayN);
		
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				System.out.print(arrayN[i][j]+" ");
			}
			System.out.println();
			
		}
		sc.close();
	}

}