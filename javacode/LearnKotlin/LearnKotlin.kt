package LearnKotlin

import java.lang.Math.max

fun main(){
    println("HelloWorle")
    var a: Int = 10
    a = a * 10
    println("a = " + a )
    a = largeNumber4(10, 20)
    println("a = " + a )
    println("---------------")
    circulatetest()
    println("---------------")
    circulatetest3()
}

//函数示例
fun largeNumber(num1: Int, num2: Int): Int {
    return max(num1, num2)
}

//使用基础语法糖之后的函数
fun largeNumber2(num1: Int, num2: Int) = max(num1, num2)

//if条件语句
fun largeNumber3(num1: Int, num2: Int): Int{
    var value = 0
    if(num1 > num2){
        value = num1
    }else{
        value = num2
    }
    return value
}

//使用if语句中的每一个条件中最后一行代码的返回值+语法糖
fun largeNumber4(num1: Int, num2: Int) = if(num1 > num2) num1 else num2

//when条件语句
fun getScore(name: String) = when (name){
    "Tom" -> 100
    "Jim" -> 50
    "Jack" -> 1
    else -> 0
}

//when也可以这样使用
//Number在kotlin中是一个抽象类,Int Double Long 什么都是它的子类
fun checkNumber(num: Number){
    when(num){
        is Int -> println("int")
        is Double -> println("double")
        else -> println("不是int也不是double")
    }
}

//循环语句,左闭右闭
fun circulatetest() {
    for (i in 0..10){
        println(i)
    }
}

//循环语句2,左闭右开,并且每次循环会递增2
fun circulatetest2() {
    for (i in 0 until 10 step 2){
        println(i)
    }
}

//循环语句3,左闭右开,降序,并且每次循环会递减2
fun circulatetest3() {
    for (i in 10 downTo  1 step 2){
        println(i)
    }
}