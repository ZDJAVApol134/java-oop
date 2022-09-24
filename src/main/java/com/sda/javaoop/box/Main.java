package com.sda.javaoop.box;

public class Main {

    public static void main(String[] args) {
        Box box = new Box("MyBox");
        Box box1 = new Box(box);
        box1.setBoxCapacity(10);

        Box box2 = Box.copyBox(box1);

        System.out.println(box);
        System.out.println(box1);
        System.out.println(box2);
    }

}
