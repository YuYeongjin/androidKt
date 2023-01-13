val data1 = 10
var data2 = 20
val data3 : Int = 1

fun main(){
    println("hello world")

//    data1 = 20
    data2 = 40


    fun sum(no: Int):Int{
        var sum=0
        for(i in 1..no){
            sum +=i
        }
        return sum
    }
    val name : String = "yeongjin"
    println("name : $name, sum : ${sum(10)}, plus : ${10+20}")

    val arr1: Array<Int> = Array(3,{1})
    val arr2= arrayOf<Int>(10,100,1000,10000)
    arr1[0]=10
    arr1[1]=100
    arr1.set(2,10000)
    println(
        """
            array1 size : ${arr1.size}
            array1 data : ${arr1[0]}, ${arr1.get(1)}, ${arr1.get(2)}
            array2 size : ${arr2.size}            
        """.trimIndent()

    )

    var list = listOf<Int>(1,2,3)
    var mlist = mutableListOf<Int>(10,20,30)
    val map = mapOf<String, String>(Pair("one","android"), "two" to "language")

    mlist.add(3, 40)
    mlist.add(50)
    mlist.set(4,1)

    println("""
        list size : ${list.size}
        list data : ${list[0]} , ${list.get(1)}, ${list.get(2)}
        mlist size : ${mlist.size}
        mlist data ${mlist.get(mlist.size-1)}
        map size : ${map.size}
        map data : ${map.get("one")} , ${map.get("two")}
    """.trimIndent())


    val ifReturn = if(data1 >0){
        println("data1은 0이상")
        true
    }else {
        println("data1은 0이하")
        false
    }
    println("ifReturn : "+ ifReturn)

    
    println("*******************")
    
    val str  = "one"
    when (str){
        "one" -> println("str은 1")
        "two" -> println("str은 2")
        is String -> println("str은 문자열임")
//        in 1..10 -> println("str은 1부터 10까지 숫자임")
        else ->{
            println("str은 범위를 벗어남")
        }
    }

    var sumI :Int = 0
    for (i in data3..10){
        sumI +=i
    }
    if(sumI>100){
        println("sumI의 값 100이상이고 값은 : ${sumI}" )
    } else{
        println("sumI의 값 100이하이고 값은 : ${sumI}" )
    }
}