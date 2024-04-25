package InterviewQue;

import java.util.Scanner;

public class LiftQueriesDemo {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 1, b = 7, n, call;
        System.out.println("Enter the number of test cases:");
        n = sc.nextInt();
        while (n != 0) {
            System.out.println("Enter the test case:");
            call = sc.nextInt();
            System.out.println(findNearestLift(a, b, call));
            n--;
        }
        sc.close();
    }

    public static char findNearestLift(int a, int b, int call) {
        if (Math.abs(call - a) <= Math.abs(call - b)) {
            return 'A';
        } else {
            return 'B';
        }
    }

}
