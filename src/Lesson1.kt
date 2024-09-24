//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
const val max=56;
fun main(args: Array<String>) {
//    println("Hello World")
//
//    var age:Int=23
//    age = 34
//
//    val n:Int
//    n=89
//
//    val b:Byte=10
//    val c=45
//    val d:Short=1
//    val i:Long=3000000
//    val s:UInt=56u;
//    val r:Int=0x0F2;//16 c.c.
//    println(r)
//    val bin=0b0101010
//    println(bin)
//    var million=1_000_000
//    println(million)
//    var z:Float=3.14f
//    var hight:Double=2.7
//    var superVar:Double=5.8e-6
//    var ch:Char='a'
//    var str:String="Hello"
//    var sh:String="$str, me"
//    println(sh)

//    print("Введите ваше имя:")
//    val name:String=readLine()!!
//    println("Меня зовут: $name")

//    print("Введите первую переменную:")
//    var a:Int = readLine()!!.toInt()
//    print("Введите вторую переменную:")
//    var b:Float = readLine()!!.toFloat()
//    var result=a*b
//    println("Ответ:$result")
//    println("Ответ:"+String.format("%.2f", result))

//    условный оператор
//    if(a==10) println("Да")
//    else println("Нет")
//    println(if(a==10) "Да" else "Нет")
    //оператор выбора
//    print("Введите номер дня недели:")
//    var n: Int = readLine()!!.toInt()
//    when(n){
//        1-> println("Понедельник")
//        2-> println("Вторник")
//        3-> println("Среда")
//        4-> println("Четверг")
//        5-> println("Пятница")
//        6-> println("Суббота")
//        7-> println("Воскресенье")
//        else -> println("Такого дня недели нет!")
//    }
    print("Введите число:")
    val n:Int = readLine()!!.toInt()
    var range=1 until  n step 2
    var rangeDown=n downTo 2
    if(n in range) {
        var s: Int = 0
        for (i in range) s += i
        println(s)
    }


}
