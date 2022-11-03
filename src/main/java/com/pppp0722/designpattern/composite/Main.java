package com.pppp0722.designpattern.composite;

public class Main {

    public static void main(String[] args) {
        Directory directory1 = new Directory("directory1");
        Directory directory2 = new Directory("directory2");
        File file1 = new File("file1");
        File file2 = new File("file2");
        directory1.add(file1);
        directory2.add(file2);
        directory1.add(directory2);

        System.out.println(directory1.getName());
        System.out.println(directory1.getChild(0).getName());
        System.out.println(directory1.getChild(1).getName());
        System.out.println(directory1.getChild(1).getChild(0).getName());
    }
}
