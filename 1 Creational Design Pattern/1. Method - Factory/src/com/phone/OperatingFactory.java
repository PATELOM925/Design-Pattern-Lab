package com.phone;
import java.util.Scanner;

public class OperatingFactory implements OS {

        Scanner in = new Scanner(System.in);

        public void spec() {
            int x = in.nextInt();

            if (x == 0) {
                System.out.println("IOS");
            }
            if (x == 1) {
                System.out.println("Android");
            } else {
                System.out.println("Windows");
            }

    }
}
