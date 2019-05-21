package Lists;
import java.io.*;
import java.util.*;

class Db {
    public static long doubleSize(List<Long> a, long b) {
    // Write your code here
    Collections.sort(a);
    long temp=0;
    for(long l:a){
        temp = b+b;
        if(l==temp || l==b ){
            b=temp;
        }
    }
    return b;
    }

}

public class Test_Doubling {
    public static void main(String[] args) throws IOException {
        
        List<Long> a = new ArrayList<Long>();{
        	a.add((long) 1);
        	a.add((long) 1);
        	a.add((long) 2);
        	a.add((long) 2);
        	a.add((long) 3);
        	a.add((long) 4);
        }

        

        long b = 1;

        long result =Db.doubleSize(a, b);

        System.out.println(String.valueOf(result));
    }
}
