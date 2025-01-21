//별삼각형3

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Jung_1329  {

	public static void makeStar(int n) {
		 for(int i=0;i<n;i++) {
	    	 if(i<=n/2) {
	    		 for(int j=0;j<i;j++) {
	    			 System.out.print(" ");
	    		 } 		
	    		 for(int j=0;j<i*2+1;j++) {
	    			 System.out.print("*");
	    		 }
	    		 System.out.println();	    		 
	    		
	    	 }
	    	 else {
	    		 for(int j=1;j<n-i;j++) {
	    			 System.out.print(" ");
	    		 }	
	    		 for(int j=1;j<(n-i)*2;j++) {
	    			 System.out.print("*");
	    		 }
	    		 System.out.println();	
	    	 }
	    		 
	    		
	    	 System.out.println();
	     }
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int N = Integer.parseInt(st.nextToken());
		
		if(N>100 ||N%2==0) {
			System.out.println("INPUT ERROR!");
		}
		else {
			makeStar(N);
		}

	}

}
