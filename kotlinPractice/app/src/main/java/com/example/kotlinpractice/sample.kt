package com.example.kotlinpractice

fun main() {
    helloWorld();
    println(add(1,4));
    println(maxby(5,3));
    println(checknum(2));
}

fun helloWorld(){
    println("hello world!");
}

fun add(a : Int, b : Int) : Int {
    return a + b;
}

fun maxby(a : Int, b : Int) = if(a>b) a else b;

fun checknum(a: Int) : String {
    var out : String;
    when(a) {
        0 -> out = "this is zero";
        in 1..99 -> out = "this is one";
        100,101-> out = "this is two or three";
        else -> out = "i don't know";
    }
    return out;
}

fun array(){
    val ary  = arrayOf(1,2,3);
    val lst  = listOf(1,2,3);
    val ary2 = arrayOf(1, "d", 3.14f);
    val list2 = listOf(3, "a", 5.31f);
    val mlist = mutableListOf(5, "t", 11L);

    mlist.set(0, "tt");
}
