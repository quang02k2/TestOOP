package com.example.testoop.helper;

import java.util.Scanner;

public class InPutHelper {
    private static Scanner scanner = new Scanner(System.in);
    public static int nhapInt(String mes) {
        int value = 0;
        boolean isCheck = false;
        System.out.println(mes + ": ");
        String input = scanner.nextLine();
        while (!isCheck) {
            try {
                value = Integer.parseInt(input);
                if (value >= 0) {
                    isCheck = true;
                } else {
                    System.out.println("Nhap sai moi nhap lai");
                    input = scanner.nextLine();
                }
            } catch (Exception e) {
                System.out.println("Nhap ko dung. Moi nhap lai");
                input = scanner.nextLine();
            }
        }

        return value;
    }

    public static String nhapString(String mes) {
        System.out.print(mes + ": ");
        String str = "";
        str = scanner.nextLine();
        return str;
    }
}
