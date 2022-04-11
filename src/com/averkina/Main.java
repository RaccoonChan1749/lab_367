package com.averkina;

import java.util.Scanner;

public class Main {

    public static boolean canModify (String oneStr, String twoStr) {
        var index = 0;
        boolean oneСhange = false;
        boolean twoСhange = false;
        boolean result = false;

        if(Math.abs(oneStr.length() - twoStr.length()) > 1) {
            return false;
        }

        while (index < oneStr.length() && index < twoStr.length()) {
            if(oneStr.toCharArray()[index] != twoStr.toCharArray()[index]) {
                if(!oneStr.substring(index+1).equals(twoStr.substring(index+1))
                        && !oneStr.substring(index).equals(twoStr.substring(index+1))
                        && !oneStr.substring(index+1).equals(twoStr.substring(index))){
                     return false;
                 }
                 else {
                     return true;
                 }
            }
            index++;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int menu = 1;

        while(menu < 3) {
            System.out.println("------------------------------------------");
            System.out.print("1.Тест кейсы\n2.Свои строки\n3.Dыход\nВведите пункт меню: ");

            try {
                menu = in.nextInt();
                if(menu < 1 || menu > 3) {
                    throw new Exception();
                }
                in.nextLine();
            }
            catch(Exception ex) {
                System.out.printf("Ошибка! Некорректный ввод пункта меню!\n");
                menu = 0;
                in.nextLine();
            }
            System.out.println("------------------------------------------");

            if (menu == 1) {
                System.out.print("cat/dog - ");
                System.out.println(canModify("cat", "dog"));
                System.out.print("cat/acts - ");
                System.out.println(canModify("cat", "acts"));
                System.out.print("cat/cats - ");
                System.out.println(canModify("cat", "cats"));
                System.out.print("cat/cast - ");
                System.out.println(canModify("cat", "cast"));
                System.out.print("cat/at - ");
                System.out.println(canModify("cat", "at"));
                System.out.print("cat/cut - ");
                System.out.println(canModify("cat", "cut"));
                System.out.print("cat/cu - ");
                System.out.println(canModify("cat", "cu"));
            }

            if(menu == 2) {
                String oneStr = "";
                String twuStr = "";

                System.out.print("Введите первую строку: ");
                oneStr = in.nextLine();
                System.out.print("Введите вторую строку: ");
                twuStr = in.nextLine();
                System.out.print(oneStr + "/" + twuStr + " - ");
                System.out.println(canModify(oneStr.toLowerCase(), twuStr.toLowerCase()));
            }
        }
    }
}
