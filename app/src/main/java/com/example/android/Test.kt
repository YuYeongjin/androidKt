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

}