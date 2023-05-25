package LearnKotlin

//student继承teacher
class Student(val sno: String, val grade: Int, name: String, age: Int) : Person(name, age), Study{
    init {
        //主构造函数的初始化
        println(sno + "..." + grade)
    }

    //构造函数1
    constructor(name: String,age: Int):this("",0,name,age){
        println("构造函数1")
    }

    //构造函数2,构造函数2间接的调用了构造函数1
    constructor():this("",0){
        println("构造函数2")
    }

    //这里是实现了Study接口的一个待实现类
    override fun readBooks() {
        println("这里是实现了Study接口的一个待实现类")
    }
}

fun main(){
    val student = Student("xiaowang", 19)
    doStudy(student)

    mapLearn()
}

//集合的函数式api
//这里显示的是一个如何在一个水果集合中找到单词最长的那个
fun lambdaLearn(){
    val list001 = listOf("Apple","Banana","Orange","Watermalon")
    var maxLengthFruit = list001.maxByOrNull { it.length }
    println("max length fruit is " + maxLengthFruit)
}

//使用了Study接口来进行表示
fun doStudy(study: Study?){
    if(study != null){
        study.readBooks()
        study.doHomework()
    }
}

//创建和遍历map集合中的数据
fun mapLearn(){
    val map = mapOf("Apple" to 1,"Banana" to 2, "Orange" to 3)
    for((fruit, number) in map){
        println("fruit is " + fruit + ", number is " +number)
        println("Cell(fruit=$fruit,number=$number")
    }
}

//创建和遍历,添加数据的list和set集合
fun setAndList(){
    //这里list集合的创建和遍历,但是这个集合是不可变集合
    val list = listOf("Apple","Banana","Orange");
    //这里创建的是一个可变list集合
    val list1 = mutableListOf("Apple","Banana","Orange");
    list1.add("Watermelon")
    //这里创建的是一个set集合不可变的
    val set = setOf("Apple","Banana","Orange");
    //这里创建的是一个set集合,可变的
    val set1 = mutableSetOf("Apple","Banana","Orange");
    set1.add("Watermelon")
    for (fruit in set1){
        println(fruit)
    }
}