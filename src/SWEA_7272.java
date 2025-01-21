import java.io.*;
import java.util.*;
 
//안경이 없어!
public class SWEA_7272 {
    static int maximum = 10;
 
    public static int check(char c) {
        if(c=='A'||c=='D'||c=='O'||c=='P'||c=='Q'||c=='R') {
            return 1;
        }
        else if(c=='B') {
            return 2;
        }
        else {
            return 3;
        }
    }
 
    public static void main(String[] args) throws NumberFormatException, IOException {
        // TODO Auto-generated method stub
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
        int T = Integer.parseInt(br.readLine());
        for (int test = 1; test <= T; test++) {
            String result="DIFF";
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            String N = st.nextToken();
            String K = st.nextToken();
            if(N.length()==K.length()) {
                for(int i=0;i<N.length();i++) {
                    if(check(N.charAt(i))==check(K.charAt(i))){
                        result="SAME";
                    }
                    else {
                    	result="DIFF";
                        break;
                    }
                     
                }
            }
            else {
            	break;
            }
           
             
            System.out.printf("#%d %s\n",test,result);
     
 
            }
 
        }
    }