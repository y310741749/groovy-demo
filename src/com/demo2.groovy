package com

class demo2 {
    public static void main(String[] args) {
        def list = [1,2]
        list.leftShift(3)
        list.push(0)
        list.add(4)
        list << 5
        list += 6

        list.each {
            it->println it
        }
        list.collect{
            it->println "hahaha${it}"
        }
//        100.times {
//            println list.get(0)
//        }
    }
}
