import com.google.gson.internal.bind.util.ISO8601Utils;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ReadUserInputInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Number");

        int num = sc.nextInt();
        System.out.println("Number is " + num);


    }

}
