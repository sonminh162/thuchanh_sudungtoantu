package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    float chieurong,chieudai;
        Scanner scanner = new Scanner(System.in);
        System.out.printf("nhap vao chieu rong");
        chieurong = scanner.nextInt();
        System.out.printf("nhap vao chieu dai");
        chieudai = scanner.nextInt();
        System.out.println("dien tich hinh chu nhat la:" +chieudai*chieurong);
    }
}
