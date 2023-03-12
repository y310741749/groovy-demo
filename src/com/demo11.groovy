package com;

public class demo11 {
    int id;
    String name;
    public static void main(String[] args) {
        def list=[new demo11(id:1,name:"123"),new demo11(id:2,name:"456")]
        list*.name.each {
            println it
        }
    }
}
