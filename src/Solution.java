import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int[] c) {
    	
    	int safeCloudCounter=0;
    	int jumpCounter=0;
    	for (int i = 0; i < c.length; i++) {
    		int currentCloud = c[i];
    		if (currentCloud == 0) {
    			safeCloudCounter++;
    			continue;
    		} else {
    			int noOfJumps = safeCloudCounter / 2;
    			jumpCounter += noOfJumps+1;
    			safeCloudCounter = 0;
    		}
    	}
    	if (safeCloudCounter > 0) {
    		int noOfJumps = safeCloudCounter / 2;
    		jumpCounter += noOfJumps;
    	}
    	return jumpCounter;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] c = new int[n];

        String[] cItems = scanner.nextLine().split(" ");

        for (int i = 0; i < n; i++) {
            int cItem = Integer.parseInt(cItems[i]);
            c[i] = cItem;
        }

        int result = jumpingOnClouds(c);

        System.out.println(String.valueOf(result));

        scanner.close();
    }
}
