package com

class demo10 {
    public static void main(String[] args) {
        def list=["love","you"]
        println list.inject("I"){
            sum,elem->"${sum} ${elem}"
        }
    }
}
