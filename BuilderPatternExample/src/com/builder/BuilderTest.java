package com.builder;

public class BuilderTest {

    public static void main(String[] args) {

        Computer computer = new Computer.Builder()
                .setCPU("Intel Core i7")
                .setRAM("16 GB")
                .setStorage("1 TB SSD")
                .build();

        computer.showConfig();
    }
}