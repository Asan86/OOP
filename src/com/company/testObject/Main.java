package com.company.testObject;

public class Main {

    public static void main(String[] args) {
	// write your code here
    Computer computer = new Computer("IBM", 2048, 500, 3);

//    computer.setName("IBM");
//    computer.setRam(2048);
//    computer.setHdd(500);
//    computer.setWeight(7.8);


    computer.on();
    computer.load();
    computer.off();
    }
}
