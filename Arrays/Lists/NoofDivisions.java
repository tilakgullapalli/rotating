package Lists;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class NoofDivisions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		List<Integer> numbers = new LinkedList<Integer>();
		System.out.println("Enter how many numbers you have to enter : ");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			numbers.add(sc.nextInt());
		}
		System.out.println(getMinimumOperations(numbers));
		sc.close();

	}

	private static List<Integer> getMinimumOperations(List<Integer> numbers) {
		// TODO Auto-generated method stub
		int[] arr= new int[numbers.size()];
		for(int i=0;i<numbers.size();i++) {
			arr[i]=numbers.get(i);
		}
		List<Integer> result = new LinkedList<Integer>();
		for(int i=0;i<arr.length;i++) {
			result.add(mini(arr[i]));
		}
		return result;
	}

	private static Integer mini(int k) {
		// TODO Auto-generated method stub
		int count=0;
		while(k>1) {
			if(k%2!=0) {
				count = count + 2;
			}else {
				count = count + 1;
			}
			k = k / 2;
		}
		return count+1;
	}

}
