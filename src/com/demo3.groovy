package com

class demo3 {
    public static void main(String[] args) {
        def map = [a:1,b:new Date()]
        def c="c"
        map.put(c,"cccc")
        map.c="sdsd"
        println map
    }
}
