package com

class demo6 {
    public static void main(String[] args) {
        def a={
            println "a this:"+this
            println "a owner:"+owner
            def b={
                println "b this:"+this
                println "b owner:"+owner
            }
            b.call()
        }
        a.call()
    }
}
