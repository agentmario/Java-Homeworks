/**
 * Created by agentmario on 2015/10/12.
 */

import student.*;
import teacher.*;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter student's amount:");
        int x = input.nextInt();
        int y = input.nextInt();

        Bachelor[] groupB = new Bachelor[x];
        Master[] groupM = new Master[y];
        for (Bachelor b : groupB) {
            String n = input.next();
            String p = input.next();
            String t = input.next();
            String pr = input.next();
            int pt = input.nextInt();
            int f = input.nextInt();
            b = new Bachelor(n, p, t, pr, pt, f);
        }
        for (Master m : groupM) {
            String n = input.next();
            String p = input.next();
            String t = input.next();
            String pr = input.next();
            int pt = input.nextInt();
            int f = input.nextInt();
            String d = input.next();
            String tu = input.next();
            m = new Master(n, p, t, pr, pt, f, d, tu);
        }
        int opt = 1;
        System.out.println("Press 1 to query a Bachelor, 2 to query a Master,0 to quit");
        while (opt == 1 || opt == 2) {
            opt = input.nextInt();
            if (opt == 2) {
                System.out.println("There's " + groupB.length + " bachelor student(s).");
                int n = input.nextInt();
                if (n <= groupB.length) {
                    System.out.println(groupB[n - 1].getTeacher());
                }
            }
            if (opt == 1) {
                System.out.println("There's " + groupM.length + " master student(s).");
                int n = input.nextInt();
                if (n <= groupM.length) {
                    System.out.println(groupM[n - 1].getTutor());
                }
            }
        }

    }
}
