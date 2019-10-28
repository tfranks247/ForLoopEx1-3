package com.company;

public class Main {

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) { // 1 goes through the loop..condition "1 is less than or equal to 10" thats true. It
            // 1 then gets added to i via the i++
            // 2 then goes through the loop until i is becomes 11 and then exits the loop
            // then it will print out
            System.out.println(i);
        }
        for (int i = 10; i >= 1; i--) { // 10 goes through the loop and is greater than one
            // then it goes through the loop and prints 10
            // then i-- brings 10 down to 9 by subtracting 1
            // i will go through the loop until 0 because it is not greater than or equal to one
            // at this point the loop ends and it prints out 10 to 1
            System.out.println(i);
        }

        for (int i = 1; i <= 20; i++) { // 1
            if (i % 2 != 0) {
                System.out.println(i);
            }

            // write your code here
        }
    }

}
