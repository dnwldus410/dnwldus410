//별삼각형2

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Jung_1719 {
	public static void makeStar(int n, int m) {
		switch(m) {
		case 1:
		     for(int i=0;i<n;i++) {
		    	 if(i<=n/2) {
		    		 for(int j=0;j<i+1;j++) {
		    			 System.out.print("*");
		    		 }		    		
		    	 }
		    	 else
		    		 for(int j=0;j<n-i;j++) {
		    			 System.out.print("*");
		    		 }
		    	 System.out.println();
		     }
			break;
		case 2:
			  for(int i=0;i<n;i++) {
			    	 if(i<=n/2) {
			    		 for(int j=i;j<n/2;j++) {
			    			 System.out.print(" ");
			    		 }
			    		 
			    		 for(int j=0;j<i+1;j++) {
			    			 System.out.print("*");
			    		 }		    		
			    	 }
			    	 else {
			    		 for(int j=n/2;j<i;j++) {
			    			 System.out.print(" ");
			    		 }	
			    		 for(int j=0;j<n-i;j++) {
			    			 System.out.print("*");
			    		 }
			    	 }
			    		 
			    		
			    	 System.out.println();
			     }
			break;
		case 3:
			 for(int i=0;i<n;i++) {
		    	 if(i<=n/2) {
		    		 for(int j=0;j<i;j++) {
		    			 System.out.print(" ");
		    		 }
		    		 
		    		 for(int j=n-i;j>i;j--) {
		    			 System.out.print("*");
		    		 } 		
		    	 }
		    	 else {
		    		 for(int j=1;j<n-i;j++) {
		    			 System.out.print(" ");
		    		 }	
		    		 for(int j=n-i;j<i+2;j++) {
		    			 System.out.print("*");
		    		 }
		    	 }
		    		 
		    		
		    	 System.out.println();
		     }
			
		
			break;
		case 4:
			 for(int i=0;i<n;i++) {
		    	 if(i<=n/2) {
		    		 for(int j=0;j<n/2&&j<i;j++) {
		    			 System.out.print(" ");
		    		 }
		    		 
		    		 for(int j=0;j<n/2-i+1;j++) {
		    			 System.out.print("*");
		    		 } 		
		    	 }
		    	 else {
		    		 for(int j=0;j<n/2&&j<i;j++) {
		    			 System.out.print(" ");
		    		 }
		    		 for(int j=0;j<i-n/2+1;j++) {
		    			 System.out.print("*");
		    		 }
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
		
		if(N>100 ||N%2==0 || 1>M || 4<M ) {
			System.out.println("INPUT ERROR!");
		}
		else {
			makeStar(N,M);
		}
		
	}

}
