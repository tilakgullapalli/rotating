package Arrays;

import java.util.Arrays;

public class Cust_Sale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int prod=500;
		int[] c_req= {25,15,24,36,17,10,2,27,40,1,4,6,8,20,39,50,69};
		int c_len=c_req.length;
		int n_req=t_req(c_req,c_len);
		System.out.println("Intial products "+prod);
		int j=1;
		
		while(prod!=0 && n_req!=0) {
			for(int i=0;i<c_len;i++) {
				if(c_req[i]>10) {
					c_req[i]=c_req[i]-10;
					prod=prod-10;
					System.out.println("Remaining Products "+prod);
					System.out.println("After "+(i+1)+" Person "+j+" round");
				}else {
					prod=prod-c_req[i];
					c_req[i]=0;
					
					System.out.println("Remaining Products "+prod);
					System.out.println("After "+(i+1)+" Person "+j+" round");
				}	
			}
			System.out.println(Arrays.toString(c_req));
			 n_req=t_req(c_req,c_len);
			 j++;
		}
		
	}

	private static int t_req(int[] c_req,int c_len) {
		int result=0;
		for(int i=0;i<c_len;i++) {
			result=result+c_req[i];
		}
		// TODO Auto-generated method stub
		return result;
	}

}
