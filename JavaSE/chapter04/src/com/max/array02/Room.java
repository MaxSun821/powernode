package com.max.array02;

public class Room {
    private int roomNO;
    private String type;
    private boolean state;

    public Room() {
    }

    public Room(int roomNO, String type, boolean state) {
        this.roomNO = roomNO;
        this.type = type;
        this.state = state;
    }

    public int getRoomNO() {
        return roomNO;
    }

    public void setRoomNO(int roomNO) {
        this.roomNO = roomNO;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "[" + roomNO +
                ", " + type +
                ", " + (state ? "占用" : "空闲") +
                "]";
    }
}
