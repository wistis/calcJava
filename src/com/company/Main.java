package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        String string = in.nextLine();

        string = string.replace(" ", "");//убираем пробелы
        string = string.replace("\"", "");//убираем кавычку


        String[] subStr;
        String delimeter; // Разделитель

        delimeter = "\\+";

        subStr = string.split(delimeter); // Разделения строки str с помощью метода split()


        if (subStr.length == 2) {
            System.out.println(subStr[0] + "" + subStr[1]);
        }
        /*Ниже определение чтроки или числа*/
        if (new Scanner(subStr[1]).hasNextInt()) {
            int number = Integer.parseInt(string);
            System.out.printf( "ЧИСЛО");
        }else {
            System.out.printf( "СТРОКА");
        }



        in.close();
    }



}
