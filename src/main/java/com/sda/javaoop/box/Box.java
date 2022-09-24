package com.sda.javaoop.box;

import java.util.Objects;

public class Box {

    private String boxName;
    private int boxCapacity;


    public Box() {

    }

    public Box(String boxName) {
        this.boxName = boxName;
    }

    public Box(int boxCapacity) {
        this.boxCapacity = boxCapacity;
    }

    public Box(String boxName, int boxCapacity) {
        this.boxName = boxName;
        this.boxCapacity = boxCapacity;
    }

    public Box(Box box) {
        this.boxName = box.getBoxName();
        this.boxCapacity = box.getBoxCapacity();
    }

    public static Box copyBox(Box box) {
        return new Box(box.getBoxName(), box.getBoxCapacity());
    }

    public String getBoxName() {
        return boxName;
    }

    public void setBoxName(String boxName) {
        this.boxName = boxName;
    }

    public int getBoxCapacity() {
        return boxCapacity;
    }

    public void setBoxCapacity(int boxCapacity) {
        this.boxCapacity = boxCapacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Box)) return false;
        Box box = (Box) o;
        return boxCapacity == box.boxCapacity && Objects.equals(boxName, box.boxName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(boxName, boxCapacity);
    }

    @Override
    public String toString() {
        return "Box{" +
                "boxName='" + boxName + '\'' +
                ", boxCapacity=" + boxCapacity +
                '}';
    }
}
