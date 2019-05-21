import java.io.*;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
public class RotatingArrays {
    static int[] rotLeft(int[] a, int d) {
        int[] b = new int[a.length];
        for(int i=0;i<a.length;i++)
        {
        	if(i+d>a.length-1){
        		int n = (i+d)%(a.length);
        		b[i]=a[0+n];
        	}else{
        		b[i]=a[i+d];
        	}
        }
    	/*int temp=0;
    	int n=0;
    	for(int i=0;i<a.length;i++){
    	temp=a[i];
    	for(int j=0;j<a.length;j++){
    	if(j+d > a.length-1){
    		n=(j+d)%(a.length);
    		if(j+d==i || n==i){
    			a[i]=temp;
    		}else{
    			a[j]=a[0+n];
    		}
    	}else{
    		a[j]=a[j+d];
    	}
    	}
    	}*/

    	
		return b; 
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
       System.out.println("Enter no of Rotations to be done : "); 
        int d=sc.nextInt();
        int[] result = rotLeft(a, d);
        System.out.println("Array after rotating left :"+Arrays.toString(result));
        }catch(InputMismatchException e) {
        	System.out.println("Only numbers to be entered ");
        }
    }
}
