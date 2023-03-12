package com

class demo9 {
    def id
    def name

    demo9(def id, def name) {
        this.id = id
        this.name = name
    }

    public static void main(String[] args) {

        def d1 = new demo9(1, "aaa")
        def d3 = new demo9(3, "bbb")
        def d2 = new demo9(4, "ccc")


        def list = [1, 32, 341, 31, 311]
        println list.sort()
        println list.sort {
            a, b -> a - b ? -1 : 0
        }
        def dList = [d1, d2, d3]
        println dList.sort {
            a, b -> a.id - b.id ? 1 : -1
        }
        println list.findAll{
            it->it>10
        }
    }

    @Override
    String toString() {
        return "demo9{" +
                "id=" + id +
                ", name=" + name +
                '}';
    }
}
