package ru.netology.service;
import java.util.Scanner;

import java.util.Scanner;

public class CustomsService {
    public static String serv() {
        System.out.print("Цена товара(в рублях): ");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        System.out.print("Вес товара(в кг): ");
        int y = scanner.nextInt();
        Double res = x * 0.01 + y * 3;
        Integer ares = res.intValue();
        String result = ("Размер пошлины  рублях составит: " + ares.toString());
        return(result);
        //System.out.println(result);
    }


}
