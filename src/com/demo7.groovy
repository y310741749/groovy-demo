package com

class demo7 {
    public static void main(String[] args) {
        String.metaClass.say={-> return "I am 123"}
        println "a".say()
    }
}
