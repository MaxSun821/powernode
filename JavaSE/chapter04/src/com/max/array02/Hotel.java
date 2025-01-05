package com.max.array02;

import java.util.Arrays;

public class Hotel {
    private Room[][] rooms;
    public Hotel() {
        rooms = new Room[6][10];
        for (int i = 0; i < rooms.length; i++) {
            if (i < 2) {
                for (int j = 0; j < rooms[i].length; j++) {
                    rooms[i][j] = new Room((i + 1) * 100 + j + 1, "单人间", false);
                }
            } else if (i < 4) {
                for (int j = 0; j < rooms[i].length; j++) {
                    rooms[i][j] = new Room((i + 1) * 100 + j + 1, "标准间", false);
                }
            } else {
                for (int j = 0; j < rooms[i].length; j++) {
                    rooms[i][j] = new Room((i + 1) * 100 + j + 1, "豪华间", false);
                }
            }

        }
    }

    public void order(int roomNo) {
        for (int i = 0; i < rooms.length; i++) {
            for (int j = 0; j < rooms[i].length; j++) {
                if (rooms[i][j].getRoomNO() == roomNo) {
                    if (!rooms[i][j].isState()) {
                        rooms[i][j].setState(true);
                        System.out.println("预定房间[" + roomNo + "]成功");
                    } else {
                        System.out.println("预定房间[" + roomNo + "]失败");
                    }
                }
            }
        }
    }

    public void exit(int roomNo) {
        for (int i = 0; i < rooms.length; i++) {
            for (int j = 0; j < rooms[i].length; j++) {
                if (rooms[i][j].getRoomNO() == roomNo) {
                    if (rooms[i][j].isState()) {
                        rooms[i][j].setState(false);
                        System.out.println("退房[" + roomNo + "]成功");
                    } else {
                        System.out.println("退房[" + roomNo + "]失败");
                    }
                }
            }
        }
    }

    public void display() {
        for (int i = 0; i < rooms.length; i++) {
            for (int j = 0; j < rooms[i].length; j++) {
                System.out.print(rooms[i][j]);
            }
            System.out.println();
        }
    }
}
