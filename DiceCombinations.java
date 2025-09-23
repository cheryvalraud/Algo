import java.io.*;
import java.util.*;
class DiceCombinations{

static PrintWriter out = new PrintWriter(System.out,true);
static final int MOD = 1_000_000_007;



public static void main(String []args){

  

  Scanner sc = new Scanner(System.in);


  int n = sc.nextInt();


  long [] dp = new long[n + 1];

  dp[0] = 1;
  int ex = 0;


for(int i =1; i <= n; i++){

	for(int dice = 1 ; dice <= 6; dice++){
       
       if(i - dice >= 0){
       	 ex = i - dice;
       
       	dp[i] = (dp[i] + dp[i - dice]) % MOD;
       }else{
       
       }

     
      
	}


}


out.println(dp[n]);



}


}

