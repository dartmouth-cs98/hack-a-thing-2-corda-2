package Practice

import java.util.Random

fun main(args: Array<String>){
    println("Hello World");
    val name = "Derek"
    var myAge =42
    var bigInt: Int = Int.MAX_VALUE

    println("Big Int:  $bigInt")

    //Doubles Floats Boolean Short Byte char

    var letterGrade: Char ='A'
    var db: Double =1.1111
    var db2: Double= 1.111111111111111111111111
    //Booleans true false
    println("${letterGrade is Char}")


    //is tells class
    if (true is Boolean){
        print("true is Boolean\n")
    }

    //Casting
    // (3.14.toInt())
    println(letterGrade.toInt())

    val myName = "Aaron"

    val LongStr ="""hisfds
        asldkfsdlfs
        sdfkasf"""

    var fullname = myName + "hi"

    println("${1+2}")

    var len = myName.length

    myName.equals("hi");//equality

    //str.subseuqence gives subsequences

    //Arrays

    var array = arrayOf(1,1,23,"")

    var two = array[2]

    //functions size .equals . contains

    var partArray = array.copyOfRange(0,1)

    println("First : ${array.first()}")

    var sqArray =Array(5,{x -> x*x})

    //Type sepcif
    var arr2: Array<Int> =arrayOf(1,2,3)

    //ranges
    val oneTo10 = 1..10
    var alpha = "A".."Z"

    println("R in Alpha : ${"R" in alpha}")
    val tenTo1 = 10.downTo(1)
    val rng3 = oneTo10.step(3)

    for(x in rng3) println("")

    //.reversed reverse range

    //Conditonals < > <= >= && || !

    val age = 8
    if(age <5){
        println("Go to PreSchool")
    } else if(age==5){
        println("Go to Kindergarden")

    }
    else {
        println("Go to College")
    }

    when(age){
        0,1,2,3,4 -> println("Go to PreSchool")
        5 -> println("Go to Kinder")
        in 6..17 ->{
            //do something
        }
    }
    //Loops
    for(x in 1..10){

    }
    val rand = Random()
    var MagicNum = rand.nextInt(50) +1
    while(MagicNum != 0){
        MagicNum=0

    }
    for(x in 1..20){
        if (x%2 ==0){
            continue
        }
        println("Odd: $x")

        if(x==15) break


    }

    var arr3:Array<Int> =arrayOf(3,6,9)

    for (i in arr3.indices){

    }
    for((idx,value) in arr3.withIndex() ){
        //gets both
    }
    //fun
    fun add(num1: Int, num2:Int): Int =num1 +num2

    fun subtract(num1: Int=1, num2:Int=1): Int= num1 -num2

    add(num1=3,num2=4)

    val numList = 1..20

    val evenList = numList.filter {it % 2==0}
    //val are forever
    //var can be changed



}

fun makeMathFunc(num1: Int): (Int)-> Int ={num2->num1*num2}

fun nextTwo(num:Int): Pair<Int,Int>{
    return Pair(num+1,num+2)
}

//different types of functoins tailrec infix