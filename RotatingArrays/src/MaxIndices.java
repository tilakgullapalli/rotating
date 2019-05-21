import java.io.IOException;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MaxIndices {
	static int rotLeft(int[] a, int d) {
		 int[] b = new int[a.length];
	        for(int i=0;i<a.length;i++)
	        {
	        	if(i+d>a.length-1){
	        		int n = (i+d)%(a.length);
	        		System.out.println("n ="+n);
	        		b[i]=a[0+n];
	        	}else{
	        		b[i]=a[i+d];
	        	}
	        }
       
        	int Mi=GetMaxIndex(b);
       
		 return Mi;
    }
	
    private static int GetMaxIndex(int[] b) {
		int max=b[0];
		int index=0;
		for(int i=0;i<b.length;i++) {
			if(b[i]>max) {
				max=b[i];
				index=i;
			}
			
		}
		
		return index;
	}



	public static void main(String[] args) throws IOException {
       try(Scanner sc =new Scanner(System.in)){
       System.out.println("Enter Size of Array :");
       int size=sc.nextInt();
       int[] a = new  int[size];
       System.out.println("Enter elements into Array :");
       for(int i=0;i<size;i++) {
    	   a[i]=sc.nextInt();
       }
       int[] d = new  int[size];
       System.out.println("Enter elements into Rotations Array: "); 
       for(int i=0;i<size;i++) {
    	   d[i]=sc.nextInt();
       }
       int[] result = new int[size];
       for(int i=0;i<size;i++) {
    	    result[i] = rotLeft(a, d[i]);
       }
       
        System.out.println("Maximum number  index after rotating left :"+Arrays.toString(result));
        }catch(InputMismatchException e) {
        	System.out.println("Only numbers to be entered ");
        }
    }
}
