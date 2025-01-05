package com.max.array02;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Hotel hotel = new Hotel();
        Scanner sc = new Scanner(System.in);
        menu();

        while(true) {
            System.out.print("请输入功能编号：");
            int choice = sc.nextInt();
            switch(choice) {
                case 1:
                    hotel.display();
                    break;
                case 2:
                    System.out.print("请输入想要预定房间的编号：");
                    int roomNo = sc.nextInt();
                    hotel.order(roomNo);
                    break;
                case 3:
                    System.out.print("请输入想要退房的编号：");
                    roomNo = sc.nextInt();
                    hotel.exit(roomNo);
                    break;
                case 0:
                    System.out.println("退出系统。");
                    return;
                default:
                    System.out.println("选择错误，请重新选择功能。");
                    break;
            }
        }

    }

    public static void menu() {
        System.out.println("欢迎使用酒店管理系统");
        System.out.println("[1]查看酒店所有房间的状态。");
        System.out.println("[2]预定房间。");
        System.out.println("[3]退房。");
        System.out.println("[0]退出系统。");
    }
}
